/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.ballerina.toml.parser;

import org.antlr.v4.runtime.RuleContext;
import org.ballerina.toml.antlr4.TomlBaseListener;
import org.ballerina.toml.antlr4.TomlParser;
import org.ballerina.toml.model.Dependency;
import org.ballerina.toml.model.Manifest;
import org.ballerina.toml.model.fields.DependencyField;
import org.ballerina.toml.model.fields.PackageField;
import org.ballerina.toml.model.fields.Section;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Custom listener which is extended from the Toml listener with our own custom logic
 */
public class ManifestBuildListener extends TomlBaseListener {
    private final Manifest manifest;
    private Dependency dependency;
    private String currentHeader = null;
    private String currentKey = null;

    /**
     * Cosntructor with the manifest object
     * @param manifest manifest object
     */
    public ManifestBuildListener(Manifest manifest) {
        this.manifest = manifest;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterKeyval(TomlParser.KeyvalContext ctx) {
        currentKey = ctx.key().getText();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterString(TomlParser.StringContext ctx) {
        if (currentKey != null) {
            setToManifest(ctx.getText());
            currentKey = null;
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitKeyval(TomlParser.KeyvalContext ctx) {
        setDependancyAndPatches();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterArray(TomlParser.ArrayContext ctx) {
        if (currentKey != null) {
            addArrayElements(ctx.arrayValues());
            currentKey = null;
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterStdTable(TomlParser.StdTableContext ctx) {
        addHeader(ctx.key());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInlineTable(TomlParser.InlineTableContext ctx) {
        if (currentKey != null) {
            addInlineTableContent(ctx.inlineTableKeyvals());
            currentKey = null;
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does ncommentStartSymbol : HASH;
     * nonEol :  '\r'| '\t';
     * <p>
     * comment :  commentStartSymbol wsCommentNewline basicChar* nonEol*;othing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInlineTable(TomlParser.InlineTableContext ctx) {
        setDependancyAndPatches();
    }

    /**
     * Add the dependencies and patches to the manifest object
     */
    private void setDependancyAndPatches() {
        if (Section.DEPENDENCIES.stringEquals(currentHeader)) {
            this.manifest.addDependancy(dependency);
        } else if (Section.PATCHES.stringEquals(currentHeader)) {
            this.manifest.addPatches(dependency);
        }
    }

    /**
     * Add the key-value pairs specified in the toml file
     *
     * @param value KeyvalContext object
     */
    private void setToManifest(String value) {
        if (Section.PACKAGE.stringEquals(currentHeader)) {
            PackageField packageFieldField = PackageField.LOOKUP.get(currentKey);
            if (packageFieldField != null) {
                packageFieldField.setStringTo(this.manifest, value);
            }
        } else if (Section.DEPENDENCIES.stringEquals(currentHeader) || Section.PATCHES.stringEquals(currentHeader)) {
            DependencyField dependencyField = DependencyField.lookup.get(currentKey);
            if (dependencyField != null) {
                dependencyField.setValue(dependency, value);
            }
        }
    }

    /**
     * Add array elements to manifest object
     *
     * @param arrayValuesContext ArrayValuesContext object
     */
    private void addArrayElements(TomlParser.ArrayValuesContext arrayValuesContext) {
        PackageField packageFieldField = PackageField.LOOKUP.get(currentKey);
        if (packageFieldField != null) {
            List<String> arrayElements = new ArrayList<>();
            if (arrayValuesContext != null) {
                for (TomlParser.ArrayvalsNonEmptyContext valueContext : arrayValuesContext.arrayvalsNonEmpty()) {
                    arrayElements.add(valueContext.getText());
                }
            }
            packageFieldField.setListTo(this.manifest, arrayElements);
        }
    }

    /**
     * Add table headers in the toml file
     *
     * @param keyContextList list of keys specified in the header
     */
    public void addHeader(List<TomlParser.KeyContext> keyContextList) {
        currentHeader = keyContextList.get(0).getText();
        if (keyContextList.size() > 1) {
            String pkgName = keyContextList.stream().filter(i -> !i.getText().equals(currentHeader))
                    .map(RuleContext::getText).collect(Collectors.joining("."));
            createDependencyObject(pkgName);
        }
    }

    /**
     * Add inline table content specified
     *
     * @param ctx InlineTableKeyvalsContext object
     */
    public void addInlineTableContent(TomlParser.InlineTableKeyvalsContext ctx) {
        if (Section.DEPENDENCIES.stringEquals(currentHeader) || Section.PATCHES.stringEquals(currentHeader)) {
            createDependencyObject(currentKey);
            if (ctx != null) {
                for (TomlParser.InlineTableKeyvalsNonEmptyContext valueContext : ctx.inlineTableKeyvalsNonEmpty()) {
                    String name = valueContext.key().getText();
                    DependencyField dependencyField = DependencyField.lookup.get(name);
                    if (dependencyField != null) {
                        dependencyField.setValue(dependency, valueContext.val().getText());
                    }
                }
            }
        }
    }

    /**
     * Create dependency object and set the name
     * @param packageName pkg name of the dependency
     */
    public void createDependencyObject(String packageName) {
        dependency = new Dependency();
        DependencyField dependencyField = DependencyField.lookup.get("name");
        if (dependencyField != null) {
            dependencyField.setValue(dependency, packageName);
        }
    }
}

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
package org.ballerina.toml.parser.manager;

import org.ballerina.toml.parser.antlr4.TomlBaseListener;
import org.ballerina.toml.parser.antlr4.TomlParser;
import org.ballerina.toml.parser.model.Dependency;
import org.ballerina.toml.parser.model.DependencyField;
import org.ballerina.toml.parser.model.Headers;
import org.ballerina.toml.parser.model.Manifest;
import org.ballerina.toml.parser.model.PackageHeader;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Custom listener which is extended from the Toml listener with our own custom logic
 */
public class TomlCustomListener extends TomlBaseListener {
    private final Manifest manifest;
    private Dependency dependency;
    private String currentHeader;
    private String currentKey;

    public TomlCustomListener(Manifest context) {
        this.manifest = context;
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
        addKeyValPair(ctx);
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
        addArrayElements(ctx.arrayValues());
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
        addInlineTableContent(ctx.inlineTableKeyvals());
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
    public void setDependancyAndPatches() {
        if (currentHeader.contains(Headers.DEPENDENCIES.getValue())) {
            this.manifest.addDependancy(dependency);
        } else if (currentHeader.contains(Headers.PATCHES.getValue())) {
            this.manifest.addPatches(dependency);
        }
    }

    /**
     * Add the key-value pairs specified in the toml file
     *
     * @param ctx KeyvalContext object
     */
    public void addKeyValPair(TomlParser.KeyvalContext ctx) {
        if (currentHeader.equals(Headers.PACKAGE.getValue())) {
            PackageHeader packageHeaderField = PackageHeader.lookup.get(currentKey);
            if (packageHeaderField != null) {
                packageHeaderField.setValue(this.manifest, ctx);
            }
        } else if (currentHeader.equals(Headers.DEPENDENCIES.getValue()) ||
                currentHeader.equals(Headers.PATCHES.getValue())) {
            DependencyField dependencyField = DependencyField.lookup.get(currentKey);
            if (dependencyField != null) {
                dependencyField.setValue(dependency, ctx.val().getText());
            }
        }
    }

    /**
     * Add array elements to manifest object
     *
     * @param arrayValuesContext ArrayValuesContext object
     */
    public void addArrayElements(TomlParser.ArrayValuesContext arrayValuesContext) {
        PackageHeader packageHeaderField = PackageHeader.lookup.get(currentKey);
        if (packageHeaderField != null) {
            packageHeaderField.setValue(this.manifest, arrayValuesContext);
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
            dependency = new Dependency();
            String pkgName = keyContextList.stream().filter(i -> !i.getText().equals(currentHeader))
                    .map(i -> i.getText()).collect(Collectors.joining("."));
            // Add the package name
            DependencyField.get(DependencyField.NAME.getName()).setValue(dependency, pkgName);
        }
    }

    /**
     * Add inline table content specified
     *
     * @param ctx InlineTableKeyvalsContext object
     */
    public void addInlineTableContent(TomlParser.InlineTableKeyvalsContext ctx) {
        dependency = new Dependency();
        DependencyField.get(DependencyField.NAME.getName()).setValue(dependency, currentKey);
        if (ctx != null) {
            for (TomlParser.InlineTableKeyvalsNonEmptyContext valueContext : ctx.inlineTableKeyvalsNonEmpty()) {
                String name = valueContext.key().getText();
                DependencyField dependencyField = DependencyField.lookup.get(name);
                if (dependencyField != null) {
                    DependencyField.get(name).setValue(dependency, valueContext.val().getText());
                }
            }
        }
    }
}

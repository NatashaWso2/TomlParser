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
package org.ballerina.toml.parser.model;


import org.ballerina.toml.parser.antlr4.TomlParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Fields defined in the manifest "package" header
 */
public enum PackageHeaderField {
    NAME("name") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setName(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },
    VERSION("version") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setVersion(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    DESCRIPTION("description") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDescription(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    DOCUMENTATION("documentation") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDocumentationURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    HOMEPAGE("homepage") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setHomepageURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    REPOSITORY("repository") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setRepositoryURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    README("readme") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setReadmeFilePath(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    LICENSE("license") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setLicense(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    AUTHORS("authors") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {
            manifest.setAuthors(elementList);
        }
    },

    KEYWORDS("keywords") {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {
            manifest.setKeywords(elementList);
        }
    };

    public static final Map<String, PackageHeaderField> lookup = new HashMap<>();

    static {
        for (PackageHeaderField packageHeaderField : PackageHeaderField.values()) {
            lookup.put(packageHeaderField.getName(), packageHeaderField);
        }
    }

    private final String name;

    /**
     * Constructor
     *
     * @param name field name
     */
    PackageHeaderField(String name) {
        this.name = name;
    }

    /**
     * Get the PackageHeaderField related to the field name
     *
     * @param abbreviation
     * @return PackageHeaderField object
     */
    public static PackageHeaderField get(String abbreviation) {
        return lookup.get(abbreviation);
    }

    /**
     * Get field name
     *
     * @return field name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value to the manifest object
     *
     * @param manifest
     * @param ctx
     */
    public abstract void setValue(Manifest manifest, TomlParser.KeyvalContext ctx);

    /**
     * Set array elements to the manifest object
     *
     * @param manifest
     * @param elementList
     */
    public abstract void setArrayElements(Manifest manifest, List<String> elementList);
}

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


import org.antlr.v4.runtime.ParserRuleContext;
import org.ballerina.toml.parser.antlr4.TomlParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Fields defined in the manifest "package" header
 */
public enum PackageHeader {
    NAME("name") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setName(ctx.val().getText());
        }

    },
    VERSION("version") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setVersion(ctx.val().getText());
        }
    },

    DESCRIPTION("description") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDescription(ctx.val().getText());
        }
    },

    DOCUMENTATION("documentation") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDocumentationURL(ctx.val().getText());
        }
    },

    HOMEPAGE("homepage") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setHomepageURL(ctx.val().getText());
        }
    },

    REPOSITORY("repository") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setRepositoryURL(ctx.val().getText());
        }
    },

    README("readme") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setReadmeFilePath(ctx.val().getText());
        }
    },

    LICENSE("license") {
        @Override
        void setValueString(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setLicense(ctx.val().getText());
        }
    },

    AUTHORS("authors") {
        @Override
        void setValueArray(Manifest manifest, TomlParser.ArrayValuesContext ctx) {
            List<String> arrayElements = new ArrayList<>();
            for (TomlParser.ArrayvalsNonEmptyContext valueContext : ctx.arrayvalsNonEmpty()) {
                arrayElements.add(valueContext.getText());
            }
            manifest.setAuthors(arrayElements);
        }
    },

    KEYWORDS("keywords") {
        @Override
        void setValueArray(Manifest manifest, TomlParser.ArrayValuesContext ctx) {
            List<String> arrayElements = new ArrayList<>();
            for (TomlParser.ArrayvalsNonEmptyContext valueContext : ctx.arrayvalsNonEmpty()) {
                arrayElements.add(valueContext.getText());
            }
            manifest.setKeywords(arrayElements);
        }
    };

    public static final Map<String, PackageHeader> lookup = new HashMap<>();

    static {
        for (PackageHeader packageHeaderField : PackageHeader.values()) {
            lookup.put(packageHeaderField.getName(), packageHeaderField);
        }
    }

    private final String name;

    /**
     * Constructor
     *
     * @param name field name
     */
    PackageHeader(String name) {
        this.name = name;
    }

    /**
     * Get the PackageHeader related to the field name
     *
     * @param abbreviation
     * @return PackageHeader object
     */
    public static PackageHeader get(String abbreviation) {
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
     * Generic method to set the value based on whether its a single value or an array of elements
     */
    public void setValue(Manifest manifest, ParserRuleContext ctx) {
        if (ctx != null) {
            if (ctx instanceof TomlParser.KeyvalContext &&
                    !(((TomlParser.KeyvalContext) ctx).val().array() instanceof TomlParser.ArrayContext)) {
                setValueString(manifest, (TomlParser.KeyvalContext) ctx);
            } else if (ctx instanceof TomlParser.ArrayValuesContext) {
                setValueArray(manifest, (TomlParser.ArrayValuesContext) ctx);
            }
        }
    }

    /**
     * Set the value to the manifest object
     *
     * @param manifest
     * @param keyvalContext
     */
    void setValueString(Manifest manifest, TomlParser.KeyvalContext keyvalContext) {
        throw new UnsupportedOperationException("non array values are not supported");
    }

    /**
     * Set array elements to the manifest object
     *
     * @param manifest
     * @param arrayValuesContext
     */
    void setValueArray(Manifest manifest, TomlParser.ArrayValuesContext arrayValuesContext) {
        throw new UnsupportedOperationException("array values are not supported");
    }
}

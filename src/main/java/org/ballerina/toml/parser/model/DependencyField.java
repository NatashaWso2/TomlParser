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

import java.util.HashMap;
import java.util.Map;

/**
 * Dependency object fields
 */
public enum DependencyField {
    NAME("name") {
        @Override
        public void setValue(Dependency dependency, String value) {
            dependency.setPackageName(value);
        }
    },

    VERSION("version") {
        @Override
        public void setValue(Dependency dependency, String value) {
            dependency.setVersion(value);
        }
    },

    LOCATION("location") {
        @Override
        public void setValue(Dependency dependency, String value) {
            dependency.setLocation(value);
        }

    };

    public static final Map<String, DependencyField> lookup = new HashMap<>();

    static {
        for (DependencyField dependencyField : DependencyField.values()) {
            lookup.put(dependencyField.getName(), dependencyField);
        }
    }

    private final String name;

    /**
     * Constructor
     *
     * @param name field name
     */
    DependencyField(String name) {
        this.name = name;
    }

    /**
     * Get the DependencyField object related to the field name
     *
     * @param abbreviation
     * @return DependencyField object
     */
    public static DependencyField get(String abbreviation) {
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
     * Set values to the dependency object
     *
     * @param dependency
     * @param value
     */
    public abstract void setValue(Dependency dependency, String value);

}

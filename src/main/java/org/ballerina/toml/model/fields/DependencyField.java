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
package org.ballerina.toml.model.fields;

import org.ballerina.toml.model.Dependency;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Dependency object fields
 */
public enum DependencyField {
    NAME(Dependency::setPackageName),
    VERSION(Dependency::setVersion),
    LOCATION(Dependency::setLocation);

    public static final Map<String, DependencyField> lookup = new HashMap<>();

    /**
     *  Populate the map with the dependency fields and the their names
     */
    static {
        for (DependencyField dependencyField : DependencyField.values()) {
            lookup.put(dependencyField.name().toLowerCase(), dependencyField);
        }
    }

    private BiConsumer<Dependency, String> stringSetter;

    /**
     * Constructor which sets the string value
     *
     * @param stringSetter string value to be set
     */
    DependencyField(BiConsumer<Dependency, String> stringSetter) {
        this.stringSetter = stringSetter;
    }

    /**
     * Set values to the dependency object
     *
     * @param dependency
     * @param value
     */
    public void setValue(Dependency dependency, String value) {
        if (stringSetter != null) {
            stringSetter.accept(dependency, value);
        } else {
            throw new NullPointerException("String setter is null");
        }
    }

}
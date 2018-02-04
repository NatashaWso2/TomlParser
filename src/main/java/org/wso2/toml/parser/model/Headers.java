package org.wso2.toml.parser.model;


public enum Headers {
    PACKAGE("package"),
    DEPENDENCIES("dependencies"),
    PATCHES("patches");

    private String value;

    private Headers(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

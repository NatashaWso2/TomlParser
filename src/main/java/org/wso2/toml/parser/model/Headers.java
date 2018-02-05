package org.wso2.toml.parser.model;

/**
 * Headers defined in the toml file
 */
public enum Headers {
    PACKAGE("package"),
    DEPENDENCIES("dependencies"),
    PATCHES("patches");

    private String value;

    /**
     * Constructor
     * @param value
     */
    Headers(String value) {
        this.value = value;
    }

    /**
     * Get value of the toml headers
     * @return
     */
    public String getValue() {
        return value;
    }
}

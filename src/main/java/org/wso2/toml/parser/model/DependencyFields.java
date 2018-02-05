package org.wso2.toml.parser.model;

/**
 * Dependency object fields
 */
public enum DependencyFields {
    NAME {
        @Override
        public void setValue(Dependency dependency, String value) {
            dependency.setPackageName(value);
        }
    },

    VERSION {
        @Override
        public void setValue(Dependency dependency, String value) {
            dependency.setVersion(value);
        }
    },

    LOCATION {
        @Override
        public void setValue(Dependency dependency, String value) {
            dependency.setLocation(value);
        }

    };

    /**
     * Set values to the dependency object
     * @param dependency
     * @param value
     */
    public abstract void setValue(Dependency dependency, String value);

}

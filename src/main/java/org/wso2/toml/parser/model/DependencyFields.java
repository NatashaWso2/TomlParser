package org.wso2.toml.parser.model;


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

    public abstract void setValue(Dependency dependency, String value);

}

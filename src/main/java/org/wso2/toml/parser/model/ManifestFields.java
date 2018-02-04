package org.wso2.toml.parser.model;


import org.wso2.toml.parser.antlr4.TomlParser;

import java.util.List;

public enum ManifestFields {
    NAME {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setName(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    VERSION {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setVersion(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    DESCRIPTION {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDescription(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    DOCUMENTATION {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDocumentationURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    HOMEPAGE {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setHomepageURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    REPOSITORY {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setRepositoryURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    README {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setReadmeFilePath(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    LICENSE {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setLicense(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {

        }
    },

    AUTHORS {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {
            manifest.setAuthors(elementList);
        }
    },

    KEYWORDS {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
        }

        @Override
        public void setArrayElements(Manifest manifest, List<Object> elementList) {
            manifest.setKeywords(elementList);
        }
    };

    public abstract void setValue(Manifest manifest, TomlParser.KeyvalContext ctx);

    public abstract void setArrayElements(Manifest manifest, List<Object> elementList);
}

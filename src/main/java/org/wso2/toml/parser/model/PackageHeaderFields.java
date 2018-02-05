package org.wso2.toml.parser.model;


import org.wso2.toml.parser.antlr4.TomlParser;

import java.util.List;

/**
 * Fields defined in the manifest "package" header
 */
public enum PackageHeaderFields {
    NAME {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setName(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    VERSION {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setVersion(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    DESCRIPTION {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDescription(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    DOCUMENTATION {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setDocumentationURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    HOMEPAGE {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setHomepageURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    REPOSITORY {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setRepositoryURL(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    README {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setReadmeFilePath(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    LICENSE {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
            manifest.setLicense(ctx.val().getText());
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {

        }
    },

    AUTHORS {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {
            manifest.setAuthors(elementList);
        }
    },

    KEYWORDS {
        @Override
        public void setValue(Manifest manifest, TomlParser.KeyvalContext ctx) {
        }

        @Override
        public void setArrayElements(Manifest manifest, List<String> elementList) {
            manifest.setKeywords(elementList);
        }
    };

    /**
     * Set the value to the manifest object
     * @param manifest
     * @param ctx
     */
    public abstract void setValue(Manifest manifest, TomlParser.KeyvalContext ctx);

    /**
     * Set array elements to the manifest object
     * @param manifest
     * @param elementList
     */
    public abstract void setArrayElements(Manifest manifest, List<String> elementList);
}

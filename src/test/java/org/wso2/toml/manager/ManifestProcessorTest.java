package org.wso2.toml.manager;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.toml.parser.antlr4.TomlLexer;
import org.wso2.toml.parser.antlr4.TomlParser;
import org.wso2.toml.parser.manager.ManfiestProcessor;
import org.wso2.toml.parser.manager.TomlLoader;
import org.wso2.toml.parser.model.Manifest;

import java.io.IOException;

public class ManifestProcessorTest {
    static final String userDir = System.getProperty("user.dir");
    static final String resource_dir = userDir + "/src/test/resources/";

    @Test(description = "Package name in package section has an effect")
    public void testPackageName() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "#Name of the package \n name = \"org-name/string\"");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
    }

    @Test(description = "Attribute with single comment doesn't have an effect")
    public void testAttributeWithSingleComment() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "#Name of the package \n name = \"org-name/string\"");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
    }

    @Test(description = "Attribute with multiline comments doesn't have an effect")
    public void testAttributeWithMultilineComments() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "# Name of the package \n #This is the package congif section \n name = \"org-name/string\"");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
    }

    @Test(description = "Key with special characters in package section has no effect")
    public void testPackageNameWithSpecialCharacters() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "name-value = \"org-name/string\"");
        Assert.assertNotEquals(null, "\"org-name/string\"");
    }

    @Test(description = "Version in package section has an effect")
    public void testVersion() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package]\n" +
                "version = \"v1\"");
        Assert.assertEquals(manifest.getVersion(), "\"v1\"");
    }

    @Test(description = "Authors in package section has an effect")
    public void testAuthors() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "authors = [\"tyler@wso2.com\",\"manu@wso2.com\"]");
        Assert.assertEquals(manifest.getAuthors().get(0), "\"tyler@wso2.com\"");
        Assert.assertEquals(manifest.getAuthors().get(1), "\"manu@wso2.com\"");
    }

    @Test(description = "Description in package section has an effect")
    public void testDescription() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "description = \"This is a description about the package\"");
        Assert.assertEquals(manifest.getDescription(), "\"This is a description about the package\"");
    }

    @Test(description = "Documentation url in package section has an effect")
    public void testDocumentationURL() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n " +
                "documentation = \"https://ballerinalang.org/docs/api/0.95.5/\"");
        Assert.assertEquals(manifest.getDocumentationURL(), "\"https://ballerinalang.org/docs/api/0.95.5/\"");
    }

    @Test(description = "Homepage url in package section has an effect")
    public void testHomePageURL() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n " +
                "homepage = \"https://ballerinalang.org/\"");
        Assert.assertEquals(manifest.getHomepageURL(), "\"https://ballerinalang.org/\"");
    }

    @Test(description = "Repository url in package section has an effect")
    public void testRepositoryURL() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n " +
                "repository = \"https://github.com/ballerinalang/ballerina\"");
        Assert.assertEquals(manifest.getRepositoryURL(), "\"https://github.com/ballerinalang/ballerina\"");
    }

    @Test(description = "Version in non-package section has no effect")
    public void testVersionNeg() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[patch] \n version = \"v1\"");
        Assert.assertNotEquals(manifest.getVersion(), "\"v1\"");
    }

    @Test(description = "Location in package section has no effect")
    public void testLocationNeg() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n location = \"local\"");
        Assert.assertNotEquals(null, "\"local\"");
    }

    @Test(description = "Readme file path in package section has an effect")
    public void testReadmeFilePath() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n " +
                "readme = \"https://github.com/ballerinalang/composer/blob/master/README.md\"");
        Assert.assertEquals(manifest.getReadmeFilePath(), "\"https://github.com/ballerinalang/composer/blob" +
                "/master/README.md\"");
    }

    @Test(description = "Keywords in package section has an effect")
    public void testKeywords() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n" +
                "keywords=[\"ballerina\",\"security\",\"security\"]");
        Assert.assertEquals(manifest.getKeywords().get(0), "\"ballerina\"");
        Assert.assertEquals(manifest.getKeywords().get(1), "\"security\"");
        Assert.assertEquals(manifest.getKeywords().size(), 3);
    }

    @Test(description = "Description in package section has an effect")
    public void testLicenseDescription() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[package] \n " +
                "license = \"MIT OR Apache-2.0\"");
        Assert.assertEquals(manifest.getLicense(), "\"MIT OR Apache-2.0\"");
    }

    @Test(description = "One dependancy added to the dependancies section has an effect")
    public void testSingleDependancies() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[dependencies] \n " +
                "crates-io = { location = \"src/crates-io\",version = \"0.15\" } \n");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getLocation(), "\"src/crates-io\"");
    }

    @Test(description = "Multiple dependancies added to the dependancies section has an effect")
    public void testMultipleDependancies() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[dependencies] \n " +
                "crates-io = {location = \"src/crates-io\", version = \"0.15\" } \n " +
                "jquery = { version = \"2.23\" } \n");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(1).getPackageName(), "jquery");
        Assert.assertEquals(manifest.getDependencies().get(1).getVersion(), "\"2.23\"");
    }

    @Test(description = "One dependancy added to the dependancies section individually has an effect")
    public void testSingleDependanciesAddedIndividually() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[dependencies.crates.io] \n " +
                "version = \"0.15\" \n location = \"src/crates-io\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates.io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getLocation(), "\"src/crates-io\"");
    }

    @Test(description = "Multiple dependencies added to the dependancies section individually has an effect")
    public void testMultipleDependanciesAddedIndividually() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[dependencies.crates.io] \n " +
                "version = \"0.15\" \n location = \"src/crates-io\" \n [dependencies.jquery] \n " +
                "version = \"2.23\"");

        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates.io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getLocation(), "\"src/crates-io\"");

        Assert.assertEquals(manifest.getDependencies().get(1).getPackageName(), "jquery");
        Assert.assertEquals(manifest.getDependencies().get(1).getVersion(), "\"2.23\"");
        Assert.assertEquals(manifest.getDependencies().get(1).getLocation(), null);
    }

    @Test(description = "One patch added to the patches section has an effect")
    public void testSinglePatch() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[patches] \n " +
                "crates-io = {version = \"0.16.1\", location = \"src/patches/crates-io\" } \n");
        Assert.assertEquals(manifest.getPatches().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getPatches().get(0).getVersion(), "\"0.16.1\"");
        Assert.assertEquals(manifest.getPatches().get(0).getLocation(), "\"src/patches/crates-io\"");
    }

    @Test(description = "Multiple patches added to the patches section has an effect")
    public void testMultiplePatches() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[patches] \n " +
                "crates-io = {version = \"0.15.2\" } \n " +
                "jquery = { version = \"2.23.1\" } \n");
        Assert.assertEquals(manifest.getPatches().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getPatches().get(0).getVersion(), "\"0.15.2\"");
        Assert.assertEquals(manifest.getPatches().get(1).getPackageName(), "jquery");
        Assert.assertEquals(manifest.getPatches().get(1).getVersion(), "\"2.23.1\"");
    }

    @Test(description = "Dependencies added both ways i.e. individually and multiple dependencies together has" +
            "an effect")
    public void testMixtureOfDependencies() throws IOException {
        Manifest manifest = ManfiestProcessor.parseTomlContent("[dependencies.crates.io] \n " +
                "version = \"0.15\" \n location = \"src/crates-io\" \n [dependencies] \n " +
                "jquery = {version = \"2.23\"} \n react = {version = \"1.66\", location = \"npm-modules/react\"} \n" +
                "[dependencies.toml] \n version = \"0.4.5\" \n ");

        Assert.assertEquals(manifest.getDependencies().size(), 4);
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates.io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getLocation(), "\"src/crates-io\"");

        Assert.assertEquals(manifest.getDependencies().get(1).getPackageName(), "jquery");
        Assert.assertEquals(manifest.getDependencies().get(1).getVersion(), "\"2.23\"");
        Assert.assertEquals(manifest.getDependencies().get(1).getLocation(), null);

        Assert.assertEquals(manifest.getDependencies().get(2).getPackageName(), "react");
        Assert.assertEquals(manifest.getDependencies().get(2).getVersion(), "\"1.66\"");
        Assert.assertEquals(manifest.getDependencies().get(2).getLocation(), "\"npm-modules/react\"");

        Assert.assertEquals(manifest.getDependencies().get(3).getPackageName(), "toml");
        Assert.assertEquals(manifest.getDependencies().get(3).getVersion(), "\"0.4.5\"");
    }

    @Test(description = "Test which covers all the attributes tested above")
    public void testTomlFile() throws IOException {
        Manifest manifest = parseTomlContentFromFile(resource_dir + "example.toml");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
        Assert.assertEquals(manifest.getVersion(), "\"1.0.0\"");
        Assert.assertEquals(manifest.getDescription(), "\"This is a sample description which contains information\"");
        Assert.assertEquals(manifest.getDocumentationURL(), "\"https://ballerinalang.org/docs/api/0.95.5/\"");
        Assert.assertEquals(manifest.getHomepageURL(), "\"https://ballerinalang.org/\"");
        Assert.assertEquals(manifest.getRepositoryURL(), "\"https://github.com/ballerinalang/ballerina\"");
        Assert.assertEquals(manifest.getReadmeFilePath(), "\"https://github.com/ballerinalang/composer/blob/" +
                "master/README.md\"");
        Assert.assertEquals(manifest.getAuthors().get(0), "\"tyler@wso2.com\"");
        Assert.assertEquals(manifest.getAuthors().get(1), "\"manu@wso2.com\"");

        Assert.assertEquals(manifest.getKeywords().get(0), "\"ballerina\"");
        Assert.assertEquals(manifest.getKeywords().get(2), "\"crypto\"");
        Assert.assertEquals(manifest.getKeywords().size(), 3);

        Assert.assertEquals(manifest.getDependencies().size(), 6);
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "synchapi");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.9.2\"");

        Assert.assertEquals(manifest.getDependencies().get(1).getLocation(), "\"src/libc\"");
        Assert.assertEquals(manifest.getDependencies().get(1).getPackageName(), "libc");

        Assert.assertEquals(manifest.getDependencies().get(2).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getDependencies().get(3).getLocation(), null);

        Assert.assertEquals(manifest.getDependencies().get(4).getPackageName(), "toml");
        Assert.assertEquals(manifest.getDependencies().get(4).getVersion(), "\"0.4.6\"");

        Assert.assertEquals(manifest.getDependencies().get(5).getLocation(), "\"src/core/jobapi\"");
        Assert.assertEquals(manifest.getDependencies().get(5).getPackageName(), "jobapi.core");
    }

    public static Manifest parseTomlContentFromFile(String fileName) throws IOException {
        Manifest manifest = new Manifest();
        CharStream in = CharStreams.fromFileName(fileName);
        TomlLexer lexer = new TomlLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TomlParser parser = new TomlParser(tokens);
        ParseTree tree = parser.toml();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new TomlLoader(manifest), tree);
        return manifest;

    }
}

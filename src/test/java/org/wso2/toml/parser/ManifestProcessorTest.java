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
package org.wso2.toml.parser;

import org.ballerina.toml.parser.ManifestProcessor;
import org.ballerina.toml.model.Manifest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ManifestProcessorTest {
    @Test(description = "Package name in package section has an effect")
    public void testPackageName() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "#Name of the package \n name = \"org-name/string\"");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
    }

    @Test(description = "Attribute with single comment doesn't have an effect")
    public void testAttributeWithSingleComment() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "#Name of the package \n name = \"org-name/string\"");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
    }

    @Test(description = "Attribute with multiline comments doesn't have an effect")
    public void testAttributeWithMultilineComments() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "# Name of the package \n #This is the package congif section \n name = \"org-name/string\"");
        Assert.assertEquals(manifest.getName(), "\"org-name/string\"");
    }

    @Test(description = "Key with special characters in package section has no effect")
    public void testPackageNameWithSpecialCharacters() throws IOException {
        ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "name-value = \"org-name/string\"");
        Assert.assertNotEquals(null, "\"org-name/string\"");
    }

    @Test(description = "Version in package section has an effect")
    public void testVersion() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package]\n" +
                "version = \"v1\"");
        Assert.assertEquals(manifest.getVersion(), "\"v1\"");
    }

    @Test(description = "Authors in package section has an effect")
    public void testAuthors() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "authors = [\"tyler@wso2.com\", \"manu@wso2.com\"]");
        Assert.assertEquals(manifest.getAuthors().get(0), "\"tyler@wso2.com\"");
        Assert.assertEquals(manifest.getAuthors().get(1), "\"manu@wso2.com\"");
    }

    @Test(description = "Empty author array in package section has an effect")
    public void testEmptyAuthorArray() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "authors = []");
        Assert.assertEquals(manifest.getAuthors().size(), 0);
    }

    @Test(description = "Description in package section has an effect")
    public void testDescription() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "description = \"This is a description about the package\"");
        Assert.assertEquals(manifest.getDescription(), "\"This is a description about the package\"");
    }

    @Test(description = "Documentation url in package section has an effect")
    public void testDocumentationURL() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n " +
                "documentation = \"https://ballerinalang.org/docs/api/0.95.5/\"");
        Assert.assertEquals(manifest.getDocumentationURL(), "\"https://ballerinalang.org/docs/api/0.95.5/\"");
    }

    @Test(description = "Homepage url in package section has an effect")
    public void testHomePageURL() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n " +
                "homepage = \"https://ballerinalang.org/\"");
        Assert.assertEquals(manifest.getHomepageURL(), "\"https://ballerinalang.org/\"");
    }

    @Test(description = "Repository url in package section has an effect")
    public void testRepositoryURL() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n " +
                "repository = \"https://github.com/ballerinalang/ballerina\"");
        Assert.assertEquals(manifest.getRepositoryURL(), "\"https://github.com/ballerinalang/ballerina\"");
    }

    @Test(description = "Version in non-package section has no effect")
    public void testVersionNeg() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[patch] \n version = \"v1\"");
        Assert.assertNotEquals(manifest.getVersion(), "\"v1\"");
    }

    @Test(description = "Location in package section has no effect")
    public void testLocationNeg() throws IOException {
        ManifestProcessor.parseTomlContentFromString("[package] \n location = \"local\"");
        Assert.assertNotEquals(null, "\"local\"");
    }

    @Test(description = "Readme file path in package section has an effect")
    public void testReadmeFilePath() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n " +
                "readme = \"https://github.com/ballerinalang/composer/blob/master/README.md\"");
        Assert.assertEquals(manifest.getReadmeFilePath(), "\"https://github.com/ballerinalang/composer/blob" +
                "/master/README.md\"");
    }

    @Test(description = "Keywords in package section has an effect")
    public void testKeywords() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n" +
                "keywords=[\"ballerina\",\"security\",\"security\"]");
        Assert.assertEquals(manifest.getKeywords().get(0), "\"ballerina\"");
        Assert.assertEquals(manifest.getKeywords().get(1), "\"security\"");
        Assert.assertEquals(manifest.getKeywords().size(), 3);
    }

    @Test(description = "Description in package section has an effect")
    public void testLicenseDescription() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[package] \n " +
                "license = \"MIT OR Apache-2.0\"");
        Assert.assertEquals(manifest.getLicense(), "\"MIT OR Apache-2.0\"");
    }

    @Test(description = "One dependancy added to the dependancies section has an effect")
    public void testSingleDependancies() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies] \n " +
                "crates-io = {location = \"src/crates-io\", version = \"0.15\"} \n");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getLocation(), "\"src/crates-io\"");
    }

    @Test(description = "Empty dependancy added to the dependancies section has no effect")
    public void testSingleEmptyDependancies() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies] \n " +
                "crates-io = {} \n");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates-io");
    }

    @Test(description = "Multiple dependancies added to the dependancies section has an effect")
    public void testMultipleDependancies() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies] \n " +
                "crates-io = {location = \"src/crates-io\", version = \"0.15\" } \n " +
                "jquery = { version = \"2.23\" } \n");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(1).getPackageName(), "jquery");
        Assert.assertEquals(manifest.getDependencies().get(1).getVersion(), "\"2.23\"");
    }

    @Test(description = "One dependancy added to the dependancies section individually has an effect")
    public void testSingleDependanciesAddedIndividually() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies.crates.io] \n " +
                "version = \"0.15\" \n location = \"src/crates-io\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates.io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(0).getLocation(), "\"src/crates-io\"");
    }

    @Test(description = "Multiple dependencies added to the dependancies section individually has an effect")
    public void testMultipleDependanciesAddedIndividually() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies.crates.io] \n " +
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
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[patches] \n " +
                "crates-io = {version = \"0.16.1\", location = \"src/patches/crates-io\" } \n");
        Assert.assertEquals(manifest.getPatches().get(0).getPackageName(), "crates-io");
        Assert.assertEquals(manifest.getPatches().get(0).getVersion(), "\"0.16.1\"");
        Assert.assertEquals(manifest.getPatches().get(0).getLocation(), "\"src/patches/crates-io\"");
    }

    @Test(description = "Multiple patches added to the patches section has an effect")
    public void testMultiplePatches() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[patches] \n " +
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
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies.crates.io] \n " +
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

    @Test(description = "Dependencies and patches added together has an effect")
    public void testDependenciesAndPatches() throws IOException {
        Manifest manifest = ManifestProcessor.parseTomlContentFromString("[dependencies.crates.io] \n " +
                "version = \"0.15\" \n location = \"src/crates-io\" \n [patches] \n jobapi = {version = \"2.23\"} \n " +
                " [dependencies] \n jquery = {version = \"2.23\"} \n react = {version = \"1.66\", " +
                "location = \"npm-modules/react\"} \n [patches.toml] \n version = \"0.4.5\" \n");

        Assert.assertEquals(manifest.getDependencies().size(), 3);
        Assert.assertEquals(manifest.getPatches().size(), 2);

        Assert.assertEquals(manifest.getDependencies().get(0).getPackageName(), "crates.io");
        Assert.assertEquals(manifest.getDependencies().get(0).getVersion(), "\"0.15\"");
        Assert.assertEquals(manifest.getDependencies().get(1).getPackageName(), "jquery");
        Assert.assertEquals(manifest.getDependencies().get(2).getVersion(), "\"1.66\"");

        Assert.assertEquals(manifest.getPatches().get(0).getPackageName(), "jobapi");
        Assert.assertEquals(manifest.getPatches().get(1).getPackageName(), "toml");

    }
}

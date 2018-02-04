package org.wso2.toml.parser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manifest {
    private String name;
    private String version;
    private List<Object> authors;
    private List<Object> keywords;
    private String documentationURL;
    private String homepageURL;
    private String repositoryURL;
    private String description;
    private String readmeFilePath;
    private String license;
    private List<Dependency> dependencies = new ArrayList<>();
    private List<Dependency> patches = new ArrayList<>();

    public List<Dependency> getPatches() {
        return patches;
    }

    public void setPatches(ArrayList<Dependency> patches) {
        this.patches = patches;
    }

    public void addPatches(Dependency dependency) {
        this.patches.add(dependency);
        patches = removeDuplicates(patches);
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(ArrayList<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public void addDependancy(Dependency dependency) {
        this.dependencies.add(dependency);
        dependencies = removeDuplicates(dependencies);
    }

    public List<Object> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

    public String getReadmeFilePath() {
        return readmeFilePath;
    }

    public void setReadmeFilePath(String readmeFilePath) {
        this.readmeFilePath = readmeFilePath;
    }

    public String getDocumentationURL() {
        return documentationURL;
    }

    public void setDocumentationURL(String documentationURL) {
        this.documentationURL = documentationURL;
    }

    public String getHomepageURL() {
        return homepageURL;
    }

    public void setHomepageURL(String homepageURL) {
        this.homepageURL = homepageURL;
    }

    public String getRepositoryURL() {
        return repositoryURL;
    }

    public void setRepositoryURL(String repositoryURL) {
        this.repositoryURL = repositoryURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Object> arrayElements) {
        this.authors = arrayElements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public List<Dependency> removeDuplicates(List<Dependency> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
}

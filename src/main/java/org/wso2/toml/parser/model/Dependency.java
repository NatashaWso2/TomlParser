package org.wso2.toml.parser.model;

/**
 * Defines dependency object fields. The same object will be used to define patches
 */
public class Dependency {
    private String packageName;
    private String version;
    private String location;

    /**
     * Get the package name
     * @return package name
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Set the package name
     * @param packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * Get version of the dependency
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * Set the version of the dependency
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Get the path/location of the dependency
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set the path/location of the dependency
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
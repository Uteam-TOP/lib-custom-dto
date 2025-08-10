package ru.fvds.cdss13.lib.dto;

public enum ImageDir {
    USER("user"),
    HACKATHON("hackathon"),
    POST("post"),
    PROJECT_AVATAR("project/avatar"),
    PROJECT_HEADER("project/header");

    String dir;

    ImageDir(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }
}

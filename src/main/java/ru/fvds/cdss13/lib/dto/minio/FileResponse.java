package ru.fvds.cdss13.lib.dto.minio;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FileResponse {

    private String message;

    private String path;

    @JsonProperty("public_url")
    private String publicUrl;

    public FileResponse(String message, String path, String publicUrl) {
        this.message = message;
        this.path = path;
        this.publicUrl = publicUrl;
    }

    public FileResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }
}

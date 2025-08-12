package ru.fvds.cdss13.lib.dto.utilmicroservice;


public class NewResumeNotificationDto {
    private String id;
    private String username;

    public NewResumeNotificationDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

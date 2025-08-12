package ru.fvds.cdss13.lib.dto.utilmicroservice;


public class NewVacancyNotificationDto {
    private String id;
    private String title;

    public NewVacancyNotificationDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

package ru.fvds.cdss13.lib.dto;

import ru.fvds.cdss13.lib.dto.project.ProjectType;

import java.time.OffsetDateTime;

public class HackathonProjectDto {

    private Long id;
    private String nickname;
    private String telegram;
    private String email;

    /**
     * Название проекта
     */
    private String title;

    /**
     * Краткое описание
     */
    private String summary;
    private String description;

    /**
     * Этап развития
     */
    private String developmentStage;

    private String tasks;
    private ProjectType type;

    private String avatarLink;

    private String headerLink;

    private int likesCount;

    private OffsetDateTime createdAt;


    private HackathonDto hackathon;

    public HackathonProjectDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDevelopmentStage() {
        return developmentStage;
    }

    public void setDevelopmentStage(String developmentStage) {
        this.developmentStage = developmentStage;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public String getHeaderLink() {
        return headerLink;
    }

    public void setHeaderLink(String headerLink) {
        this.headerLink = headerLink;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public HackathonDto getHackathon() {
        return hackathon;
    }

    public void setHackathon(HackathonDto hackathon) {
        this.hackathon = hackathon;
    }
}

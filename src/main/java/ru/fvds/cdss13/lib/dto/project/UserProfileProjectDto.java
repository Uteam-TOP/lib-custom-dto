package ru.fvds.cdss13.lib.dto.project;


import java.time.OffsetDateTime;

public class UserProfileProjectDto {
    /**
     * ид проекта
     */
    private Long id;//
    /**
     * nickname проекта
     */
    private String nickname;
    /**
     * title проекта
     */
    private String title;
    /**
     * ???????????????????
     */
    private Long userId;
    /**
     *
     */
    private String userProfession;
    private OffsetDateTime createdAt;
    private boolean isOwner;

    public UserProfileProjectDto() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserProfession() {
        return userProfession;
    }

    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }
}

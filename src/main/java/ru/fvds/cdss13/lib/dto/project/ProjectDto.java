package ru.fvds.cdss13.lib.dto.project;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import ru.fvds.cdss13.lib.dto.ad.AdDto;
import ru.fvds.cdss13.lib.dto.city.CityDto;
import ru.fvds.cdss13.lib.dto.teammember.TeamMemberDto;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.List;


public class ProjectDto {

    private Long id;

    @Size(min = 2, max = 32)
    private String nickname;

    @Size(min = 2, max = 32)
    private String telegram;

    @Email
    private String email;

    @Size(max = 200)
    private String title;

    @Size(max = 300)
    private String summary;

    @Size(max = 1500)
    private String description;

    @Size(max = 1500)
    private String developmentStage;

    @Size(max = 1500)
    private String tasks;

    private ProjectType type;

    @Size(max = 200)
    private String avatarLink;

    @Size(max = 200)
    private String headerLink;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int likesCount;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private boolean userLike;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime createdAt;

    @Valid
    private List<AdDto> vacancies;

    @Valid
    private UserDto owner;

    @Valid
    private List<TeamMemberDto> team;

    @Valid
    private CityDto city;

    public ProjectDto() {
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

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<AdDto> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<AdDto> vacancies) {
        this.vacancies = vacancies;
    }

    public UserDto getOwner() {
        return owner;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }

    public List<TeamMemberDto> getTeam() {
        return team;
    }

    public void setTeam(List<TeamMemberDto> team) {
        this.team = team;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }
}

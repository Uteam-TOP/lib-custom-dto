package ru.fvds.cdss13.lib.dto.ad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import ru.fvds.cdss13.lib.dto.project.ProjectDto;
import ru.fvds.cdss13.lib.dto.tag.TagDto;
import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;


public class AdDto {

    private Long id;

    @NotBlank
    private String title;

    @Valid
    private UserDto user;

    @Valid
    @NotNull
    private TagDto profession;

    @Valid
    @NotNull
    private Set<TagDto> skills;

    @Valid
    @NotNull
    private Set<TagDto> motivations;

    private Integer minPayment;

    @Size(max = 700)
    private String details;

    private VisibilityLevel visibility;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OffsetDateTime creationDate;

    private String banReason;

    @JsonIgnore
    private AdType type;

    private ProjectDto projectDto;

    @JsonIgnore
    public Set<TagDto> getTags() {
        Set<TagDto> tags = new HashSet<>(skills);
        tags.add(profession);
        tags.addAll(motivations);
        return tags;
    }

    public AdDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public TagDto getProfession() {
        return profession;
    }

    public void setProfession(TagDto profession) {
        this.profession = profession;
    }

    public Set<TagDto> getSkills() {
        return skills;
    }

    public void setSkills(Set<TagDto> skills) {
        this.skills = skills;
    }

    public Set<TagDto> getMotivations() {
        return motivations;
    }

    public void setMotivations(Set<TagDto> motivations) {
        this.motivations = motivations;
    }

    public Integer getMinPayment() {
        return minPayment;
    }

    public void setMinPayment(Integer minPayment) {
        this.minPayment = minPayment;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public VisibilityLevel getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityLevel visibility) {
        this.visibility = visibility;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getBanReason() {
        return banReason;
    }

    public void setBanReason(String banReason) {
        this.banReason = banReason;
    }

    public ProjectDto getProjectDto() {
        return projectDto;
    }

    public void setProjectDto(ProjectDto projectDto) {
        this.projectDto = projectDto;
    }

    public AdType getAdType() {
        return type;
    }

    public void setAdType(AdType type) {
        this.type = type;
    }

    public AdDto(AdType type) {
        this.type = type;
    }
}

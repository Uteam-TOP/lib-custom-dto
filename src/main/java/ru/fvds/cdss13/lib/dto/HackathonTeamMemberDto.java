package ru.fvds.cdss13.lib.dto;

import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;


public class HackathonTeamMemberDto {

    private Long id;
    private HackathonUserRole hackathonUserRole;
    private Long hackathonId;
    private HackathonProjectDto hackathonProject;
    private UserDto user;
    private OffsetDateTime createdAt;

    public HackathonTeamMemberDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HackathonProjectDto getHackathonProject() {
        return hackathonProject;
    }

    public void setHackathonProject(HackathonProjectDto hackathonProject) {
        this.hackathonProject = hackathonProject;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public HackathonUserRole getHackathonUserRole() {
        return hackathonUserRole;
    }

    public void setHackathonUserRole(HackathonUserRole hackathonUserRole) {
        this.hackathonUserRole = hackathonUserRole;
    }

    public Long getHackathonId() {
        return hackathonId;
    }

    public void setHackathonId(Long hackathonId) {
        this.hackathonId = hackathonId;
    }
}
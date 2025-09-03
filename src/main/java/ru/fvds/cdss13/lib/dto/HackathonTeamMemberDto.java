package ru.fvds.cdss13.lib.dto;

import java.time.OffsetDateTime;


public class HackathonTeamMemberDto {

    private Long id;
    private HackathonProjectDto hackathonProject;
    private HackathonUsertDto hackathonUser;
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

    public HackathonUsertDto getHackathonUser() {
        return hackathonUser;
    }

    public void setHackathonUser(HackathonUsertDto hackathonUser) {
        this.hackathonUser = hackathonUser;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
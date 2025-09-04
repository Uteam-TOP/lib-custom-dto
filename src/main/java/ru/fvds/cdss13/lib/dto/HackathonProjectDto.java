package ru.fvds.cdss13.lib.dto;

import ru.fvds.cdss13.lib.dto.project.ProjectDto;

import java.time.OffsetDateTime;

public class HackathonProjectDto {

    private Long id;
    private HackathonProjectStatus hackathonProjectStatus;
    private HackathonDto hackathon;
    private ProjectDto project;
    private OffsetDateTime createdAt;




    public HackathonProjectDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
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

package ru.fvds.cdss13.lib.dto;

import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;


public class HackathonParticipantDto {

    private Long id;
    private String profession;
    private HackathonDto hackathon;
    private UserDto userEntity;
    private ParticipantStatus status;
    private OffsetDateTime createdAt;

    public HackathonParticipantDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public HackathonDto getHackathon() {
        return hackathon;
    }

    public void setHackathon(HackathonDto hackathon) {
        this.hackathon = hackathon;
    }

    public UserDto getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserDto userEntity) {
        this.userEntity = userEntity;
    }

    public ParticipantStatus getStatus() {
        return status;
    }

    public void setStatus(ParticipantStatus status) {
        this.status = status;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
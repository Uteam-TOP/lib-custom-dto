package ru.fvds.cdss13.lib.dto;

import java.time.OffsetDateTime;


public class HackathonTeamMemberDto {

    private Long id;
    private HackathonTeamDto team;
    private HackathonParticipantDto participant;
    private OffsetDateTime createdAt;

    public HackathonTeamMemberDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HackathonTeamDto getTeam() {
        return team;
    }

    public void setTeam(HackathonTeamDto team) {
        this.team = team;
    }

    public HackathonParticipantDto getParticipant() {
        return participant;
    }

    public void setParticipant(HackathonParticipantDto participant) {
        this.participant = participant;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
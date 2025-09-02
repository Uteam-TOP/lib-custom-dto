package ru.fvds.cdss13.lib.dto;

import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;


public class HackathonTeamDto {

    private Long id;
    private HackathonDto hackathon;
    private String nickname;
    private Integer participantCount;
    private String avatarLink;
    private TeamStatus status;
    private UserDto leader;
    private OffsetDateTime createdAt;

    public HackathonTeamDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HackathonDto getHackathon() {
        return hackathon;
    }

    public void setHackathon(HackathonDto hackathon) {
        this.hackathon = hackathon;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public TeamStatus getStatus() {
        return status;
    }

    public void setStatus(TeamStatus status) {
        this.status = status;
    }

    public UserDto getLeader() {
        return leader;
    }

    public void setLeader(UserDto leader) {
        this.leader = leader;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
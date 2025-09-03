package ru.fvds.cdss13.lib.dto;

import ru.fvds.cdss13.lib.dto.user.UserDto;

import java.time.OffsetDateTime;

public class HackathonUsertDto {

    private Long id;
    private HackathonUserRole hackathonUserRole;
    private HackathonDto hackathon;
    private UserDto user;
    private OffsetDateTime dateOfRegistration;

    public HackathonUsertDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HackathonUserRole getHackathonUserRole() {
        return hackathonUserRole;
    }

    public void setHackathonUserRole(HackathonUserRole hackathonUserRole) {
        this.hackathonUserRole = hackathonUserRole;
    }

    public HackathonDto getHackathon() {
        return hackathon;
    }

    public void setHackathon(HackathonDto hackathon) {
        this.hackathon = hackathon;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public OffsetDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(OffsetDateTime dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}

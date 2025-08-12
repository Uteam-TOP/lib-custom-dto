package ru.fvds.cdss13.lib.dto;



/**
 * NominationDto
 */

public class NominationDto {

  private Long id;
  private String name;
  private String description;
  private String place;
  private HackathonDto hackathon;
  private TeamDto hackathonTeam;

  public NominationDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public HackathonDto getHackathon() {
    return hackathon;
  }

  public void setHackathon(HackathonDto hackathon) {
    this.hackathon = hackathon;
  }

  public TeamDto getHackathonTeam() {
    return hackathonTeam;
  }

  public void setHackathonTeam(TeamDto hackathonTeam) {
    this.hackathonTeam = hackathonTeam;
  }
}


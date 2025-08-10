package ru.fvds.cdss13.lib.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * NominationDto
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NominationDto {

  private Long id;
  private String name;
  private String description;
  private String place;
  private HackathonDto hackathon;
  private TeamDto hackathonTeam;
}


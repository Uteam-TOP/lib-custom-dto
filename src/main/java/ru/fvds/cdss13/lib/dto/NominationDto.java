package ru.fvds.cdss13.lib.dto;


import lombok.*;

/**
 * NominationDto
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class NominationDto {

  private Long id;
  private String name;
  private String description;
  private String place;
  private HackathonDto hackathon;
  private TeamDto hackathonTeam;
}


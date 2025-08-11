package ru.fvds.cdss13.lib.dto.teammember;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TeamWithApplicationsCountDto {
    private List<TeamMemberDto> team;
    private int applicationsCount;
}

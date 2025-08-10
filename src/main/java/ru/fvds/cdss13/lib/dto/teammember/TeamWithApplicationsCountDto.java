package ru.fvds.cdss13.lib.dto.teammember;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamWithApplicationsCountDto {
    private List<TeamMemberDto> team;
    private int applicationsCount;
}

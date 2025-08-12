package ru.fvds.cdss13.lib.dto.teammember;


import java.util.List;

public class TeamWithApplicationsCountDto {
    private List<TeamMemberDto> team;
    private int applicationsCount;

    public TeamWithApplicationsCountDto() {
    }

    public List<TeamMemberDto> getTeam() {
        return team;
    }

    public void setTeam(List<TeamMemberDto> team) {
        this.team = team;
    }

    public int getApplicationsCount() {
        return applicationsCount;
    }

    public void setApplicationsCount(int applicationsCount) {
        this.applicationsCount = applicationsCount;
    }
}

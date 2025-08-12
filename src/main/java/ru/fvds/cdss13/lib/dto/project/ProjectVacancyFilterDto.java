package ru.fvds.cdss13.lib.dto.project;



import ru.fvds.cdss13.lib.dto.ad.VisibilityLevel;

import java.util.Set;





public class ProjectVacancyFilterDto {

    private Set<VisibilityLevel> visibilities;
    private Boolean vacancyOwnerBanned;

    public ProjectVacancyFilterDto() {
    }

    public Set<VisibilityLevel> getVisibilities() {
        return visibilities;
    }

    public void setVisibilities(Set<VisibilityLevel> visibilities) {
        this.visibilities = visibilities;
    }

    public Boolean getVacancyOwnerBanned() {
        return vacancyOwnerBanned;
    }

    public void setVacancyOwnerBanned(Boolean vacancyOwnerBanned) {
        this.vacancyOwnerBanned = vacancyOwnerBanned;
    }
}

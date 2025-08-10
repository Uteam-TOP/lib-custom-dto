package ru.fvds.cdss13.lib.dto.project;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.fvds.cdss13.lib.dto.ad.VisibilityLevel;

import java.util.Set;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectVacancyFilterDto {

    private Set<VisibilityLevel> visibilities;
    private Boolean vacancyOwnerBanned;


}

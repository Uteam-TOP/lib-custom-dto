package ru.fvds.cdss13.lib.dto.project;


import lombok.*;
import ru.fvds.cdss13.lib.dto.ad.VisibilityLevel;

import java.util.Set;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProjectVacancyFilterDto {

    private Set<VisibilityLevel> visibilities;
    private Boolean vacancyOwnerBanned;


}

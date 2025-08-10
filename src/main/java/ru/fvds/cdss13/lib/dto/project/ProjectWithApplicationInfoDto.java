package ru.fvds.cdss13.lib.dto.project;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ProjectWithApplicationInfoDto extends ProjectDto {
    private boolean currentUserAppliedToProject;
    private String currentUserApplicationProfession;
}

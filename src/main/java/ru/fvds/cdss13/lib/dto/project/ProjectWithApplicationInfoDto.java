package ru.fvds.cdss13.lib.dto.project;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Setter
@Getter
public class ProjectWithApplicationInfoDto extends ProjectDto {
    private boolean currentUserAppliedToProject;
    private String currentUserApplicationProfession;
}

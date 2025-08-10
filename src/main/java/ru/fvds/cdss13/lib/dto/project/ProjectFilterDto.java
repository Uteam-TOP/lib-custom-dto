package ru.fvds.cdss13.lib.dto.project;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectFilterDto {
    private ProjectType type;
    private Long cityId;


}

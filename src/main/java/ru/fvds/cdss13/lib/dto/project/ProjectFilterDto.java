package ru.fvds.cdss13.lib.dto.project;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Setter
@Getter
public class ProjectFilterDto {
    private ProjectType type;
    private Long cityId;


}

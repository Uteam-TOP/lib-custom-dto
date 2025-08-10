package ru.fvds.cdss13.lib.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants(innerTypeName = "F")
public class AdditionalUserInfoDto {
    private int numberOfResumes;
    private int numberOfVacancies;
}

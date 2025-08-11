package ru.fvds.cdss13.lib.dto.user;

import lombok.*;
import lombok.experimental.FieldNameConstants;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AdditionalUserInfoDto {
    private int numberOfResumes;
    private int numberOfVacancies;
}

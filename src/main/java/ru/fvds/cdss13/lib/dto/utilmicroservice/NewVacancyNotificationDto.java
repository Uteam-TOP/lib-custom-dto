package ru.fvds.cdss13.lib.dto.utilmicroservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewVacancyNotificationDto {
    private String id;
    private String title;
}

package ru.fvds.cdss13.lib.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PageableDto {
    private int number;
    private int size;
}


package ru.fvds.cdss13.lib.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PageDto<T> {
    private List<T> data;
    private long total;


}

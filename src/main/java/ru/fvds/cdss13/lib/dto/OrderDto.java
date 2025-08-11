package ru.fvds.cdss13.lib.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderDto {

    private String path;

    private boolean desc;

    /**
     * @param sortString например: "user.age_desc" или "user.age", по умолчанию сортировка asc
     */
    public OrderDto(String sortString) {
        String[] pathAndDirection = sortString.strip().split("_");
        this.path = pathAndDirection[0];
        this.desc = pathAndDirection.length > 1 && pathAndDirection[1].equalsIgnoreCase("desc");
    }

    public static List<OrderDto> listOf(List<String> sortStrings) {
        return sortStrings.stream().map(OrderDto::new).toList();
    }
}

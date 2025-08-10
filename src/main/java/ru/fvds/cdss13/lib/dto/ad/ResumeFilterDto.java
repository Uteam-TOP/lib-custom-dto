package ru.fvds.cdss13.lib.dto.ad;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ResumeFilterDto extends AdFilterDto {

    @Override
    public AdType getAdType() {
        return AdType.RESUME;
    }
}

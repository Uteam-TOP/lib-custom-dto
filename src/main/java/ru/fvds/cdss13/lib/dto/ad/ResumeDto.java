package ru.fvds.cdss13.lib.dto.ad;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResumeDto extends AdDto {



    @Override
    public AdType getAdType() {
        return AdType.RESUME;
    }
}

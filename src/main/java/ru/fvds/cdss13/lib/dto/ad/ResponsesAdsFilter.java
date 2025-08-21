package ru.fvds.cdss13.lib.dto.ad;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.data.domain.Pageable;

import java.util.List;


public class ResponsesAdsFilter {

    private AdFilterDto adFilterDto;
    private AdType adType;
    private Pageable pageable;

    private List<AdDto> dtos;

    public ResponsesAdsFilter(List<AdDto> dtos) {
        this.dtos = dtos;
    }

    public ResponsesAdsFilter(AdFilterDto adFilterDto, List<AdDto> dtos) {
        this.adFilterDto = adFilterDto;
        this.dtos = dtos;
    }

    public ResponsesAdsFilter(AdFilterDto adFilterDto, Pageable pageable, List<AdDto> dtos) {
        this.adFilterDto = adFilterDto;
        this.pageable = pageable;
        this.dtos = dtos;
    }

    public ResponsesAdsFilter(AdFilterDto adFilterDto, AdType adType, Pageable pageable) {
        this.adFilterDto = adFilterDto;
        this.adType = adType;
        this.pageable = pageable;
    }

    public ResponsesAdsFilter(AdFilterDto adFilterDto, Pageable pageable) {
        this.adFilterDto = adFilterDto;
        this.pageable = pageable;
    }

    public ResponsesAdsFilter() {
    }

    public List<AdDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<AdDto> dtos) {
        this.dtos = dtos;
    }



    public AdType getAdType() {
        return adType;
    }

    public void setAdType(AdType adType) {
        this.adType = adType;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public AdFilterDto getAdFilterDto() {
        return adFilterDto;
    }

    public void setAdFilterDto(AdFilterDto adFilterDto) {
        this.adFilterDto = adFilterDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesAdsFilter that = (ResponsesAdsFilter) o;

        if (!adFilterDto.equals(that.adFilterDto)) return false;
        if (adType != that.adType) return false;
        if (!pageable.equals(that.pageable)) return false;
        return dtos.equals(that.dtos);
    }

    @Override
    public int hashCode() {
        int result = adFilterDto.hashCode();
        result = 31 * result + adType.hashCode();
        result = 31 * result + pageable.hashCode();
        result = 31 * result + dtos.hashCode();
        return result;
    }
}

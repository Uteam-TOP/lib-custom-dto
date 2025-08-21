package ru.fvds.cdss13.lib.dto.ad;


import org.springframework.data.domain.Pageable;

import java.util.List;


public class ResponsesAds {

    private Long userId;
    private AdType adType;
    private Pageable pageable;

    private List<AdDto> dtos;

    public ResponsesAds(List<AdDto> dtos) {
        this.dtos = dtos;
    }

    public ResponsesAds(Long userId, List<AdDto> dtos) {
        this.userId = userId;
        this.dtos = dtos;
    }

    public ResponsesAds(Long userId, Pageable pageable, List<AdDto> dtos) {
        this.userId = userId;
        this.pageable = pageable;
        this.dtos = dtos;
    }

    public ResponsesAds(Long userId, AdType adType, Pageable pageable) {
        this.userId = userId;
        this.adType = adType;
        this.pageable = pageable;
    }

    public ResponsesAds(Long userId, Pageable pageable) {
        this.userId = userId;
        this.pageable = pageable;
    }

    public ResponsesAds() {
    }

    public List<AdDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<AdDto> dtos) {
        this.dtos = dtos;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesAds that = (ResponsesAds) o;

        if (!userId.equals(that.userId)) return false;
        return adType == that.adType;
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + adType.hashCode();
        return result;
    }
}

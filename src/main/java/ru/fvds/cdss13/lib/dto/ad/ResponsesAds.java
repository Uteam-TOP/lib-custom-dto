package ru.fvds.cdss13.lib.dto.ad;



import java.awt.print.Pageable;
import java.util.List;

public class ResponsesAds {

    private Long userId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesAds that = (ResponsesAds) o;

        if (!userId.equals(that.userId)) return false;
        return dtos.equals(that.dtos);
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + dtos.hashCode();
        return result;
    }
}

package ru.fvds.cdss13.lib.dto.ad;



import java.util.List;

public class ResponsesAds {

    private Long userId;

    private List<AdDto> dtos;

    public ResponsesAds(List<AdDto> dtos) {
        this.dtos = dtos;
    }

    public ResponsesAds(Long userId, List<AdDto> dtos) {
        this.userId = userId;
        this.dtos = dtos;
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

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + dtos.hashCode();
        return result;
    }
}

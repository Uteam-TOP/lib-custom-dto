package ru.fvds.cdss13.lib.dto.ad;



import java.util.List;

public class ResponsesAds {

    private List<AdDto> dtos;

    public ResponsesAds(List<AdDto> dtos) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesAds that = (ResponsesAds) o;

        return dtos.equals(that.dtos);
    }

    @Override
    public int hashCode() {
        return dtos.hashCode();
    }
}

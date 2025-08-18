package ru.fvds.cdss13.lib.dto.ad;


import org.springframework.data.domain.Pageable;

public class RequestPageableAllDto<Dto> {

    private Dto dto;

    private Pageable pageable;

    public RequestPageableAllDto(Dto dto, Pageable pageable) {
        this.dto = dto;
        this.pageable = pageable;
    }

    public RequestPageableAllDto() {
    }

    public Dto getDto() {
        return dto;
    }

    public void setDto(Dto dto) {
        this.dto = dto;
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

        RequestPageableAllDto<?> that = (RequestPageableAllDto<?>) o;

        if (!dto.equals(that.dto)) return false;
        return pageable.equals(that.pageable);
    }

    @Override
    public int hashCode() {
        int result = dto.hashCode();
        result = 31 * result + pageable.hashCode();
        return result;
    }
}

package ru.fvds.cdss13.lib.dto.ad;



import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import ru.fvds.cdss13.lib.dto.city.CityDto;

import java.util.List;


public class ResponsesCity {

    private List<CityDto> dtos;

    public ResponsesCity(List<CityDto> dtos) {
        this.dtos = dtos;
    }

    public ResponsesCity() {
    }

    public List<CityDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<CityDto> dtos) {
        this.dtos = dtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesCity that = (ResponsesCity) o;

        return dtos.equals(that.dtos);
    }

    @Override
    public int hashCode() {
        return dtos.hashCode();
    }
}

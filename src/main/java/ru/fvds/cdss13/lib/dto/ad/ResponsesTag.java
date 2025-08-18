package ru.fvds.cdss13.lib.dto.ad;




import ru.fvds.cdss13.lib.dto.tag.TagDto;

import java.util.List;

public class ResponsesTag {

    private List<TagDto> dtos;

    public ResponsesTag(List<TagDto> dtos) {
        this.dtos = dtos;
    }

    public ResponsesTag() {
    }

    public List<TagDto> getDtos() {
        return dtos;
    }

    public void setDtos(List<TagDto> dtos) {
        this.dtos = dtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesTag that = (ResponsesTag) o;

        return dtos.equals(that.dtos);
    }

    @Override
    public int hashCode() {
        return dtos.hashCode();
    }
}

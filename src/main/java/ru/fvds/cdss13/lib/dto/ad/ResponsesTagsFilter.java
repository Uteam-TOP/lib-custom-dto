package ru.fvds.cdss13.lib.dto.ad;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import ru.fvds.cdss13.lib.dto.tag.TagDto;
import ru.fvds.cdss13.lib.dto.tag.TagType;

import java.util.List;

public class ResponsesTagsFilter {

    private List<TagType> types;

    private List<TagDto> dtos;

    public ResponsesTagsFilter(List<TagType> types) {
        this.types = types;
    }

    public ResponsesTagsFilter() {
    }

    public List<TagType> getTypes() {
        return types;
    }

    public void setTypes(List<TagType> types) {
        this.types = types;
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

        ResponsesTagsFilter that = (ResponsesTagsFilter) o;

        if (!types.equals(that.types)) return false;
        return dtos != null ? dtos.equals(that.dtos) : that.dtos == null;
    }

    @Override
    public int hashCode() {
        int result = types.hashCode();
        result = 31 * result + (dtos != null ? dtos.hashCode() : 0);
        return result;
    }
}

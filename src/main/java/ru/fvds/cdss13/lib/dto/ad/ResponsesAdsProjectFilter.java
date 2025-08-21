package ru.fvds.cdss13.lib.dto.ad;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.data.domain.Pageable;
import ru.fvds.cdss13.lib.dto.project.ProjectVacancyFilterDto;

import java.util.List;


public class ResponsesAdsProjectFilter {

    private Long projectId;
    private ProjectVacancyFilterDto projectVacancyFilterDto;
    private Pageable pageable;

    private List<AdDto> adDtos;

    public ResponsesAdsProjectFilter() {
    }

    public ResponsesAdsProjectFilter(Long projectId, ProjectVacancyFilterDto projectVacancyFilterDto, Pageable pageable) {
        this.projectId = projectId;
        this.projectVacancyFilterDto = projectVacancyFilterDto;
        this.pageable = pageable;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public ProjectVacancyFilterDto getProjectVacancyFilterDto() {
        return projectVacancyFilterDto;
    }

    public void setProjectVacancyFilterDto(ProjectVacancyFilterDto projectVacancyFilterDto) {
        this.projectVacancyFilterDto = projectVacancyFilterDto;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public List<AdDto> getAdDtos() {
        return adDtos;
    }

    public void setAdDtos(List<AdDto> adDtos) {
        this.adDtos = adDtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponsesAdsProjectFilter that = (ResponsesAdsProjectFilter) o;

        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (projectVacancyFilterDto != null ? !projectVacancyFilterDto.equals(that.projectVacancyFilterDto) : that.projectVacancyFilterDto != null)
            return false;
        if (pageable != null ? !pageable.equals(that.pageable) : that.pageable != null) return false;
        return adDtos != null ? adDtos.equals(that.adDtos) : that.adDtos == null;
    }

    @Override
    public int hashCode() {
        int result = projectId != null ? projectId.hashCode() : 0;
        result = 31 * result + (projectVacancyFilterDto != null ? projectVacancyFilterDto.hashCode() : 0);
        result = 31 * result + (pageable != null ? pageable.hashCode() : 0);
        result = 31 * result + (adDtos != null ? adDtos.hashCode() : 0);
        return result;
    }
}

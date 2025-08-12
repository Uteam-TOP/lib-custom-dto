package ru.fvds.cdss13.lib.dto.project;





public class ProjectFilterDto {
    private ProjectType type;
    private Long cityId;


    public ProjectFilterDto() {
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}

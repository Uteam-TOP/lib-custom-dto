package ru.fvds.cdss13.lib.dto.project;




public class ProjectWithApplicationInfoDto extends ProjectDto {
    private boolean currentUserAppliedToProject;
    private String currentUserApplicationProfession;

    public ProjectWithApplicationInfoDto() {
    }

    public boolean isCurrentUserAppliedToProject() {
        return currentUserAppliedToProject;
    }

    public void setCurrentUserAppliedToProject(boolean currentUserAppliedToProject) {
        this.currentUserAppliedToProject = currentUserAppliedToProject;
    }

    public String getCurrentUserApplicationProfession() {
        return currentUserApplicationProfession;
    }

    public void setCurrentUserApplicationProfession(String currentUserApplicationProfession) {
        this.currentUserApplicationProfession = currentUserApplicationProfession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectWithApplicationInfoDto that = (ProjectWithApplicationInfoDto) o;

        if (currentUserAppliedToProject != that.currentUserAppliedToProject) return false;
        return currentUserApplicationProfession.equals(that.currentUserApplicationProfession);
    }

    @Override
    public int hashCode() {
        int result = (currentUserAppliedToProject ? 1 : 0);
        result = 31 * result + currentUserApplicationProfession.hashCode();
        return result;
    }
}

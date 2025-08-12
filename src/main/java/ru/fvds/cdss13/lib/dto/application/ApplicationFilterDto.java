package ru.fvds.cdss13.lib.dto.application;





public class ApplicationFilterDto {

    private Boolean resumeOwnerBanned;


    public ApplicationFilterDto() {
    }

    public Boolean getResumeOwnerBanned() {
        return resumeOwnerBanned;
    }

    public void setResumeOwnerBanned(Boolean resumeOwnerBanned) {
        this.resumeOwnerBanned = resumeOwnerBanned;
    }
}

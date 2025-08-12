package ru.fvds.cdss13.lib.dto.user;




public class AdditionalUserInfoDto {
    private int numberOfResumes;
    private int numberOfVacancies;

    public AdditionalUserInfoDto() {
    }

    public int getNumberOfResumes() {
        return numberOfResumes;
    }

    public void setNumberOfResumes(int numberOfResumes) {
        this.numberOfResumes = numberOfResumes;
    }

    public int getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public void setNumberOfVacancies(int numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }
}

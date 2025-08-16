package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;
import ru.fvds.cdss13.lib.dto.ad.AdDto;

import javax.xml.validation.Schema;
import java.util.Objects;

/**
 * ApplyToHackathonDto
 */

public class ApplyToHackathonDto {

  private @Nullable Long projectId;

  private @Nullable AdDto resume;

  public ApplyToHackathonDto projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Id проекта, команда которой будет участвовать в хакатоне
   * @return projectId
   */
  
  @JsonProperty("projectId")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ApplyToHackathonDto resumeId(AdDto resume) {
    this.resume = resume;
    return this;
  }

  /**
   * Id резюме участника который будет участвовать в хакатоне
   * @return resumeId
   */
  
 @JsonProperty("resume")
  public AdDto getResume() {
    return resume;
  }

  public void setResume(AdDto resume) {
    this.resume = resume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyToHackathonDto applyToHackathonDto = (ApplyToHackathonDto) o;
    return Objects.equals(this.projectId, applyToHackathonDto.projectId) &&
        Objects.equals(this.resume, applyToHackathonDto.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, resume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyToHackathonDto {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


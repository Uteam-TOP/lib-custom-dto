package ru.fvds.cdss13.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.xml.validation.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TeamPageDto
 */
@NoArgsConstructor
@AllArgsConstructor
public class TeamPageDto {

  @Valid
  private List<@Valid TeamDto> data = new ArrayList<>();

  private @Nullable Long total;

  public TeamPageDto data(List<@Valid TeamDto> data) {
    this.data = data;
    return this;
  }

  public TeamPageDto addDataItem(TeamDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @JsonProperty("data")
  public List<@Valid TeamDto> getData() {
    return data;
  }

  public void setData(List<@Valid TeamDto> data) {
    this.data = data;
  }

  public TeamPageDto total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Общее количество команд
   * @return total
   */
  
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPageDto teamPageDto = (TeamPageDto) o;
    return Objects.equals(this.data, teamPageDto.data) &&
        Objects.equals(this.total, teamPageDto.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPageDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


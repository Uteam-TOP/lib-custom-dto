package ru.fvds.cdss13.lib.dto.minio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileResponse {

    private String message;

    private String path;

    @JsonProperty("public_url")
    private String publicUrl;
}

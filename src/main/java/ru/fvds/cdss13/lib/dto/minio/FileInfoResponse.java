package ru.fvds.cdss13.lib.dto.minio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileInfoResponse {

    private String filename;
    private String path;
    private Long size;
}

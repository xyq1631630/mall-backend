package com.mall.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response for file uploaded
 */
@Data
@EqualsAndHashCode
public class MinioUploadDto {
    @Schema(title = "File URL")
    private String url;
    @Schema(title = "File name")
    private String name;
}

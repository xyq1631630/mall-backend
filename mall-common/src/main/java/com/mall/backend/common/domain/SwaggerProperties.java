package com.mall.backend.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * Swagger configuration
 */
@Data
@EqualsAndHashCode
@Builder
public class SwaggerProperties {
    private String apiBasePackage;
    private boolean enableSecurity;
    private String title;
    private String description;
    private String version;
    private String contactName;
    private String contactUrl;
    private String contactEmail;
}

package com.mall.backend.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * log class for controller
 */
@Data
@EqualsAndHashCode
public class WebLog {
    private String description;
    private String username;
    private Long startTime;
    private Integer spendTime;
    private String basePath;
    private String uri;
    private String url;
    private String method;
    private String ip;
    private Object parameter;
    private Object result;
}

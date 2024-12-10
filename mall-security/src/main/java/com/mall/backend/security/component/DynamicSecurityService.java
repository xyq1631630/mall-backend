package com.mall.backend.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * Dynamic security service interface
 */
public interface DynamicSecurityService {
    /**
     * load data source to map
     */
    Map<String, ConfigAttribute> loadDataSource();
}

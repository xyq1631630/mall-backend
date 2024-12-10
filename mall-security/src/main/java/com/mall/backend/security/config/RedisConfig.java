package com.mall.backend.security.config;

import com.mall.backend.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis config
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}

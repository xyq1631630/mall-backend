package com.mall.backend.security.annotation;

import java.lang.annotation.*;

/**
 * Define CacheException annotation
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}

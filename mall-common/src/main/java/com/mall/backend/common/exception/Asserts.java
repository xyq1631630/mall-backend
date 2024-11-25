package com.mall.backend.common.exception;

import com.mall.backend.common.api.IErrorCode;
/**
 * Assertion
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}

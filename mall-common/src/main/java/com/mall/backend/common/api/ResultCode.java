package com.mall.backend.common.api;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "Success.."),
    FAILED(500, "Failed.."),
    VALIDATE_FAILED(404, "Failed in validation."),
    UNAUTHORIZED(401, "Not logged in yet or token has been expired."),
    FORBIDDEN(403, "No relevant permissions.");

    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

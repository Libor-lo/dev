package com.dev.common.respond;


public enum ErrorCode  {

    SYSTEM_ERROR("500", "操作失败"),
    PARAM_ERROR("404","参数非法"),
    HTTP_METHOD_NOT_SUPPORT("404","不支持此方法访问"),
    VALIDATE_FAILED("404", "参数检验失败"),
    UNAUTHORIZED("401", "暂未登录或token已经过期"),
    FORBIDDEN("403", "没有相关权限");


    private String errorCode;
    private String errorMessage;

    private ErrorCode(String code, String message) {
        this.errorCode = code;
        this.errorMessage = message;
    }

    public String getCode() {
        return errorCode;
    }

    public String getMessage() {
        return errorMessage;
    }
}

package com.dev.common.respond;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: 博lo
 * @Date: 2020/1/31 22:06
 * @Description:
 */

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RespondResult<T> {

    private Boolean flag;
    private String errorCode;
    private String errorMessage;
    private T data;

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> RespondResult<T> success(T data) {
        RespondResult<T> respondResult = new RespondResult<>();
        respondResult.setFlag(true);
        respondResult.setData(data);
        return respondResult;
    }

    /**
     * 成功返回结果
     *
     */
    public static <T> RespondResult<T> success() {
        RespondResult<T> respondResult = new RespondResult<>();
        respondResult.setFlag(true);
        return respondResult;
    }


    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param data 错误数据
     */
    public static <T> RespondResult<T> failed(ErrorCode errorCode,T data) {
        RespondResult<T> respondResult = new RespondResult<>();
        respondResult.setFlag(false);
        respondResult.setErrorCode(errorCode.getCode());
        respondResult.setErrorMessage(errorCode.getMessage());
        respondResult.setData(data);
        return respondResult;
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> RespondResult<T> failed(ErrorCode errorCode) {
        RespondResult<T> respondResult = new RespondResult<>();
        respondResult.setFlag(false);
        respondResult.setErrorCode(errorCode.getCode());
        respondResult.setErrorMessage(errorCode.getMessage());
        return respondResult;
    }



}

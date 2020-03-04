package com.dev.common.except;

import lombok.Data;

/**
 * Description:业务异常类信息
 */
@Data
public class CustomizedException extends RuntimeException {
 
    private static final long serialVersionUID = -7864604160297181941L;
 
    /** 错误码 */
    protected final ErrorCodeEnum errorCode;

 
    /**
     * 无参默认构造UNSPECIFIED
     */
    public CustomizedException() {
        super(ErrorCodeEnum.UNSPECIFIED.getDescription());
        this.errorCode = ErrorCodeEnum.UNSPECIFIED;
    }
 
    /**
     * 指定错误码构造通用异常
     * @param errorCode 错误码
     */
    public CustomizedException(final ErrorCodeEnum errorCode) {
        super(errorCode.getDescription());
        this.errorCode = errorCode;
    }
 
    /**
     * 指定详细描述构造通用异常
     * @param detailedMessage 详细描述
     */
    public CustomizedException(final String detailedMessage) {
        super(detailedMessage);
        this.errorCode = ErrorCodeEnum.UNSPECIFIED;
    }
 
    /**
     * 指定导火索构造通用异常
     * @param t 导火索
     */
    public CustomizedException(final Throwable t) {
        super(t);
        this.errorCode = ErrorCodeEnum.UNSPECIFIED;
    }
 
    /**
     * 构造通用异常
     * @param errorCode 错误码
     * @param detailedMessage 详细描述
     */
    public CustomizedException(final ErrorCodeEnum errorCode, final String detailedMessage) {
        super(detailedMessage);
        this.errorCode = errorCode;
    }
 
    /**
     * 构造通用异常
     * @param errorCode 错误码
     * @param t 导火索
     */
    public CustomizedException(final ErrorCodeEnum errorCode, final Throwable t) {
        super(errorCode.getDescription(), t);
        this.errorCode = errorCode;
    }
 
    /**
     * 构造通用异常
     * @param detailedMessage 详细描述
     * @param t 导火索
     */
    public CustomizedException(final String detailedMessage, final Throwable t) {
        super(detailedMessage, t);
        this.errorCode = ErrorCodeEnum.UNSPECIFIED;
    }
 
    /**
     * 构造通用异常
     * @param errorCode 错误码
     * @param detailedMessage 详细描述
     * @param t 导火索
     */
    public CustomizedException(final ErrorCodeEnum errorCode, final String detailedMessage,
                               final Throwable t) {
        super(detailedMessage, t);
        this.errorCode = errorCode;
    }
 

 
}

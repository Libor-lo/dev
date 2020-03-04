package com.dev.common.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * Controller层的日志封装类
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class WebLog {

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * IP地址
     */
    private String ip;

    /**
     * parameter
     */
    private Object parameter;

    /**
     * result
     */
    private Object result;


}

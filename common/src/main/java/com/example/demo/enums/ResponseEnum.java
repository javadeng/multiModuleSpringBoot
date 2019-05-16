package com.example.demo.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 13:31
 * @Version 1.0
 * @Description 服务端接口返回使用
 * @Tips To change this template : "File And Code Templates"
 * {@link com.example.demo.response.ServerResponse}
 */
public enum ResponseEnum {
    /**
     * 系统正常响应
     */
    SUCCESS(200, "操作成功"),
    /**
     * 服务异常导致系统内部错误
     */
    SYSTEM_ERROR(500, "系统内部错误"),
    /**
     * 参数错误，一般如必填参数未填写之类
     */
    PARAMATER_ERROR(1001, "参数错误");

    private final int responseCode;
    private final String responseMessage;

    ResponseEnum(int responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }


    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}

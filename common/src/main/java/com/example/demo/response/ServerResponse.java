package com.example.demo.response;

import com.example.demo.enums.ResponseEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 13:23
 * @Version 1.0
 * @Description 简要说明当前类的含义以及作用
 * @Tips To change this template : "File And Code Templates"
 */
@Data
@Accessors(chain = true)
public class ServerResponse<T> {
    /**
     * 操作码
     */
    private int responseCode;
    /**
     * 操作响应消息
     */
    private String responseMessage;
    /**
     * 当此操作id
     */
    private String requestId;
    /**
     * 响应结果
     */
    private T data;

    public ServerResponse() {
        requestId = UUID.randomUUID().toString();
    }

    public ServerResponse(ResponseEnum responseEnum) {
        this();
        this.responseCode = responseEnum.getResponseCode();
        this.responseMessage = responseEnum.getResponseMessage();
    }

}

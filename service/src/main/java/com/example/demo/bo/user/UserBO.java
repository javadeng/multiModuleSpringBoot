package com.example.demo.bo.user;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 13:17
 * @Version 1.0
 * @Description UserController参数到UserService使用UserBO
 * @Tips To change this template : "File And Code Templates"
 */
@Data
public class UserBO {

    private Long id;
    /**
     * 用户姓名
     */
    private String username;

}

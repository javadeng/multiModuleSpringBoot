package com.example.demo.dto.user;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 13:44
 * @Version 1.0
 * @Description UserService数据到UserController使用userDTO
 * @Tips To change this template : "File And Code Templates"
 */
@Data
public class UserDTO {

    private Long id;
    /**
     * 用户姓名
     */
    private String username;
}

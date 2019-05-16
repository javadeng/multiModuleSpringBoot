package com.example.demo.user;

import com.example.demo.bo.user.UserBO;
import com.example.demo.dto.user.UserDTO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 12:47
 * @Version 1.0
 * @Description 简要说明当前类的含义以及作用
 * @Tips To change this template : "File And Code Templates"
 */
public interface UserService {

    Long create(UserBO userBO);

    UserDTO findById(Long id);

    Boolean update(UserBO userBO);

    Boolean deleteById(Long id);
}

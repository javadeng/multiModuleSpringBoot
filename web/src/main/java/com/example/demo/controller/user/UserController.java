package com.example.demo.controller.user;

import com.example.demo.bo.user.UserBO;
import com.example.demo.controller.user.request.UserCreateRequest;
import com.example.demo.controller.user.request.UserUpdateRequest;
import com.example.demo.controller.user.response.UserResponse;
import com.example.demo.dto.user.UserDTO;
import com.example.demo.enums.ResponseEnum;
import com.example.demo.response.ServerResponse;
import com.example.demo.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 13:15
 * @Version 1.0
 * @Description 简要说明当前类的含义以及作用
 * @Tips To change this template : "File And Code Templates"
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("create")
    public ServerResponse<Long> create(@RequestBody UserCreateRequest request) {
        UserBO userBO = new UserBO();
        BeanUtils.copyProperties(request, userBO);
        Long id = userService.create(userBO);
        return new ServerResponse<Long>(ResponseEnum.SUCCESS).setData(id);
    }

    @GetMapping("findById")
    public ServerResponse<UserResponse> findById(@RequestParam("id") Long id) {
        UserDTO userDTO = userService.findById(id);
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(userDTO, response);
        return new ServerResponse<UserResponse>(ResponseEnum.SUCCESS).setData(response);
    }

    @PutMapping("update")
    public ServerResponse<Boolean> update(@RequestBody UserUpdateRequest request) {
        UserBO userBO = new UserBO();
        BeanUtils.copyProperties(request, userBO);
        return new ServerResponse<Boolean>(ResponseEnum.SUCCESS).setData(userService.update(userBO));
    }

    @DeleteMapping("deleteById")
    public ServerResponse<Boolean> deleteById(@RequestParam("id") Long id) {
        return new ServerResponse<Boolean>(ResponseEnum.SUCCESS).setData(userService.deleteById(id));
    }
}

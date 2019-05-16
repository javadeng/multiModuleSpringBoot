package com.example.demo.user.impl;

import com.example.demo.bo.user.UserBO;
import com.example.demo.dao.user.UserEntity;
import com.example.demo.dao.user.UserEntityMapper;
import com.example.demo.dto.user.UserDTO;
import com.example.demo.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dengjianghua
 * @Date: 2019-05-16
 * @Time: 13:09
 * @Version 1.0
 * @Description 简要说明当前类的含义以及作用
 * @Tips To change this template : "File And Code Templates"
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserEntityMapper userEntityMapper;

    @Override
    public Long create(UserBO userBO) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userBO, userEntity);
        userEntityMapper.insert(userEntity);
        return userEntity.getId();
    }

    @Override
    public UserDTO findById(Long id) {
        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(id);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userEntity, userDTO);
        return userDTO;
    }

    @Override
    public Boolean update(UserBO userBO) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userBO, userEntity);
        userEntityMapper.updateByPrimaryKeySelective(userEntity);
        return Boolean.TRUE;
    }

    @Override
    public Boolean deleteById(Long id) {
        userEntityMapper.deleteByPrimaryKey(id);
        return Boolean.TRUE;
    }
}

package com.dream.springbootmybatis.service.impl;

import com.dream.springbootmybatis.mapper.UserMapper;
import com.dream.springbootmybatis.pojo.User;
import com.dream.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 22:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}

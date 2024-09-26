package com.dream.springbootmybatis.service;

import com.dream.springbootmybatis.pojo.User;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 22:15
 */
public interface UserService {
   public User findById(Integer id);
}

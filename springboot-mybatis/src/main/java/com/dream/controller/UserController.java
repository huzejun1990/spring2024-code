package com.dream.controller;

import com.dream.springbootmybatis.pojo.User;
import com.dream.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 22:52
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }

}

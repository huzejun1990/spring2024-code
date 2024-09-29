package com.dream.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 14:20
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
return "hello world~~~~~";
    }
}

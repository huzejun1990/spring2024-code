package com.dream.springbootconfigfile.service;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 17:05
 */
public interface EmailService {
    boolean send(String to, String title, String content);
}

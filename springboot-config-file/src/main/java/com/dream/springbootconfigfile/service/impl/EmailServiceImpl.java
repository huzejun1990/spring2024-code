package com.dream.springbootconfigfile.service.impl;

import com.dream.springbootconfigfile.pojo.EmailProperties;
import com.dream.springbootconfigfile.service.EmailService;
import com.dream.springbootconfigfile.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 17:06
 */
@Service
public class EmailServiceImpl implements EmailService {

    //注入email配置信息实体
    @Autowired
    private EmailProperties emailProperties;

    /**
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    @Override
    public boolean send(String to, String title, String content) {
        //打印email配置信息
        System.out.println(emailProperties);
        //发送邮件
        boolean flag = MailUtil.sendMail(emailProperties, to, title, content);
        return flag;
    }
}

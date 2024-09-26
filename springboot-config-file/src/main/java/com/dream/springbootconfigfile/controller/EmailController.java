package com.dream.springbootconfigfile.controller;

import com.dream.springbootconfigfile.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 17:40
 */
@RestController
public class EmailController {

    //注入email配置信息实体类
    @Autowired
    private EmailService emailService;

    @RequestMapping("/send")
    public Boolean send()
    {
        //发件人信息
        String to = "1256785691@qq.com";

        //邮件标题
        String title = "测试邮件";

        String content = "我是即将收入千万的牛马了....";

        //发送邮件
        boolean flag = emailService.send(to, title, content);
        return flag;
    }


}

package com.dream.springbootconfigfile.utils;

import com.dream.springbootconfigfile.pojo.EmailProperties;

/**
 * @Auther: huzejun
 * @Date: 2024/9/26 16:49
 */
public class MailUtil {

    /**
     *
     * @param emailProperties 发件人信息（发件人邮箱、发件人授权码）及邮件服务器信息（邮件服务器域名，身份验证开发）
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    public static boolean sendMail(EmailProperties emailProperties, String to, String title, String content)
    {
        return true;

    }

}

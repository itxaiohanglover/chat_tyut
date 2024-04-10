
package com.tyut.chat.service.impl;


import com.tyut.chat.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendMail(String toUserEmail, String subject, String text) {
        // 创建简单邮件消息
        SimpleMailMessage message = new SimpleMailMessage();
        // 谁发的
        message.setFrom(from);
        // 发给谁
        message.setTo(toUserEmail);
        // 邮件标题
        message.setSubject(subject);
        // 邮件内容
        message.setText(text);

        try {
            javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

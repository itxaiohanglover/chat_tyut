package com.tyut.chat.service;

/**
 * @author xh
 * @Date 2022/6/4
 */
public interface MailService {
    public void sendMail(String toUserEmail, String subject, String text);
}

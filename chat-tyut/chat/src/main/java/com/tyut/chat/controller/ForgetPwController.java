package com.tyut.chat.controller;


import com.tyut.chat.entity.User;
import com.tyut.chat.service.UserService;
import com.tyut.chat.service.impl.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ForgetPwController {
    @Autowired
    private UserService userService;

    @Autowired
    private MailServiceImpl mailService;

    @PostMapping("/get_password")
    public Map<String,Object> get_password(@RequestBody Map<String,Object> map){
        String email = (String) map.get("email");
        Map<String, Object> response = new HashMap<>();
        User user = userService.getOneByEmail(email);
        if(user==null){
            response.put("status",100);
            response.put("msg","该邮箱未注册！");
            return response;
        }
        try {
            mailService.sendMail(email,"邮箱找回密码","您的密码是："+user.getPassword());
        }catch (Exception e){
            e.printStackTrace();
            response.put("status",100);
            response.put("msg","发送邮件失败！可能是因为该邮箱不是一个合法邮箱！");
            return response;
        }
        response.put("status", 200);
        return response;
    }
}

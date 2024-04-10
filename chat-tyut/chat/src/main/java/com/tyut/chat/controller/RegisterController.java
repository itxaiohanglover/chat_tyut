package com.tyut.chat.controller;

import com.tyut.chat.entity.User;
import com.tyut.chat.service.CodeService;
import com.tyut.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegisterController {


    @Autowired
    private UserService userService;

    @PostMapping("/userPost")
    public Map<String, Object> postUser(@RequestBody Map<String, Object> map) {
        String nickname = (String) map.get("nickname");
        String email = (String) map.get("email");
        String password = (String) map.get("password");

        Map<String, Object> response = new HashMap<>();
        User user1 = userService.getOneByEmail(email);
        if (user1 != null) {
            response.put("status", 100);
            response.put("msg", "该邮箱已经注册过了！");
            return response;
        }
        if (password.length() < 3) {
            response.put("status", 100);
            response.put("msg", "密码位数不能低于3位！");
            return response;
        }
        User user = new User();
        user.setEmail(email);
        user.setNickname(nickname);
        user.setPassword(password);
        userService.insertOne(user);
        response.put("status", 200);
        response.put("msg", "注册成功！");
        return response;
    }
}

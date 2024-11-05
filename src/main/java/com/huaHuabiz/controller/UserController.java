package com.huaHuabiz.controller;

import com.huaHuabiz.pojo.Result;
import com.huaHuabiz.pojo.User;
import com.huaHuabiz.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        User user = userService.findByUserName();
        if (user == null) {
            userService.register(username, password);
            return Result.success();
        } else {
            return Result.error("用户已注册");
        }
    }
}

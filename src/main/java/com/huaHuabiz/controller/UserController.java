package com.huaHuabiz.controller;

import com.huaHuabiz.pojo.Result;
import com.huaHuabiz.pojo.User;
import com.huaHuabiz.service.impl.UserService;
import com.huaHuabiz.utils.Md5Util;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{5,16}$")String password) {
        User user = userService.findByUserName(username);
        if (user == null) {
            userService.register(username, password);
            return Result.success();
        } else {
            return Result.error("用户已注册");
        }
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public Result<String> login(@Pattern(regexp = "^\\S{5,16}$") String username, @Pattern(regexp = "^\\S{5,16}$")String password) {
        User user = userService.findByUserName(username);
        if (user == null) {
            return Result.error("用户名错误");
        }
        if (Md5Util.getMD5String(password).equals(user.getPassword())) {
            return Result.success("jwt13123131");
        }
        return Result.error("密码错误");
    }
}

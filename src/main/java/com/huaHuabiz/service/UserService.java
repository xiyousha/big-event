package com.huaHuabiz.service;

import com.huaHuabiz.pojo.User;

public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);

    void updateUserInfo(User user);

    void updateAvatar(String avatarUrl);
    void updatePwd(String pwd);
}

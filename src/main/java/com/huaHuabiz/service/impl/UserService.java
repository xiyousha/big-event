package com.huaHuabiz.service.impl;

import com.huaHuabiz.pojo.User;

public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);
}

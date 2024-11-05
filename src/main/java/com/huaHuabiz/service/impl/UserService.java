package com.huaHuabiz.service.impl;

import com.huaHuabiz.pojo.User;

public interface UserService {
    User findByUserName();

    void register(String username, String password);
}

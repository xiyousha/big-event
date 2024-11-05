package com.huaHuabiz.service.impl.com.impl;

import com.huaHuabiz.mapper.UserMapper;
import com.huaHuabiz.pojo.User;
import com.huaHuabiz.service.impl.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public User findByUserName() {
        User user = userMapper.findByUserName();
        return user;
    }

    @Override
    public void register(String username, String password) {

    }
}

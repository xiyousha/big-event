package com.huaHuabiz.service.impl.com.impl;

import com.huaHuabiz.mapper.UserMapper;
import com.huaHuabiz.pojo.User;
import com.huaHuabiz.service.impl.UserService;
import com.huaHuabiz.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        User user = userMapper.findByUserName(username);
        return user;
    }

    @Override
    public void register(String username, String password) {
        String md5String = Md5Util.getMD5String(password);
        userMapper.add(username, md5String);
    }
}

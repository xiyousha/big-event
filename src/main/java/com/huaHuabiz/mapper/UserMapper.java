package com.huaHuabiz.mapper;

import com.huaHuabiz.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    // 查询用户
    @Select("select * from user where username = #{username}")
    User findByUserName(String username);

    // 注册用户
    @Insert("insert into user(username, password, create_time, update_time) values(#{username}, #{password}, now(), now())")
    void add(String username, String password);

}

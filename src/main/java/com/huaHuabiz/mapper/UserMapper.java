package com.huaHuabiz.mapper;

import com.huaHuabiz.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    // 查询用户
    @Select("select * from user where username = #{username}")
    User findByUserName(String username);

    // 注册用户
    @Insert("insert into user(username, password, create_time, update_time) values(#{username}, #{password}, now(), now())")
    void add(String username, String password);

    @Update("update user set nickname=#{nickname},email=#{email},update_time=#{updateTime} where id=#{id}")
    void updateUserInfo(User user);

    @Update("update user set user_pic=#{avatarUrl},update_time=now() where id=#{id}")
    void updateAvatar(String avatarUrl, Integer id);

    @Update("update user set password=#{pwd},update_time=now() where id=#{id}")
    void updatePwd(String pwd, Integer id);
}

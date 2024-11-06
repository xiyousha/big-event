package com.huaHuabiz.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

    @Insert("insert into category(category_name, category_alias, create_user, create_time, update_time) values(#{categoryName}, #{categoryAlias}, #{id}, now(), now())")
    void add(String categoryName, String categoryAlias, Integer id);
}
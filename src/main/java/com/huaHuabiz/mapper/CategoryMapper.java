package com.huaHuabiz.mapper;

import com.huaHuabiz.pojo.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    // 新增分类
    @Insert("insert into category(category_name, category_alias, create_user, create_time, update_time) " +
            "values(#{categoryName}, #{categoryAlias}, #{createUser}, #{createTime}, #{updateTime})")
    void add(Category category);

    @Select("select * from category where create_user = #{id}")
    List<Category> list(Integer id);

    @Select("select * from category where id = #{id}")
    Category categoryDetails(Integer id);
}

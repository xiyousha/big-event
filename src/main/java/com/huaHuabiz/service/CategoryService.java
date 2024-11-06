package com.huaHuabiz.service;

import com.huaHuabiz.pojo.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category);

    List<Category> list();

    Category categoryDetails(Integer id);
}

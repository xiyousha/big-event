package com.huaHuabiz.service.impl;

import com.huaHuabiz.mapper.CategoryMapper;
import com.huaHuabiz.pojo.Category;
import com.huaHuabiz.service.CategoryService;
import com.huaHuabiz.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void add(String categoryName, String categoryAlias) {
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        categoryMapper.add(categoryName, categoryAlias, id);
    }
}

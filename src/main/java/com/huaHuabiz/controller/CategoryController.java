package com.huaHuabiz.controller;


import com.huaHuabiz.pojo.Category;
import com.huaHuabiz.pojo.Result;
import com.huaHuabiz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 新增分类
     * @param category
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody @Validated Category category) {
        categoryService.add(category);
        return Result.success();
    }

    /**
     * 获取文章列表
     * @return
     */
    @GetMapping("/list")
    public Result<List<Category>> list() {
        List<Category> list = categoryService.list();
        return Result.success(list);
    }

    @GetMapping("/details/{id}")
    public Result categoryDetails(@PathVariable("id") Integer id) {
        Category category = categoryService.findById(id);
        return Result.success(category);
    }
}

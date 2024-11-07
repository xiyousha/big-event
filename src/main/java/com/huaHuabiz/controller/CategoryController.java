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
    public Result add(@RequestBody @Validated(Category.Add.class) Category category) {
        categoryService.add(category);
        return Result.success();
    }

    /**
     * 获取分类列表
     * @return
     */
    @GetMapping("/list")
    public Result<List<Category>> list() {
        List<Category> list = categoryService.list();
        return Result.success(list);
    }

    /**
     * 获取分类详情
     * @param id
     * @return
     */
    @GetMapping("/details/{id}")
    public Result categoryDetails(@PathVariable("id") Integer id) {
        Category category = categoryService.findById(id);
        return Result.success(category);
    }

    /**
     * 更新分类
     * @param category
     * @return
     */
    @PutMapping("/update")
    public Result updateCategory(@RequestBody @Validated(Category.Update.class) Category category) {
        categoryService.updateCategory(category);
        return Result.success();
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteCategory(@PathVariable("id") Integer id) {
        categoryService.deleteCategory(id);
        return Result.success();
    }
}

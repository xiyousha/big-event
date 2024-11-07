package com.huaHuabiz.controller;

import com.huaHuabiz.pojo.Article;
import com.huaHuabiz.pojo.Result;
import com.huaHuabiz.service.ArticleService;
import com.huaHuabiz.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/add")
    public Result add(@RequestBody Article article) {
        articleService.add(article);
        return Result.success();
    }

    @RequestMapping("/list")
    public Result list() {
        return Result.success("所有的文章数据");
    }
}

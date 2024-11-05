package com.huaHuabiz.controller;

import com.huaHuabiz.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/list")
    public Result list() {
        return Result.success("所有的文章数据");
    }
}

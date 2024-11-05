package com.huaHuabiz.controller;

import com.huaHuabiz.pojo.Result;
import com.huaHuabiz.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/list")
    public Result list() {
        return Result.success("所有的文章数据");
    }
}

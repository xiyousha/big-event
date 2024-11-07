package com.huaHuabiz.service.impl;

import com.huaHuabiz.mapper.ArticleMapper;
import com.huaHuabiz.pojo.Article;
import com.huaHuabiz.service.ArticleService;
import com.huaHuabiz.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void add(Article article) {
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("id");
        article.setCreateUser(userId);
        articleMapper.add(article);
    }
}

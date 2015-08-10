package com.blackrock.boris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blackrock.boris.dto.Article;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.ArticleService;

@Controller
public class ArticleController {

    private ArticleService articleService;

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping(value = "/articles", method = RequestMethod.POST)
    @ResponseBody
    public void postArticle(@RequestBody Article article) throws BorisInternalException {
        articleService.postArticle(article);
    }
}

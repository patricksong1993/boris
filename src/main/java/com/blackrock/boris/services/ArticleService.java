package com.blackrock.boris.services;

import com.blackrock.boris.dao.ArticlesDao;
import com.blackrock.boris.dto.Article;
import com.blackrock.boris.exceptions.BorisInternalException;

public class ArticleService {

    private ArticlesDao articlesDao;

    public void setArticlesDao(ArticlesDao articlesDao) {
        this.articlesDao = articlesDao;
    }

    public void postArticle(Article article) throws BorisInternalException {
        articlesDao.addArticle(article);
    }
}

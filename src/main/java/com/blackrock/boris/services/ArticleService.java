package com.blackrock.boris.services;

import com.blackrock.boris.dao.ArticlesDao;
import com.blackrock.boris.dao.NotificationDao;
import com.blackrock.boris.dto.Article;
import com.blackrock.boris.dto.Notification;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.utilities.NotificationTemplateType;
import com.blackrock.boris.utilities.articles.ArticleDetail;
import com.blackrock.boris.utilities.articles.ArticleDetailProvider;
import com.blackrock.boris.utilities.articles.PageDownloader;

public class ArticleService {

    private ArticlesDao articlesDao;
    private NotificationDao notificationDao;

    public void setArticlesDao(ArticlesDao articlesDao) {
        this.articlesDao = articlesDao;
    }

    public void setNotificationDao(NotificationDao notificationDao) {
        this.notificationDao = notificationDao;
    }

    public void postArticle(Article article) throws BorisInternalException {
        ArticleDetail articleDetail = ArticleDetailProvider.retrieveDetail(PageDownloader.fetch(article.getLink()));

        article.setTitle(articleDetail.getTitle());
        article.setSource(ArticleDetailProvider.retrieveSource(article.getLink()));
        article.setSummary(articleDetail.getSummary());

        articlesDao.addArticle(article);

        Notification notification = new Notification();
        notification.setContext(article.getLink());
        notification.setEnabled(true);
        notification.setTechnology(article.getTechnologyRelatedTo());
        notification.setTemplate(notificationDao.getTemplate(NotificationTemplateType.ARTICLE));

        notificationDao.addNotification(notification);
    }
}

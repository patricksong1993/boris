package com.blackrock.boris.dao;


import org.hibernate.Session;

import com.blackrock.boris.dto.Article;

public class ArticlesDao {

	public void addArticle(Article article){
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.save(article);
	}

	public static void main(String[] args) {
		Article ar = new Article();
		ar.setId(12345);
		ar.setTitle("blabal2");

		new ArticlesDao().addArticle(ar);
	}
}

package com.blackrock.boris.dao;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blackrock.boris.dto.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-hibernate.xml" })
public class ArticlesDaoTest {
    @Autowired
    SessionFactory sessionFactory;

    @Test
    public void test(){
        Article ar = new Article();
        ar.setId(123456);
        ar.setTitle("ciao");
    }
}

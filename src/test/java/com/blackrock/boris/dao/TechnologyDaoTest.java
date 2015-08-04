package com.blackrock.boris.dao;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blackrock.boris.dto.Article;
import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-main.xml" })
public class TechnologyDaoTest {

    @Autowired
    TechnologyDao technologyDao;
    @Autowired
    ArticlesDao artDao;

    @Test
    public void getTrendingTechnologies() throws BorisInternalException{
        technologyDao.getTrendingTechnologies();
    }

}

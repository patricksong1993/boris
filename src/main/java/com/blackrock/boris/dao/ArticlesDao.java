package com.blackrock.boris.dao;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.blackrock.boris.dto.Article;
import com.blackrock.boris.exceptions.BorisInternalException;

public class ArticlesDao {

    private static final Logger log = Logger.getLogger(ArticlesDao.class);
    private SessionFactory sessionFactory;

    public void addArticle(Article article) throws BorisInternalException{
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.save(article);

            tx.commit();
        }catch(RuntimeException e){
            try{
                tx.rollback();
            }catch(RuntimeException rbe){
                log.error("Couldnít roll back transaction", rbe);
            }
            throw new BorisInternalException(e);
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

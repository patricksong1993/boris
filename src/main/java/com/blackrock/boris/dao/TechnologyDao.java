package com.blackrock.boris.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;

public class TechnologyDao {

    private static final Logger log = Logger.getLogger(TechnologyDao.class);

    private SessionFactory sessionFactory;

    public List<Technology> getTrendingTechnologies() throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            Criteria criteria = session.createCriteria(Technology.class);
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            @SuppressWarnings("unchecked")
            List<Technology> result = criteria.list();

            tx.commit();
            
            List<Technology> toReturn = new ArrayList<Technology>();
            for (int i = 0; i < 10; i++) {
				toReturn.add(result.get(i));
			}
            return toReturn;
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

    public void addTechnology(Technology technology) throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.saveOrUpdate(technology);

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

    public Technology getTechnologyForName(String techName) throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            Criteria criteria = session.createCriteria(Technology.class);

            criteria.add(Restrictions.eq("title",techName));

            Technology result = (Technology) criteria.uniqueResult();

            tx.commit();
            return result;
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

    public List<Technology> getTechnologies() {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            Criteria criteria = session.createCriteria(Technology.class);
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            List<Technology> result = criteria.list();

            tx.commit();

            return result;
        } catch(RuntimeException e) {
            tx.rollback();
        } finally {
            if(session!=null){
                session.close();
            }
        }

        return new ArrayList<Technology>();
    }

    public Technology getTechnology(long id) throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            Criteria criteria = session.createCriteria(Technology.class);

            criteria.add(Restrictions.eq("refId", id));

            Technology result = (Technology) criteria.uniqueResult();

            tx.commit();
            return result;
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
}

package com.blackrock.boris.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
    		
    		criteria.setMaxResults(10);
    		
    		@SuppressWarnings("unchecked")
			List<Technology> result = criteria.list();
    		
    		tx.commit();
    		return result;
    	}catch(RuntimeException e){
    		try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			log.error("Couldn’t roll back transaction", rbe);
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

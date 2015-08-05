package com.blackrock.boris.dao;

import com.blackrock.boris.dto.Event;
import com.blackrock.boris.exceptions.BorisInternalException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EventDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void postEvent(Event event) throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.save(event);

            tx.commit();
        }catch(RuntimeException e){
            tx.rollback();

            throw new BorisInternalException(e);
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }
}

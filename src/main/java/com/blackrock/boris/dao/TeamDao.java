package com.blackrock.boris.dao;

import com.blackrock.boris.dto.Team;
import com.blackrock.boris.exceptions.BorisInternalException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class TeamDao {
    private SessionFactory sessionFactory;

    public List<Team> getTeams() throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            Criteria criteria = session.createCriteria(Team.class);

            List<Team> result = criteria.list();

            tx.commit();

            return result;
        }catch(RuntimeException e){
            tx.rollback();

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

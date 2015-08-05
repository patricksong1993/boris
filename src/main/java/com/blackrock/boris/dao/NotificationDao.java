package com.blackrock.boris.dao;

import com.blackrock.boris.dto.Notification;
import com.blackrock.boris.dto.NotificationTemplate;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.utilities.NotificationTemplateType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class NotificationDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addNotification(Notification notification) throws BorisInternalException {
        Session session = null;
        Transaction tx = null;

        try{
            session = sessionFactory.openSession();
            tx = session.beginTransaction();
            tx.setTimeout(5);

            session.save(notification);

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

    public NotificationTemplate getTemplate(NotificationTemplateType type) {
        return new NotificationTemplate(type.getId());
    }
}

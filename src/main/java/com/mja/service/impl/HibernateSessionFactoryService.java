package com.mja.service.impl;

import com.mja.service.IHibernateSessionFactoryService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class HibernateSessionFactoryService implements IHibernateSessionFactoryService {

    private SessionFactory sessionFactory;

    public HibernateSessionFactoryService(SessionFactory sessionFactory) {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public Session getSession() {
        return this.sessionFactory.openSession();
    }
}

package com.mja.service;

import org.hibernate.Session;

public interface IHibernateSessionFactoryService {
    Session getSession();
}

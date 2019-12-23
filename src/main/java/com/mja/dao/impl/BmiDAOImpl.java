package com.mja.dao.impl;

import com.mja.dao.IBmiDAO;
import com.mja.model.Bmi;
import com.mja.service.IHibernateSessionFactoryService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class BmiDAOImpl implements IBmiDAO {

    @Autowired
    IHibernateSessionFactoryService sessionFactoryService;

    @Override
    public Bmi saveBmi(Bmi bmi) {
        Session session = this.sessionFactoryService.getSession();
        Transaction tx = session.beginTransaction();
        session.save(bmi);
        tx.commit();
        session.close();

        return bmi;
    }
}

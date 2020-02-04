package com.mja.dao.impl;

import com.mja.dao.IBmiDAO;
import com.mja.model.Bmi;
import com.mja.service.IHibernateSessionFactoryService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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

    @Override
    public List<Bmi> getAllBmis() {
        Session session = this.sessionFactoryService.getSession();
        Query query = session.createQuery("FROM com.mja.model.Bmi");
        List<Bmi> bmis = query.list();
        session.close();

        return bmis;
    }
}

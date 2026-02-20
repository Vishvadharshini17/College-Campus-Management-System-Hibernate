package com.placement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.placement.bean.Application;
import com.placement.util.HibernateUtil;

public class ApplicationDAO {

    public boolean insertApplication(Application a) throws Exception {

        Transaction tx = null;

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.save(a);
            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public List<Application> findApplicationsByStudent(String regNo)
            throws Exception {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            Query<Application> query =
                session.createQuery(
                    "FROM Application WHERE studentRegNo = :regNo",
                    Application.class);

            query.setParameter("regNo", regNo);

            return query.list();
        }
    }
}

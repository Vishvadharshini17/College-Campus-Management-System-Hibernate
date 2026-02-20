package com.placement.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.placement.bean.Company;
import com.placement.util.HibernateUtil;

public class CompanyDAO {

    public boolean insertCompany(Company c) throws Exception {

        Transaction tx = null;

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.save(c);
            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public Company findCompanyById(String companyId) throws Exception {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Company.class, companyId);
        }
    }
}

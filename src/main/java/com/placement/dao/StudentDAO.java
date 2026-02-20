package com.placement.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.placement.bean.Student;
import com.placement.util.HibernateUtil;

public class StudentDAO {

    public boolean insertStudent(Student s) throws Exception {

        Transaction tx = null;

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.save(s);
            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public Student findStudentByRegNo(String regNo) throws Exception {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Student.class, regNo);
        }
    }
}

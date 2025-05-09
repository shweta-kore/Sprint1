package com.tut.Attendance_managemnt.DAOImpl;

import com.tut.Attendance_managemnt.Dao.SubjectDAO;
import com.tut.Attendance_managemnt.Entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.tut.Attendance_managemnt.util.HibernateUtil;
import java.util.List;

public class SubjectDAOImpl implements SubjectDAO {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void saveSubject(Subject subject) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(subject);
            tx.commit();
        }
    }

    @Override
    public Subject getSubject(Long subjectId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Subject.class, subjectId);
        }
    }

    @Override
    public void updateSubject(Subject subject) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(subject);
            tx.commit();
        }
    }

    @Override
    public void deleteSubject(Long subjectId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            Subject subject = session.get(Subject.class, subjectId);
            if (subject != null) {
                session.delete(subject);
            }
            tx.commit();
        }
    }

    @Override
    public List<Subject> getAllSubjects() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Subject", Subject.class).getResultList();
        }
    }
}


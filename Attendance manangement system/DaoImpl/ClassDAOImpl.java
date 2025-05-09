package com.tut.Attendance_managemnt.DAOImpl;

import com.tut.Attendance_managemnt.Dao.ClassDAO;
import com.tut.Attendance_managemnt.Entity.ClassEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class ClassDAOImpl implements ClassDAO {
    private final SessionFactory sessionFactory; // Declare as final

    public ClassDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveClass(ClassEntity classEntity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(classEntity);
            transaction.commit();
        }
    }

    @Override
    public ClassEntity getClass(Long classId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(ClassEntity.class, classId);
        }
    }

    @Override
    public void updateClass(ClassEntity classEntity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(classEntity);
            transaction.commit();
        }
    }

    @Override
    public void deleteClass(Long classId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            ClassEntity classEntity = session.get(ClassEntity.class, classId);
            if (classEntity != null) {
                session.delete(classEntity);
            }
            transaction.commit();
        }
    }

    @Override
    public List<ClassEntity> getAllClasses() {
        try (Session session = sessionFactory.openSession()) {
            Query<ClassEntity> query = session.createQuery("from ClassEntity", ClassEntity.class);
            return query.list();
        }
    }
}
package com.tut.Attendance_managemnt.DAOImpl;

import com.tut.Attendance_managemnt.Dao.TeacherDAO;
import com.tut.Attendance_managemnt.Entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.tut.Attendance_managemnt.util.HibernateUtil;
import java.util.List;

public class TeacherDAOImpl implements TeacherDAO {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void saveTeacher(Teacher teacher) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(teacher);
            tx.commit();
        }
    }

    @Override
    public Teacher getTeacher(Long teacherId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Teacher.class, teacherId);
        }
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(teacher);
            tx.commit();
        }
    }

    @Override
    public void deleteTeacher(Long teacherId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            Teacher teacher = session.get(Teacher.class, teacherId);
            if (teacher != null) {
                session.delete(teacher);
            }
            tx.commit();
        }
    }

    @Override
    public List<Teacher> getAllTeachers() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Teacher", Teacher.class).getResultList();
        }
    }
}

package com.tut.Attendance_managemnt.DAOImpl;

import com.tut.Attendance_managemnt.Dao.StudentDAO;
import com.tut.Attendance_managemnt.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.tut.Attendance_managemnt.util.HibernateUtil;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void saveStudent(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(student);
            tx.commit();
        }
    }

    @Override
    public Student getStudent(Long studentId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Student.class, studentId);
        }
    }

    @Override
    public void updateStudent(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(student);
            tx.commit();
        }
    }

    @Override
    public void deleteStudent(Long studentId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
            }
            tx.commit();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Student", Student.class).getResultList();
        }
    }
}
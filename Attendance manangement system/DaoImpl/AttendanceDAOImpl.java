package com.tut.Attendance_managemnt.DAOImpl;

import com.tut.Attendance_managemnt.Dao.AttendanceDAO;
import com.tut.Attendance_managemnt.Entity.Attendance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.tut.Attendance_managemnt.util.HibernateUtil;
import java.util.List;

public class AttendanceDAOImpl implements AttendanceDAO {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void saveAttendance(Attendance attendance) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(attendance);
            tx.commit();
        }
    }

    @Override
    public Attendance getAttendance(Long attendanceId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Attendance.class, attendanceId);
        }
    }

    @Override
    public void updateAttendance(Attendance attendance) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(attendance);
            tx.commit();
        }
    }

    @Override
    public void deleteAttendance(Long attendanceId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            Attendance attendance = session.get(Attendance.class, attendanceId);
            if (attendance != null) {
                session.delete(attendance);
            }
            tx.commit();
        }
    }

    @Override
    public List<Attendance> getAllAttendances() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Attendance", Attendance.class).getResultList();
        }
    }
}
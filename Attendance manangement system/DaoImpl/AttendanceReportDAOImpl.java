
package com.tut.Attendance_managemnt.DAOImpl;

import com.tut.Attendance_managemnt.Dao.AttendanceReportDAO;
import com.tut.Attendance_managemnt.Entity.AttendanceReport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.tut.Attendance_managemnt.util.HibernateUtil;
import java.util.List;

public class AttendanceReportDAOImpl implements AttendanceReportDAO {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void saveAttendanceReport(AttendanceReport attendanceReport) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(attendanceReport);
            tx.commit();
        }
    }

    @Override
    public AttendanceReport getAttendanceReport(Long reportId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(AttendanceReport.class, reportId);
        }
    }

    @Override
    public void updateAttendanceReport(AttendanceReport attendanceReport) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(attendanceReport);
            tx.commit();
        }
    }

    @Override
    public void deleteAttendanceReport(Long reportId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            AttendanceReport attendanceReport = session.get(AttendanceReport.class, reportId);
            if (attendanceReport != null) {
                session.delete(attendanceReport);
            }
            tx.commit();
        }
    }

    @Override
    public List<AttendanceReport> getAllAttendanceReports() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM AttendanceReport", AttendanceReport.class).getResultList();
        }
    }
}

package com.tut.Attendance_managemnt.Service;

import com.tut.Attendance_managemnt.DAOImpl.AttendanceReportDAOImpl;
import com.tut.Attendance_managemnt.Entity.AttendanceReport;
import java.util.List;

public class AttendanceReportService {
    private AttendanceReportDAOImpl attendanceReportDAO;

    public AttendanceReportService() {
        attendanceReportDAO = new AttendanceReportDAOImpl();
    }

    public void saveAttendanceReport(AttendanceReport attendanceReport) {
        attendanceReportDAO.saveAttendanceReport(attendanceReport);
    }

    public AttendanceReport getAttendanceReport(Long reportId) {
        return attendanceReportDAO.getAttendanceReport(reportId);
    }

    public void updateAttendanceReport(AttendanceReport attendanceReport) {
        attendanceReportDAO.updateAttendanceReport(attendanceReport);
    }

    public void deleteAttendanceReport(Long reportId) {
        attendanceReportDAO.deleteAttendanceReport(reportId);
    }

    public List<AttendanceReport> getAllAttendanceReports() {
        return attendanceReportDAO.getAllAttendanceReports();
    }
}
package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.AttendanceReport;
import java.util.List;

public interface AttendanceReportDAO {
    void saveAttendanceReport(AttendanceReport attendanceReport);
    AttendanceReport getAttendanceReport(Long reportId);
    void updateAttendanceReport(AttendanceReport attendanceReport);
    void deleteAttendanceReport(Long reportId);
    List<AttendanceReport> getAllAttendanceReports();
}
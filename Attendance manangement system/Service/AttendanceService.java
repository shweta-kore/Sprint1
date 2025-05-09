package com.tut.Attendance_managemnt.Service;

import com.tut.Attendance_managemnt.DAOImpl.AttendanceDAOImpl;
import com.tut.Attendance_managemnt.Entity.Attendance;
import java.util.List;

public class AttendanceService {
    private AttendanceDAOImpl attendanceDAO;

    public AttendanceService() {
        attendanceDAO = new AttendanceDAOImpl();
    }

    public void saveAttendance(Attendance attendance) {
        attendanceDAO.saveAttendance(attendance);
    }

    public Attendance getAttendance(Long attendanceId) {
        return attendanceDAO.getAttendance(attendanceId);
    }

    public void updateAttendance(Attendance attendance) {
        attendanceDAO.updateAttendance(attendance);
    }

    public void deleteAttendance(Long attendanceId) {
        attendanceDAO.deleteAttendance(attendanceId);
    }

    public List<Attendance> getAllAttendances() {
        return attendanceDAO.getAllAttendances();
    }
}


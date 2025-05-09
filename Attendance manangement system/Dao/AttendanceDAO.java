package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Attendance;
import java.util.List;

public interface AttendanceDAO {
    void saveAttendance(Attendance attendance);
    Attendance getAttendance(Long attendanceId);
    void updateAttendance(Attendance attendance);
    void deleteAttendance(Long attendanceId);
    List<Attendance> getAllAttendances();
}
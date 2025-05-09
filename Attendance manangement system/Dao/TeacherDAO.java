package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Teacher;
import java.util.List;

public interface TeacherDAO {
    void saveTeacher(Teacher teacher);
    Teacher getTeacher(Long teacherId);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(Long teacherId);
    List<Teacher> getAllTeachers();
}

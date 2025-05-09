package com.tut.Attendance_managemnt.Service;

import com.tut.Attendance_managemnt.DAOImpl.TeacherDAOImpl;
import com.tut.Attendance_managemnt.Entity.Teacher;
import java.util.List;

public class TeacherService {
    private TeacherDAOImpl teacherDAO;

    public TeacherService() {
        teacherDAO = new TeacherDAOImpl();
    }

    public void saveTeacher(Teacher teacher) {
        teacherDAO.saveTeacher(teacher);
    }

    public Teacher getTeacher(Long teacherId) {
        return teacherDAO.getTeacher(teacherId);
    }

    public void updateTeacher(Teacher teacher) {
        teacherDAO.updateTeacher(teacher);
    }

    public void deleteTeacher(Long teacherId) {
        teacherDAO.deleteTeacher(teacherId);
    }

    public List<Teacher> getAllTeachers() {
        return teacherDAO.getAllTeachers();
    }
}
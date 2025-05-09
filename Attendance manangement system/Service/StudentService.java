package com.tut.Attendance_managemnt.Service;

import com.tut.Attendance_managemnt.DAOImpl.StudentDAOImpl;
import com.tut.Attendance_managemnt.Entity.Student;
import java.util.List;

public class StudentService {
    private StudentDAOImpl studentDAO;

    public StudentService() {
        studentDAO = new StudentDAOImpl();
    }

    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    public Student getStudent(Long studentId) {
        return studentDAO.getStudent(studentId);
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(Long studentId) {
        studentDAO.deleteStudent(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
}

package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Student;
import java.util.List;

public interface StudentDAO {
    void saveStudent(Student student);
    Student getStudent(Long studentId);
    void updateStudent(Student student);
    void deleteStudent(Long studentId);
    List<Student> getAllStudents();
}

package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.Subject;
import java.util.List;

public interface SubjectDAO {
    void saveSubject(Subject subject);
    Subject getSubject(Long subjectId);
    void updateSubject(Subject subject);
    void deleteSubject(Long subjectId);
    List<Subject> getAllSubjects();
}

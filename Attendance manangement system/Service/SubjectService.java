package com.tut.Attendance_managemnt.Service;

import com.tut.Attendance_managemnt.DAOImpl.SubjectDAOImpl;
import com.tut.Attendance_managemnt.Entity.Subject;
import java.util.List;

public class SubjectService {
    private SubjectDAOImpl subjectDAO;

    public SubjectService() {
        subjectDAO = new SubjectDAOImpl();
    }

    public void saveSubject(Subject subject) {
        subjectDAO.saveSubject(subject);
    }

    public Subject getSubject(Long subjectId) {
        return subjectDAO.getSubject(subjectId);
    }

    public void updateSubject(Subject subject) {
        subjectDAO.updateSubject(subject);
    }

    public void deleteSubject(Long subjectId) {
        subjectDAO.deleteSubject(subjectId);
    }

    public List<Subject> getAllSubjects() {
        return subjectDAO.getAllSubjects();
    }
}

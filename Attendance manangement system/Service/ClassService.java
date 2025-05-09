package com.tut.Attendance_managemnt.Service;

import com.tut.Attendance_managemnt.DAOImpl.ClassDAOImpl;
import com.tut.Attendance_managemnt.Entity.ClassEntity;
import com.tut.Attendance_managemnt.util.HibernateUtil;
import org.hibernate.SessionFactory; // Import SessionFactory
import java.util.List;

public class ClassService {
    private ClassDAOImpl classDAO;

    public ClassService() {
        // Corrected constructor to properly initialize ClassDAOImpl
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); // Obtain SessionFactory
        this.classDAO = new ClassDAOImpl(sessionFactory); // Pass the SessionFactory
    }

    public void saveClass(ClassEntity classEntity) {
        classDAO.saveClass(classEntity);
    }

    public ClassEntity getClass(Long classId) {
        return classDAO.getClass(classId);
    }

    public void updateClass(ClassEntity classEntity) {
        classDAO.updateClass(classEntity);
    }

    public void deleteClass(Long classId) {
        classDAO.deleteClass(classId);
    }

    public List<ClassEntity> getAllClasses() {
        return classDAO.getAllClasses();
    }
}
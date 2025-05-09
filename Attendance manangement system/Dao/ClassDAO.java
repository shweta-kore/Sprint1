package com.tut.Attendance_managemnt.Dao;

import com.tut.Attendance_managemnt.Entity.ClassEntity;
import java.util.List;

public interface ClassDAO {
    void saveClass(ClassEntity classEntity);
    ClassEntity getClass(Long classId);
    void updateClass(ClassEntity classEntity);
    void deleteClass(Long classId);
    List<ClassEntity> getAllClasses();
}
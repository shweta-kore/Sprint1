package com.tut.Attendance_managemnt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classID;

    private String className;

    // No-arg constructor
    public ClassEntity() {}

    // Constructor with parameters
    public ClassEntity(String className) {
        this.className = className;
    }

    // Getters and setters
    public Long getClassID() {
        return classID;
    }

    public void setClassID(Long classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "classID=" + classID +
                ", className='" + className + '\'' +
                '}';
    }
}

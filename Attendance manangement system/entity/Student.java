package com.tut.Attendance_managemnt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    private String name;
    private String email;
    private String rollNumber;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity classEntity;

    
    private String section;

    // No-arg constructor
    public Student() {}

    // Constructor with parameters
    public Student(String name, String email, String rollNumber, ClassEntity classEntity, String section) {
        this.name = name;
        this.email = email;
        this.rollNumber = rollNumber;
        this.classEntity = classEntity;
        this.section = section;
    }

    // Getters and setters
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", classEntity=" + classEntity +
                ", section='" + section + '\'' +
                '}';
    }
}

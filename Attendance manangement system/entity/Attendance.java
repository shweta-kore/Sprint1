package com.tut.Attendance_managemnt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private LocalDate attendanceDate;
    private String attendanceStatus;
    private String remarks;

    // No-arg constructor
    public Attendance() {}

    // Constructor with parameters
    public Attendance(Student student, LocalDate attendanceDate, String attendanceStatus, String remarks) {
        this.student = student;
        this.attendanceDate = attendanceDate;
        this.attendanceStatus = attendanceStatus;
        this.remarks = remarks;
    }

    // Getters and setters
    public Long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceID=" + attendanceID +
                ", student=" + student +
                ", attendanceDate=" + attendanceDate +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
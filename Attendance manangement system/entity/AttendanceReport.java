package com.tut.Attendance_managemnt.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.time.LocalDate;

@Entity
public class AttendanceReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private LocalDate attendanceDate;
    private String attendanceStatus;

    // No-arg constructor
    public AttendanceReport() {}

    // Constructor with parameters
    public AttendanceReport(Student student, LocalDate attendanceDate, String attendanceStatus) {
        this.student = student;
        this.attendanceDate = attendanceDate;
        this.attendanceStatus = attendanceStatus;
    }

    // Getters and setters
    public Long getReportID() {
        return reportID;
    }

    public void setReportID(Long reportID) {
        this.reportID = reportID;
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

    @Override
    public String toString() {
        return "AttendanceReport{" +
                "reportID=" + reportID +
                ", student=" + student +
                ", attendanceDate=" + attendanceDate +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                '}';
    }
}

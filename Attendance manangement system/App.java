package com.tut.Attendance_managemnt;

import com.tut.Attendance_managemnt.Entity.Attendance;
import com.tut.Attendance_managemnt.Entity.AttendanceReport;
import com.tut.Attendance_managemnt.Entity.ClassEntity;
import com.tut.Attendance_managemnt.Entity.Student;
import com.tut.Attendance_managemnt.Entity.Subject;
import com.tut.Attendance_managemnt.Entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        // Create a Hibernate configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // Create a Hibernate session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Create a Hibernate session
        Session session = sessionFactory.openSession();

        // Start a transaction
        session.beginTransaction();

        // Create a new class entity
        ClassEntity classEntity = new ClassEntity("Math");
        session.save(classEntity);

        // Create a new student entity
        Student student = new Student("John Doe", "john.doe@example.com", "123456", classEntity, "A");
        session.save(student);

        // Create a new attendance entity
        Attendance attendance = new Attendance(student, LocalDate.now(), "Present", "No remarks");
        session.save(attendance);

        // Create a new attendance report entity
        AttendanceReport attendanceReport = new AttendanceReport(student, LocalDate.now(), "Present");
        session.save(attendanceReport);

        // Create a new subject entity
        Subject subject = new Subject("Mathematics");
        session.save(subject);

        // Create a new teacher entity
        Teacher teacher = new Teacher("Jane Doe", "jane.doe@example.com");
        session.save(teacher);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the Hibernate session
        session.close();

        // Close the Hibernate session factory
        sessionFactory.close();
    }
}

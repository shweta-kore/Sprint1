
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
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AttendanceManagementSystem {
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Attendance Management System");
            System.out.println("1. Student Operations");
            System.out.println("2. Class Operations");
            System.out.println("3. Attendance Operations");
            System.out.println("4. Subject Operations");
            System.out.println("5. Teacher Operations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentOperations();
                    break;
                case 2:
                    classOperations();
                    break;
                case 3:
                    attendanceOperations();
                    break;
                case 4:
                    subjectOperations();
                    break;
                case 5:
                    teacherOperations();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void studentOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Operations");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("6. Back");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    listAllStudents();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    private static void teacherOperations() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Teacher Operations");
            System.out.println("1. Add Teacher");
            System.out.println("2. View Teacher");
            System.out.println("3. Update Teacher");
            System.out.println("4. Delete Teacher");
            System.out.println("5. List All Teachers");
            System.out.println("6. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    viewTeacher();
                    break;
                case 3:
                    updateTeacher();
                    break;
                case 4:
                    deleteTeacher();
                    break;
                case 5:
                    listAllTeachers();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    private static void classOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Class Operations");
            System.out.println("1. Add Class");
            System.out.println("2. View Class");
            System.out.println("3. Update Class");
            System.out.println("4. Delete Class");
            System.out.println("5. List All Classes");
            System.out.println("6. Back");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addClass();
                    break;
                case 2:
                    viewClass();
                    break;
                case 3:
                    updateClass();
                    break;
                case 4:
                    deleteClass();
                    break;
                case 5:
                    listAllClasses();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    private static void subjectOperations() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Subject Operations");
            System.out.println("1. Add Subject");
            System.out.println("2. View Subject");
            System.out.println("3. Update Subject");
            System.out.println("4. Delete Subject");
            System.out.println("5. List All Subjects");
            System.out.println("6. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    addSubject();
                    break;
                case 2:
                    viewSubject();
                    break;
                case 3:
                    updateSubject();
                    break;
                case 4:
                    deleteSubject();
                    break;
                case 5:
                    listAllSubjects();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
  private static void attendanceOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Attendance Operations");
            System.out.println("1. Add Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Update Attendance");
            System.out.println("4. Delete Attendance");
            System.out.println("5. List All Attendances");
            System.out.println("6. Back");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addAttendance();
                    break;
                case 2:
                    viewAttendance();
                    break;
                case 3:
                    updateAttendance();
                    break;
                case 4:
                    deleteAttendance();
                    break;
                case 5:
                    listAllAttendances();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter student section: ");
        String section = scanner.nextLine();

        ClassEntity classEntity = new ClassEntity("Math");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(classEntity);
        session.getTransaction().commit();

        session.beginTransaction();
        Student student = new Student(name, email, rollNumber, classEntity, section);
        student.setStudentID((long) (Math.random() * 1000)); // Generate a random student ID
        session.save(student);
        session.getTransaction().commit();
        session.close();

        System.out.println("Student added successfully with ID: " + student.getStudentID());
    }

    private static void viewStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        Long studentID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, studentID);
        session.close();

        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found");
        }
    }

    private static void updateStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        Long studentID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, studentID);

        if (student != null) {
            System.out.print("Enter new student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter new student email: ");
            String email = scanner.nextLine();

            System.out.print("Enter new student roll number: ");
            String rollNumber = scanner.nextLine();

            System.out.print("Enter new student section: ");
            String section = scanner.nextLine();

            student.setName(name);
            student.setEmail(email);
            student.setRollNumber(rollNumber);
            student.setSection(section);

            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
            session.close();

            System.out.println("Student updated successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        Long studentID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, studentID);

        if (student != null) {
            session.beginTransaction();
            session.delete(student);
            session.getTransaction().commit();
            session.close();

            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    private static void listAllStudents() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        javax.persistence.Query query = session.createQuery("FROM Student");
        java.util.List<Student> students = query.getResultList();

        session.getTransaction().commit();
        session.close();

        for (Student student : students) {
            System.out.println(student);
        }
    }


    private static void addClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter class name: ");
        String className = scanner.nextLine();

        ClassEntity classEntity = new ClassEntity(className);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(classEntity);
        session.getTransaction().commit();
        session.close();

        System.out.println("Class added successfully with ID: " + classEntity.getClassID());
    }

    private static void viewClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter class ID: ");
        Long classID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        ClassEntity classEntity = session.get(ClassEntity.class, classID);
        session.close();

        if (classEntity != null) {
            System.out.println(classEntity);
        } else {
            System.out.println("Class not found");
        }
    }

    private static void updateClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter class ID: ");
        Long classID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        ClassEntity classEntity = session.get(ClassEntity.class, classID);

        if (classEntity != null) {
            System.out.print("Enter new class name: ");
            String className = scanner.nextLine();

            classEntity.setClassName(className);

            session.beginTransaction();
            session.update(classEntity);
            session.getTransaction().commit();
            session.close();

            System.out.println("Class updated successfully");
        } else {
            System.out.println("Class not found");
        }
    }
    private static void deleteClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter class ID: ");
        Long classID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        ClassEntity classEntity = session.get(ClassEntity.class, classID);

        if (classEntity != null) {
            session.beginTransaction();
            session.delete(classEntity);
            session.getTransaction().commit();
            session.close();

            System.out.println("Class deleted successfully");
        } else {
            System.out.println("Class not found");
        }
    }

    private static void listAllClasses() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        javax.persistence.Query query = session.createQuery("FROM ClassEntity");
        java.util.List<ClassEntity> classes = query.getResultList();

        session.getTransaction().commit();
        session.close();

        for (ClassEntity classEntity : classes) {
            System.out.println(classEntity);
        }
    }

    private static void addAttendance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        Long studentID = scanner.nextLong();
        scanner.nextLine(); // Consume the newline left-over

        LocalDate attendanceDate;
        while (true) {
            System.out.print("Enter attendance date (yyyy-MM-dd): ");
            String dateStr = scanner.nextLine().trim();
            try {
                attendanceDate = LocalDate.parse(dateStr);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please try again.");
            }
        }

        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, studentID);

        if (student != null) {
            Attendance attendance = new Attendance(student, attendanceDate, "Present", "No remarks");
            session.beginTransaction();
            session.save(attendance);
            session.getTransaction().commit();
            session.close();
            System.out.println("Attendance added successfully");
        } else {
            System.out.println("Student not found");
        }
    }



    private static void viewAttendance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter attendance ID: ");
        Long attendanceID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Attendance attendance = session.get(Attendance.class, attendanceID);
        session.close();

        if (attendance != null) {
            System.out.println(attendance);
        } else {
            System.out.println("Attendance not found");
        }
    }

    private static void updateAttendance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter attendance ID: ");
        Long attendanceID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Attendance attendance = session.get(Attendance.class, attendanceID);

        if (attendance != null) {
            System.out.print("Enter new attendance status: ");
            String attendanceStatus = scanner.next();

            System.out.print("Enter new remarks: ");
            String remarks = scanner.next();

            attendance.setAttendanceStatus(attendanceStatus);
            attendance.setRemarks(remarks);

            session.beginTransaction();
            session.update(attendance);
            session.getTransaction().commit();
            session.close();

            System.out.println("Attendance updated successfully");
        } else {
            System.out.println("Attendance not found");
        }
    }

    private static void deleteAttendance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter attendance ID: ");
        Long attendanceID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Attendance attendance = session.get(Attendance.class, attendanceID);

        if (attendance != null) {
            session.beginTransaction();
            session.delete(attendance);
            session.getTransaction().commit();
            session.close();

            System.out.println("Attendance deleted successfully");
        } else {
            System.out.println("Attendance not found");
        }
    }

    private static void listAllAttendances() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        javax.persistence.Query query = session.createQuery("FROM Attendance");
        java.util.List<Attendance> attendances = query.getResultList();

        session.getTransaction().commit();
        session.close();

        for (Attendance attendance : attendances) {
            System.out.println(attendance);
        }
    }  
    private static void addSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject name: ");
        String subjectName = scanner.nextLine();
        Subject subject = new Subject(subjectName);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(subject);
        session.getTransaction().commit();
        session.close();
        System.out.println("Subject added successfully with ID: " + subject.getSubjectID());
    }

    private static void viewSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject ID: ");
        Long subjectID = scanner.nextLong();
        Session session = sessionFactory.openSession();
        Subject subject = session.get(Subject.class, subjectID);
        session.close();
        if (subject != null) {
            System.out.println("Subject ID: " + subject.getSubjectID());
            System.out.println("Subject Name: " + subject.getSubjectName());
        } else {
            System.out.println("Subject not found");
        }
    }

    private static void updateSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject ID: ");
        Long subjectID = scanner.nextLong();
        Session session = sessionFactory.openSession();
        Subject subject = session.get(Subject.class, subjectID);
        if (subject != null) {
            System.out.print("Enter new subject name: ");
            String subjectName = scanner.next();
            subject.setSubjectName(subjectName);
            session.beginTransaction();
            session.update(subject);
            session.getTransaction().commit();
            session.close();
            System.out.println("Subject updated successfully");
        } else {
            System.out.println("Subject not found");
        }
    }

    private static void deleteSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject ID: ");
        Long subjectID = scanner.nextLong();
        Session session = sessionFactory.openSession();
        Subject subject = session.get(Subject.class, subjectID);
        if (subject != null) {
            session.beginTransaction();
            session.delete(subject);
            session.getTransaction().commit();
            session.close();
            System.out.println("Subject deleted successfully");
        } else {
            System.out.println("Subject not found");
        }
    }

    private static void listAllSubjects() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        javax.persistence.Query query = session.createQuery("FROM Subject");
        java.util.List<Subject> subjects = query.getResultList();
        session.getTransaction().commit();
        session.close();
        for (Subject subject : subjects) {
            System.out.println("Subject ID: " + subject.getSubjectID());
            System.out.println("Subject Name: " + subject.getSubjectName());
            System.out.println("------------------------");
        }
    }

    private static void addTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter teacher email: ");
        String teacherEmail = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherEmail);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();
        session.close();
        System.out.println("Teacher added successfully with ID: " + teacher.getTeacherID());
    }


    private static void viewTeacher() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter teacher ID: ");
        Long teacherID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Teacher teacher = session.get(Teacher.class, teacherID);
        session.close();

        if (teacher != null) {
            System.out.println(teacher);
        } else {
            System.out.println("Teacher not found");
        }
    }

    private static void updateTeacher() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter teacher ID: ");
        Long teacherID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Teacher teacher = session.get(Teacher.class, teacherID);

        if (teacher != null) {
            System.out.print("Enter new teacher name: ");
            String teacherName = scanner.nextLine();

            System.out.print("Enter new teacher email: ");
            String teacherEmail = scanner.nextLine();

            teacher.setName(teacherName);
            teacher.setEmail(teacherEmail);

            session.beginTransaction();
            session.update(teacher);
            session.getTransaction().commit();
            session.close();

            System.out.println("Teacher updated successfully");
        } else {
            System.out.println("Teacher not found");
        }
    }

    private static void deleteTeacher() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter teacher ID: ");
        Long teacherID = scanner.nextLong();

        Session session = sessionFactory.openSession();
        Teacher teacher = session.get(Teacher.class, teacherID);

        if (teacher != null) {
            session.beginTransaction();
            session.delete(teacher);
            session.getTransaction().commit();
            session.close();

            System.out.println("Teacher deleted successfully");
        } else {
            System.out.println("Teacher not found");
        }
    }

    private static void listAllTeachers() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        javax.persistence.Query query = session.createQuery("FROM Teacher");
        java.util.List<Teacher> teachers = query.getResultList();

        session.getTransaction().commit();
        session.close();

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    }


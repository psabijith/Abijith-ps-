package com.aitrich.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aitrich.entity.Students;

public class StudentDAO {

    // ---------- SESSION FACTORY (single instance) ----------
    private static final SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students.class).buildSessionFactory();

    // ---------- INSERT ----------
    public static void insertStudent(String name, String course, long phone) {

        Students stud = new Students();
        stud.setName(name);
        stud.setCourse(course);
        stud.setPhone(phone);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(stud);

        tx.commit();
        session.close();
    }

    // ---------- SELECT BY ID ----------
    public static Students getStudentById(int id) {

        Session session = sf.openSession();
        Students student = session.get(Students.class, id);
        session.close();

        return student;
    }

    // ---------- SELECT ALL ----------
    public static List<Students> getAllStudents() {

        Session session = sf.openSession();
        List<Students> list =session.createQuery("from Students", Students.class).list();
        session.close();

        return list;
    }

    // ---------- UPDATE ----------
    public static void updateStudentCourse(int id, String newCourse) {

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Students student = session.get(Students.class, id);
        student.setCourse(newCourse);

        tx.commit();
        session.close();
    }

    // ---------- DELETE ----------
    public static void deleteStudent(int id) {

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Students student = session.get(Students.class, id);
        session.remove(student);

        tx.commit();
        session.close();
    }

    // ---------- MAIN (TEST ALL METHODS) ----------
    public static void main(String[] args) throws Exception {

        // INSERT
        insertStudent("Abijith ps", "Java", 8089004951L);

        // SELECT BY ID
        Students s = getStudentById(1);
        System.out.println(s.getName() + " " + s.getCourse());

        // UPDATE
        updateStudentCourse(1, "Advanced Java");

        // SELECT ALL
        for (Students st : getAllStudents()) {
            System.out.println(st.getId() + " " + st.getName());
        }


        // DELETE
        deleteStudent(1);

        sf.close();
    }
}

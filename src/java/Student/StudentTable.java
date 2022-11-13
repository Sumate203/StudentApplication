/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author kant2
 */
public class StudentTable {
     public static void insertStudent(Student std) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CheckInput");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(std);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
     
    public static Student findStudentById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CheckInput");
        EntityManager em = emf.createEntityManager();
        Student std = em.find(Student.class, id);
        em.close();
        return std;
    }
    public static List<Student> findAllStudent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CheckInput");
        EntityManager em = emf.createEntityManager();
        List<Student> stdList = (List<Student>) em.createNamedQuery("Student.findAll").getResultList();
        em.close();
        return stdList;
    }
    public static List<Student> findStudentByName(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CheckInput");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findByName");
        query.setParameter("name", name);
        List<Student> stdList = (List<Student>) query.getResultList();
        em.close();
        return stdList;
    }
}

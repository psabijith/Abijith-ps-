package com.aitrich.DAO;

import java.util.List;

import com.aitrich.Entity.JobSeeker;
import jakarta.persistence.EntityManager;

public class JobSeekerDAO {

    private EntityManager em;

    public JobSeekerDAO(EntityManager em) {
        this.em = em;
    }

    /* CREATE */
    public void save(JobSeeker jobSeeker) {
        em.getTransaction().begin();
        em.persist(jobSeeker);
        em.getTransaction().commit();
    }

    /* READ by ID */
    public JobSeeker findById(int id) {
        return em.find(JobSeeker.class, id);
    }

    /* READ by Email */
    public JobSeeker findByEmail(String email) {
        return em.createQuery(
                "SELECT j FROM JobSeeker j WHERE j.email = :email",
                JobSeeker.class
        )
        .setParameter("email", email)
        .getSingleResult();
    }

    /* READ all */
    public List<JobSeeker> findAll() {
        return em.createQuery(
                "SELECT j FROM JobSeeker j",
                JobSeeker.class
        ).getResultList();
    }

    /* UPDATE */
    public void update(JobSeeker jobSeeker) {
        em.getTransaction().begin();
        em.merge(jobSeeker);
        em.getTransaction().commit();
    }

    /* DELETE */
    public void delete(int id) {
        em.getTransaction().begin();
        JobSeeker seeker = em.find(JobSeeker.class, id);
        if (seeker != null) {
            em.remove(seeker);
        }
        em.getTransaction().commit();
    }
}

package com.aitrich.DAO;

import java.util.List;

import com.aitrich.Entity.Application;
import com.aitrich.Entity.JobSeeker;

import jakarta.persistence.EntityManager;

public class ApplicationDAO {

    private EntityManager em;

    public ApplicationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Application app) {
        em.getTransaction().begin();
        em.persist(app);
        em.getTransaction().commit();
    }

    public void update(Application app) {
        em.getTransaction().begin();
        em.merge(app);
        em.getTransaction().commit();
    }

    public void delete(int id) {
        em.getTransaction().begin();
        Application app = em.find(Application.class, id);
        em.remove(app);
        em.getTransaction().commit();
    }

    public List<Application> findByJobSeeker(int seekerId) {
        return em.createQuery(
                "SELECT a FROM Application a WHERE a.jobSeeker.id = :sid",
                Application.class)
                .setParameter("sid", seekerId)
                .getResultList();
    }

    public List<JobSeeker> findApplicantsForJob(int jobId) {
        return em.createQuery(
                "SELECT a.jobSeeker FROM Application a WHERE a.job.id = :jid",
                JobSeeker.class)
                .setParameter("jid", jobId)
                .getResultList();
    }
}


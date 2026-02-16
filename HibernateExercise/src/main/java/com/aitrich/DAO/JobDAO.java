package com.aitrich.DAO;

import java.util.List;
import com.aitrich.Entity.Job;
import jakarta.persistence.EntityManager;

public class JobDAO {

    private EntityManager em;

    public JobDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Job job) {
        em.getTransaction().begin();
        em.persist(job);
        em.getTransaction().commit();
    }

    public void update(Job job) {
        em.getTransaction().begin();
        em.merge(job);
        em.getTransaction().commit();
    }

    public void delete(int id) {
        em.getTransaction().begin();
        Job job = em.find(Job.class, id);
        if (job != null) {
            em.remove(job);
        }
        em.getTransaction().commit();
    }

    public List<Job> findJobsByCompany(int companyId) {
        return em.createQuery(
                "SELECT j FROM Job j WHERE j.company.id = :cid",
                Job.class)
                .setParameter("cid", companyId)
                .getResultList();
    }
}

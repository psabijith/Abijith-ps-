package com.aitrich.DAO;

import java.util.List;

import com.aitrich.Entity.Company;

import jakarta.persistence.EntityManager;

public class CompanyDAO {

    private EntityManager em;

    public CompanyDAO(EntityManager em) {
        this.em = em;
    }

    /* CREATE */
    public void save(Company company) {
        em.getTransaction().begin();
        em.persist(company);
        em.getTransaction().commit();
    }

    /* READ by ID */
    public Company findById(int id) {
        return em.find(Company.class, id);
    }

    /* READ all */
    public List<Company> findAll() {
        return em.createQuery(
                "SELECT c FROM Company c",
                Company.class
        ).getResultList();
    }

    /* UPDATE */
    public void update(Company company) {
        em.getTransaction().begin();
        em.merge(company);
        em.getTransaction().commit();
    }

    /* DELETE */
    public void delete(int id) {
        em.getTransaction().begin();
        Company company = em.find(Company.class, id);
        if (company != null) {
            em.remove(company);
        }
        em.getTransaction().commit();
    }
}

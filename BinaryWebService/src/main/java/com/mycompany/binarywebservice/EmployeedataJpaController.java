/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarywebservice;

import com.mycompany.binarywebservice.exceptions.NonexistentEntityException;
import com.mycompany.binarywebservice.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author shelc
 */
public class EmployeedataJpaController implements Serializable {

    public EmployeedataJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Employeedata employeedata) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(employeedata);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEmployeedata(employeedata.getId()) != null) {
                throw new PreexistingEntityException("Employeedata " + employeedata + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Employeedata employeedata) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            employeedata = em.merge(employeedata);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = employeedata.getId();
                if (findEmployeedata(id) == null) {
                    throw new NonexistentEntityException("The employeedata with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Employeedata employeedata;
            try {
                employeedata = em.getReference(Employeedata.class, id);
                employeedata.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The employeedata with id " + id + " no longer exists.", enfe);
            }
            em.remove(employeedata);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Employeedata> findEmployeedataEntities() {
        return findEmployeedataEntities(true, -1, -1);
    }

    public List<Employeedata> findEmployeedataEntities(int maxResults, int firstResult) {
        return findEmployeedataEntities(false, maxResults, firstResult);
    }

    private List<Employeedata> findEmployeedataEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Employeedata.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Employeedata findEmployeedata(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Employeedata.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmployeedataCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Employeedata> rt = cq.from(Employeedata.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

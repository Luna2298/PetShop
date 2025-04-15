package com.mycompany.petshop.persistencia;

import com.mycompany.petshop.logica.DetalleVentaTurno;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class DetalleVentaTurnoJpaController implements Serializable {

    public DetalleVentaTurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DetalleVentaTurnoJpaController() {
    
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleVentaTurno detalleVentaTurno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleVentaTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleVentaTurno detalleVentaTurno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleVentaTurno = em.merge(detalleVentaTurno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalleVentaTurno.getIdDetalleVentaTurno();
                if (findDetalleVentaTurno(id) == null) {
                    throw new NonexistentEntityException("The detalleVentaTurno with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DetalleVentaTurno detalleVentaTurno;
            try {
                detalleVentaTurno = em.getReference(DetalleVentaTurno.class, id);
                detalleVentaTurno.getIdDetalleVentaTurno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleVentaTurno with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleVentaTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleVentaTurno> findDetalleVentaTurnoEntities() {
        return findDetalleVentaTurnoEntities(true, -1, -1);
    }

    public List<DetalleVentaTurno> findDetalleVentaTurnoEntities(int maxResults, int firstResult) {
        return findDetalleVentaTurnoEntities(false, maxResults, firstResult);
    }

    private List<DetalleVentaTurno> findDetalleVentaTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleVentaTurno.class));
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

    public DetalleVentaTurno findDetalleVentaTurno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleVentaTurno.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleVentaTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleVentaTurno> rt = cq.from(DetalleVentaTurno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

package com.mycompany.petshop.persistencia;

import com.mycompany.petshop.logica.Relacion;
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


public class RelacionJpaController implements Serializable {

    public RelacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public RelacionJpaController() {
    
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Relacion relacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(relacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Relacion relacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            relacion = em.merge(relacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = relacion.getIdRelacion();
                if (findRelacion(id) == null) {
                    throw new NonexistentEntityException("The relacion with id " + id + " no longer exists.");
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
            Relacion relacion;
            try {
                relacion = em.getReference(Relacion.class, id);
                relacion.getIdRelacion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The relacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(relacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Relacion> findRelacionEntities() {
        return findRelacionEntities(true, -1, -1);
    }

    public List<Relacion> findRelacionEntities(int maxResults, int firstResult) {
        return findRelacionEntities(false, maxResults, firstResult);
    }

    private List<Relacion> findRelacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Relacion.class));
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

    public Relacion findRelacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Relacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getRelacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Relacion> rt = cq.from(Relacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

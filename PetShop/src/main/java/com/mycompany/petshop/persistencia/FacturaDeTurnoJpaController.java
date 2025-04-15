package com.mycompany.petshop.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.FacturaDeTurno;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FacturaDeTurnoJpaController implements Serializable {

    public FacturaDeTurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public FacturaDeTurnoJpaController() {
    
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FacturaDeTurno facturaDeTurno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio duenio = facturaDeTurno.getDuenio();
            if (duenio != null) {
                duenio = em.getReference(duenio.getClass(), duenio.getIdDuenio());
                facturaDeTurno.setDuenio(duenio);
            }
            em.persist(facturaDeTurno);
            if (duenio != null) {
                duenio.getListaFacturasTurno().add(facturaDeTurno);
                duenio = em.merge(duenio);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FacturaDeTurno facturaDeTurno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            FacturaDeTurno persistentFacturaDeTurno = em.find(FacturaDeTurno.class, facturaDeTurno.getIdFacturaTurno());
            Duenio duenioOld = persistentFacturaDeTurno.getDuenio();
            Duenio duenioNew = facturaDeTurno.getDuenio();
            if (duenioNew != null) {
                duenioNew = em.getReference(duenioNew.getClass(), duenioNew.getIdDuenio());
                facturaDeTurno.setDuenio(duenioNew);
            }
            facturaDeTurno = em.merge(facturaDeTurno);
            if (duenioOld != null && !duenioOld.equals(duenioNew)) {
                duenioOld.getListaFacturasTurno().remove(facturaDeTurno);
                duenioOld = em.merge(duenioOld);
            }
            if (duenioNew != null && !duenioNew.equals(duenioOld)) {
                duenioNew.getListaFacturasTurno().add(facturaDeTurno);
                duenioNew = em.merge(duenioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = facturaDeTurno.getIdFacturaTurno();
                if (findFacturaDeTurno(id) == null) {
                    throw new NonexistentEntityException("The facturaDeTurno with id " + id + " no longer exists.");
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
            FacturaDeTurno facturaDeTurno;
            try {
                facturaDeTurno = em.getReference(FacturaDeTurno.class, id);
                facturaDeTurno.getIdFacturaTurno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The facturaDeTurno with id " + id + " no longer exists.", enfe);
            }
            Duenio duenio = facturaDeTurno.getDuenio();
            if (duenio != null) {
                duenio.getListaFacturasTurno().remove(facturaDeTurno);
                duenio = em.merge(duenio);
            }
            em.remove(facturaDeTurno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FacturaDeTurno> findFacturaDeTurnoEntities() {
        return findFacturaDeTurnoEntities(true, -1, -1);
    }

    public List<FacturaDeTurno> findFacturaDeTurnoEntities(int maxResults, int firstResult) {
        return findFacturaDeTurnoEntities(false, maxResults, firstResult);
    }

    private List<FacturaDeTurno> findFacturaDeTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FacturaDeTurno.class));
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

    public FacturaDeTurno findFacturaDeTurno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FacturaDeTurno.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturaDeTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FacturaDeTurno> rt = cq.from(FacturaDeTurno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

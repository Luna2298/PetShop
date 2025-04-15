package com.mycompany.petshop.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.petshop.logica.Mascota;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.Turno;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TurnoJpaController implements Serializable {

    public TurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public TurnoJpaController() {
    
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Turno turno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota mascota = turno.getMascota();
            if (mascota != null) {
                mascota = em.getReference(mascota.getClass(), mascota.getIdMascota());
                turno.setMascota(mascota);
            }
            Duenio duenio = turno.getDuenio();
            if (duenio != null) {
                duenio = em.getReference(duenio.getClass(), duenio.getIdDuenio());
                turno.setDuenio(duenio);
            }
            em.persist(turno);
            if (mascota != null) {
                mascota.getListaTurnos().add(turno);
                mascota = em.merge(mascota);
            }
            if (duenio != null) {
                duenio.getListaTurnos().add(turno);
                duenio = em.merge(duenio);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Turno turno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Turno persistentTurno = em.find(Turno.class, turno.getIdTurno());
            Mascota mascotaOld = persistentTurno.getMascota();
            Mascota mascotaNew = turno.getMascota();
            Duenio duenioOld = persistentTurno.getDuenio();
            Duenio duenioNew = turno.getDuenio();
            if (mascotaNew != null) {
                mascotaNew = em.getReference(mascotaNew.getClass(), mascotaNew.getIdMascota());
                turno.setMascota(mascotaNew);
            }
            if (duenioNew != null) {
                duenioNew = em.getReference(duenioNew.getClass(), duenioNew.getIdDuenio());
                turno.setDuenio(duenioNew);
            }
            turno = em.merge(turno);
            if (mascotaOld != null && !mascotaOld.equals(mascotaNew)) {
                mascotaOld.getListaTurnos().remove(turno);
                mascotaOld = em.merge(mascotaOld);
            }
            if (mascotaNew != null && !mascotaNew.equals(mascotaOld)) {
                mascotaNew.getListaTurnos().add(turno);
                mascotaNew = em.merge(mascotaNew);
            }
            if (duenioOld != null && !duenioOld.equals(duenioNew)) {
                duenioOld.getListaTurnos().remove(turno);
                duenioOld = em.merge(duenioOld);
            }
            if (duenioNew != null && !duenioNew.equals(duenioOld)) {
                duenioNew.getListaTurnos().add(turno);
                duenioNew = em.merge(duenioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = turno.getIdTurno();
                if (findTurno(id) == null) {
                    throw new NonexistentEntityException("The turno with id " + id + " no longer exists.");
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
            Turno turno;
            try {
                turno = em.getReference(Turno.class, id);
                turno.getIdTurno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The turno with id " + id + " no longer exists.", enfe);
            }
            Mascota mascota = turno.getMascota();
            if (mascota != null) {
                mascota.getListaTurnos().remove(turno);
                mascota = em.merge(mascota);
            }
            Duenio duenio = turno.getDuenio();
            if (duenio != null) {
                duenio.getListaTurnos().remove(turno);
                duenio = em.merge(duenio);
            }
            em.remove(turno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Turno> findTurnoEntities() {
        return findTurnoEntities(true, -1, -1);
    }

    public List<Turno> findTurnoEntities(int maxResults, int firstResult) {
        return findTurnoEntities(false, maxResults, firstResult);
    }

    private List<Turno> findTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Turno.class));
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

    public Turno findTurno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Turno.class, id);
        } finally {
            em.close();
        }
    }

    public int getTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Turno> rt = cq.from(Turno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

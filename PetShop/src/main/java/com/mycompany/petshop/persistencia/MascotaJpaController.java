package com.mycompany.petshop.persistencia;

import com.mycompany.petshop.logica.Mascota;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.petshop.logica.Turno;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MascotaJpaController implements Serializable {

    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

     public MascotaJpaController() {
        
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mascota mascota) {
        if (mascota.getListaTurnos() == null) {
            mascota.setListaTurnos(new ArrayList<Turno>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Turno> attachedListaTurnos = new ArrayList<Turno>();
            for (Turno listaTurnosTurnoToAttach : mascota.getListaTurnos()) {
                listaTurnosTurnoToAttach = em.getReference(listaTurnosTurnoToAttach.getClass(), listaTurnosTurnoToAttach.getIdTurno());
                attachedListaTurnos.add(listaTurnosTurnoToAttach);
            }
            mascota.setListaTurnos(attachedListaTurnos);
            em.persist(mascota);
            for (Turno listaTurnosTurno : mascota.getListaTurnos()) {
                Mascota oldMascotaOfListaTurnosTurno = listaTurnosTurno.getMascota();
                listaTurnosTurno.setMascota(mascota);
                listaTurnosTurno = em.merge(listaTurnosTurno);
                if (oldMascotaOfListaTurnosTurno != null) {
                    oldMascotaOfListaTurnosTurno.getListaTurnos().remove(listaTurnosTurno);
                    oldMascotaOfListaTurnosTurno = em.merge(oldMascotaOfListaTurnosTurno);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mascota mascota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota persistentMascota = em.find(Mascota.class, mascota.getIdMascota());
            List<Turno> listaTurnosOld = persistentMascota.getListaTurnos();
            List<Turno> listaTurnosNew = mascota.getListaTurnos();
            List<Turno> attachedListaTurnosNew = new ArrayList<Turno>();
            for (Turno listaTurnosNewTurnoToAttach : listaTurnosNew) {
                listaTurnosNewTurnoToAttach = em.getReference(listaTurnosNewTurnoToAttach.getClass(), listaTurnosNewTurnoToAttach.getIdTurno());
                attachedListaTurnosNew.add(listaTurnosNewTurnoToAttach);
            }
            listaTurnosNew = attachedListaTurnosNew;
            mascota.setListaTurnos(listaTurnosNew);
            mascota = em.merge(mascota);
            for (Turno listaTurnosOldTurno : listaTurnosOld) {
                if (!listaTurnosNew.contains(listaTurnosOldTurno)) {
                    listaTurnosOldTurno.setMascota(null);
                    listaTurnosOldTurno = em.merge(listaTurnosOldTurno);
                }
            }
            for (Turno listaTurnosNewTurno : listaTurnosNew) {
                if (!listaTurnosOld.contains(listaTurnosNewTurno)) {
                    Mascota oldMascotaOfListaTurnosNewTurno = listaTurnosNewTurno.getMascota();
                    listaTurnosNewTurno.setMascota(mascota);
                    listaTurnosNewTurno = em.merge(listaTurnosNewTurno);
                    if (oldMascotaOfListaTurnosNewTurno != null && !oldMascotaOfListaTurnosNewTurno.equals(mascota)) {
                        oldMascotaOfListaTurnosNewTurno.getListaTurnos().remove(listaTurnosNewTurno);
                        oldMascotaOfListaTurnosNewTurno = em.merge(oldMascotaOfListaTurnosNewTurno);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mascota.getIdMascota();
                if (findMascota(id) == null) {
                    throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.");
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
            Mascota mascota;
            try {
                mascota = em.getReference(Mascota.class, id);
                mascota.getIdMascota();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.", enfe);
            }
            List<Turno> listaTurnos = mascota.getListaTurnos();
            for (Turno listaTurnosTurno : listaTurnos) {
                listaTurnosTurno.setMascota(null);
                listaTurnosTurno = em.merge(listaTurnosTurno);
            }
            em.remove(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mascota> findMascotaEntities() {
        return findMascotaEntities(true, -1, -1);
    }

    public List<Mascota> findMascotaEntities(int maxResults, int firstResult) {
        return findMascotaEntities(false, maxResults, firstResult);
    }

    private List<Mascota> findMascotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mascota.class));
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

    public Mascota findMascota(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascota.class, id);
        } finally {
            em.close();
        }
    }

    public int getMascotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mascota> rt = cq.from(Mascota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

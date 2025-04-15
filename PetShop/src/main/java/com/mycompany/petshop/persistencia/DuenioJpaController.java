package com.mycompany.petshop.persistencia;

import com.mycompany.petshop.logica.Duenio;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.petshop.logica.Turno;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.FacturaDeTurno;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DuenioJpaController implements Serializable {

    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DuenioJpaController() {
    
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Duenio duenio) {
        if (duenio.getListaTurnos() == null) {
            duenio.setListaTurnos(new ArrayList<Turno>());
        }
        if (duenio.getListaFacturas() == null) {
            duenio.setListaFacturas(new ArrayList<Factura>());
        }
        if (duenio.getListaFacturasTurno() == null) {
            duenio.setListaFacturasTurno(new ArrayList<FacturaDeTurno>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Turno> attachedListaTurnos = new ArrayList<Turno>();
            for (Turno listaTurnosTurnoToAttach : duenio.getListaTurnos()) {
                listaTurnosTurnoToAttach = em.getReference(listaTurnosTurnoToAttach.getClass(), listaTurnosTurnoToAttach.getIdTurno());
                attachedListaTurnos.add(listaTurnosTurnoToAttach);
            }
            duenio.setListaTurnos(attachedListaTurnos);
            List<Factura> attachedListaFacturas = new ArrayList<Factura>();
            for (Factura listaFacturasFacturaToAttach : duenio.getListaFacturas()) {
                listaFacturasFacturaToAttach = em.getReference(listaFacturasFacturaToAttach.getClass(), listaFacturasFacturaToAttach.getIdFactura());
                attachedListaFacturas.add(listaFacturasFacturaToAttach);
            }
            duenio.setListaFacturas(attachedListaFacturas);
            List<FacturaDeTurno> attachedListaFacturasTurno = new ArrayList<FacturaDeTurno>();
            for (FacturaDeTurno listaFacturasTurnoFacturaDeTurnoToAttach : duenio.getListaFacturasTurno()) {
                listaFacturasTurnoFacturaDeTurnoToAttach = em.getReference(listaFacturasTurnoFacturaDeTurnoToAttach.getClass(), listaFacturasTurnoFacturaDeTurnoToAttach.getIdFacturaTurno());
                attachedListaFacturasTurno.add(listaFacturasTurnoFacturaDeTurnoToAttach);
            }
            duenio.setListaFacturasTurno(attachedListaFacturasTurno);
            em.persist(duenio);
            for (Turno listaTurnosTurno : duenio.getListaTurnos()) {
                Duenio oldDuenioOfListaTurnosTurno = listaTurnosTurno.getDuenio();
                listaTurnosTurno.setDuenio(duenio);
                listaTurnosTurno = em.merge(listaTurnosTurno);
                if (oldDuenioOfListaTurnosTurno != null) {
                    oldDuenioOfListaTurnosTurno.getListaTurnos().remove(listaTurnosTurno);
                    oldDuenioOfListaTurnosTurno = em.merge(oldDuenioOfListaTurnosTurno);
                }
            }
            for (Factura listaFacturasFactura : duenio.getListaFacturas()) {
                Duenio oldDuenioOfListaFacturasFactura = listaFacturasFactura.getDuenio();
                listaFacturasFactura.setDuenio(duenio);
                listaFacturasFactura = em.merge(listaFacturasFactura);
                if (oldDuenioOfListaFacturasFactura != null) {
                    oldDuenioOfListaFacturasFactura.getListaFacturas().remove(listaFacturasFactura);
                    oldDuenioOfListaFacturasFactura = em.merge(oldDuenioOfListaFacturasFactura);
                }
            }
            for (FacturaDeTurno listaFacturasTurnoFacturaDeTurno : duenio.getListaFacturasTurno()) {
                Duenio oldDuenioOfListaFacturasTurnoFacturaDeTurno = listaFacturasTurnoFacturaDeTurno.getDuenio();
                listaFacturasTurnoFacturaDeTurno.setDuenio(duenio);
                listaFacturasTurnoFacturaDeTurno = em.merge(listaFacturasTurnoFacturaDeTurno);
                if (oldDuenioOfListaFacturasTurnoFacturaDeTurno != null) {
                    oldDuenioOfListaFacturasTurnoFacturaDeTurno.getListaFacturasTurno().remove(listaFacturasTurnoFacturaDeTurno);
                    oldDuenioOfListaFacturasTurnoFacturaDeTurno = em.merge(oldDuenioOfListaFacturasTurnoFacturaDeTurno);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Duenio duenio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio persistentDuenio = em.find(Duenio.class, duenio.getIdDuenio());
            List<Turno> listaTurnosOld = persistentDuenio.getListaTurnos();
            List<Turno> listaTurnosNew = duenio.getListaTurnos();
            List<Factura> listaFacturasOld = persistentDuenio.getListaFacturas();
            List<Factura> listaFacturasNew = duenio.getListaFacturas();
            List<FacturaDeTurno> listaFacturasTurnoOld = persistentDuenio.getListaFacturasTurno();
            List<FacturaDeTurno> listaFacturasTurnoNew = duenio.getListaFacturasTurno();
            List<Turno> attachedListaTurnosNew = new ArrayList<Turno>();
            for (Turno listaTurnosNewTurnoToAttach : listaTurnosNew) {
                listaTurnosNewTurnoToAttach = em.getReference(listaTurnosNewTurnoToAttach.getClass(), listaTurnosNewTurnoToAttach.getIdTurno());
                attachedListaTurnosNew.add(listaTurnosNewTurnoToAttach);
            }
            listaTurnosNew = attachedListaTurnosNew;
            duenio.setListaTurnos(listaTurnosNew);
            List<Factura> attachedListaFacturasNew = new ArrayList<Factura>();
            for (Factura listaFacturasNewFacturaToAttach : listaFacturasNew) {
                listaFacturasNewFacturaToAttach = em.getReference(listaFacturasNewFacturaToAttach.getClass(), listaFacturasNewFacturaToAttach.getIdFactura());
                attachedListaFacturasNew.add(listaFacturasNewFacturaToAttach);
            }
            listaFacturasNew = attachedListaFacturasNew;
            duenio.setListaFacturas(listaFacturasNew);
            List<FacturaDeTurno> attachedListaFacturasTurnoNew = new ArrayList<FacturaDeTurno>();
            for (FacturaDeTurno listaFacturasTurnoNewFacturaDeTurnoToAttach : listaFacturasTurnoNew) {
                listaFacturasTurnoNewFacturaDeTurnoToAttach = em.getReference(listaFacturasTurnoNewFacturaDeTurnoToAttach.getClass(), listaFacturasTurnoNewFacturaDeTurnoToAttach.getIdFacturaTurno());
                attachedListaFacturasTurnoNew.add(listaFacturasTurnoNewFacturaDeTurnoToAttach);
            }
            listaFacturasTurnoNew = attachedListaFacturasTurnoNew;
            duenio.setListaFacturasTurno(listaFacturasTurnoNew);
            duenio = em.merge(duenio);
            for (Turno listaTurnosOldTurno : listaTurnosOld) {
                if (!listaTurnosNew.contains(listaTurnosOldTurno)) {
                    listaTurnosOldTurno.setDuenio(null);
                    listaTurnosOldTurno = em.merge(listaTurnosOldTurno);
                }
            }
            for (Turno listaTurnosNewTurno : listaTurnosNew) {
                if (!listaTurnosOld.contains(listaTurnosNewTurno)) {
                    Duenio oldDuenioOfListaTurnosNewTurno = listaTurnosNewTurno.getDuenio();
                    listaTurnosNewTurno.setDuenio(duenio);
                    listaTurnosNewTurno = em.merge(listaTurnosNewTurno);
                    if (oldDuenioOfListaTurnosNewTurno != null && !oldDuenioOfListaTurnosNewTurno.equals(duenio)) {
                        oldDuenioOfListaTurnosNewTurno.getListaTurnos().remove(listaTurnosNewTurno);
                        oldDuenioOfListaTurnosNewTurno = em.merge(oldDuenioOfListaTurnosNewTurno);
                    }
                }
            }
            for (Factura listaFacturasOldFactura : listaFacturasOld) {
                if (!listaFacturasNew.contains(listaFacturasOldFactura)) {
                    listaFacturasOldFactura.setDuenio(null);
                    listaFacturasOldFactura = em.merge(listaFacturasOldFactura);
                }
            }
            for (Factura listaFacturasNewFactura : listaFacturasNew) {
                if (!listaFacturasOld.contains(listaFacturasNewFactura)) {
                    Duenio oldDuenioOfListaFacturasNewFactura = listaFacturasNewFactura.getDuenio();
                    listaFacturasNewFactura.setDuenio(duenio);
                    listaFacturasNewFactura = em.merge(listaFacturasNewFactura);
                    if (oldDuenioOfListaFacturasNewFactura != null && !oldDuenioOfListaFacturasNewFactura.equals(duenio)) {
                        oldDuenioOfListaFacturasNewFactura.getListaFacturas().remove(listaFacturasNewFactura);
                        oldDuenioOfListaFacturasNewFactura = em.merge(oldDuenioOfListaFacturasNewFactura);
                    }
                }
            }
            for (FacturaDeTurno listaFacturasTurnoOldFacturaDeTurno : listaFacturasTurnoOld) {
                if (!listaFacturasTurnoNew.contains(listaFacturasTurnoOldFacturaDeTurno)) {
                    listaFacturasTurnoOldFacturaDeTurno.setDuenio(null);
                    listaFacturasTurnoOldFacturaDeTurno = em.merge(listaFacturasTurnoOldFacturaDeTurno);
                }
            }
            for (FacturaDeTurno listaFacturasTurnoNewFacturaDeTurno : listaFacturasTurnoNew) {
                if (!listaFacturasTurnoOld.contains(listaFacturasTurnoNewFacturaDeTurno)) {
                    Duenio oldDuenioOfListaFacturasTurnoNewFacturaDeTurno = listaFacturasTurnoNewFacturaDeTurno.getDuenio();
                    listaFacturasTurnoNewFacturaDeTurno.setDuenio(duenio);
                    listaFacturasTurnoNewFacturaDeTurno = em.merge(listaFacturasTurnoNewFacturaDeTurno);
                    if (oldDuenioOfListaFacturasTurnoNewFacturaDeTurno != null && !oldDuenioOfListaFacturasTurnoNewFacturaDeTurno.equals(duenio)) {
                        oldDuenioOfListaFacturasTurnoNewFacturaDeTurno.getListaFacturasTurno().remove(listaFacturasTurnoNewFacturaDeTurno);
                        oldDuenioOfListaFacturasTurnoNewFacturaDeTurno = em.merge(oldDuenioOfListaFacturasTurnoNewFacturaDeTurno);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = duenio.getIdDuenio();
                if (findDuenio(id) == null) {
                    throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.");
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
            Duenio duenio;
            try {
                duenio = em.getReference(Duenio.class, id);
                duenio.getIdDuenio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.", enfe);
            }
            List<Turno> listaTurnos = duenio.getListaTurnos();
            for (Turno listaTurnosTurno : listaTurnos) {
                listaTurnosTurno.setDuenio(null);
                listaTurnosTurno = em.merge(listaTurnosTurno);
            }
            List<Factura> listaFacturas = duenio.getListaFacturas();
            for (Factura listaFacturasFactura : listaFacturas) {
                listaFacturasFactura.setDuenio(null);
                listaFacturasFactura = em.merge(listaFacturasFactura);
            }
            List<FacturaDeTurno> listaFacturasTurno = duenio.getListaFacturasTurno();
            for (FacturaDeTurno listaFacturasTurnoFacturaDeTurno : listaFacturasTurno) {
                listaFacturasTurnoFacturaDeTurno.setDuenio(null);
                listaFacturasTurnoFacturaDeTurno = em.merge(listaFacturasTurnoFacturaDeTurno);
            }
            em.remove(duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Duenio> findDuenioEntities() {
        return findDuenioEntities(true, -1, -1);
    }

    public List<Duenio> findDuenioEntities(int maxResults, int firstResult) {
        return findDuenioEntities(false, maxResults, firstResult);
    }

    private List<Duenio> findDuenioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Duenio.class));
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

    public Duenio findDuenio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Duenio.class, id);
        } finally {
            em.close();
        }
    }

    public int getDuenioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Duenio> rt = cq.from(Duenio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

package com.mycompany.petshop.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.DetalleVenta;
import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FacturaJpaController implements Serializable {

    public FacturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public FacturaJpaController() {
    
        emf = Persistence.createEntityManagerFactory("PetShopPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Factura factura) {
        if (factura.getListaDetalleVenta() == null) {
            factura.setListaDetalleVenta(new ArrayList<DetalleVenta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio duenio = factura.getDuenio();
            if (duenio != null) {
                duenio = em.getReference(duenio.getClass(), duenio.getIdDuenio());
                factura.setDuenio(duenio);
            }
            List<DetalleVenta> attachedListaDetalleVenta = new ArrayList<DetalleVenta>();
            for (DetalleVenta listaDetalleVentaDetalleVentaToAttach : factura.getListaDetalleVenta()) {
                listaDetalleVentaDetalleVentaToAttach = em.getReference(listaDetalleVentaDetalleVentaToAttach.getClass(), listaDetalleVentaDetalleVentaToAttach.getIdDetalleVenta());
                attachedListaDetalleVenta.add(listaDetalleVentaDetalleVentaToAttach);
            }
            factura.setListaDetalleVenta(attachedListaDetalleVenta);
            em.persist(factura);
            if (duenio != null) {
                duenio.getListaFacturas().add(factura);
                duenio = em.merge(duenio);
            }
            for (DetalleVenta listaDetalleVentaDetalleVenta : factura.getListaDetalleVenta()) {
                Factura oldFacturaOfListaDetalleVentaDetalleVenta = listaDetalleVentaDetalleVenta.getFactura();
                listaDetalleVentaDetalleVenta.setFactura(factura);
                listaDetalleVentaDetalleVenta = em.merge(listaDetalleVentaDetalleVenta);
                if (oldFacturaOfListaDetalleVentaDetalleVenta != null) {
                    oldFacturaOfListaDetalleVentaDetalleVenta.getListaDetalleVenta().remove(listaDetalleVentaDetalleVenta);
                    oldFacturaOfListaDetalleVentaDetalleVenta = em.merge(oldFacturaOfListaDetalleVentaDetalleVenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Factura factura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Factura persistentFactura = em.find(Factura.class, factura.getIdFactura());
            Duenio duenioOld = persistentFactura.getDuenio();
            Duenio duenioNew = factura.getDuenio();
            List<DetalleVenta> listaDetalleVentaOld = persistentFactura.getListaDetalleVenta();
            List<DetalleVenta> listaDetalleVentaNew = factura.getListaDetalleVenta();
            if (duenioNew != null) {
                duenioNew = em.getReference(duenioNew.getClass(), duenioNew.getIdDuenio());
                factura.setDuenio(duenioNew);
            }
            List<DetalleVenta> attachedListaDetalleVentaNew = new ArrayList<DetalleVenta>();
            for (DetalleVenta listaDetalleVentaNewDetalleVentaToAttach : listaDetalleVentaNew) {
                listaDetalleVentaNewDetalleVentaToAttach = em.getReference(listaDetalleVentaNewDetalleVentaToAttach.getClass(), listaDetalleVentaNewDetalleVentaToAttach.getIdDetalleVenta());
                attachedListaDetalleVentaNew.add(listaDetalleVentaNewDetalleVentaToAttach);
            }
            listaDetalleVentaNew = attachedListaDetalleVentaNew;
            factura.setListaDetalleVenta(listaDetalleVentaNew);
            factura = em.merge(factura);
            if (duenioOld != null && !duenioOld.equals(duenioNew)) {
                duenioOld.getListaFacturas().remove(factura);
                duenioOld = em.merge(duenioOld);
            }
            if (duenioNew != null && !duenioNew.equals(duenioOld)) {
                duenioNew.getListaFacturas().add(factura);
                duenioNew = em.merge(duenioNew);
            }
            for (DetalleVenta listaDetalleVentaOldDetalleVenta : listaDetalleVentaOld) {
                if (!listaDetalleVentaNew.contains(listaDetalleVentaOldDetalleVenta)) {
                    listaDetalleVentaOldDetalleVenta.setFactura(null);
                    listaDetalleVentaOldDetalleVenta = em.merge(listaDetalleVentaOldDetalleVenta);
                }
            }
            for (DetalleVenta listaDetalleVentaNewDetalleVenta : listaDetalleVentaNew) {
                if (!listaDetalleVentaOld.contains(listaDetalleVentaNewDetalleVenta)) {
                    Factura oldFacturaOfListaDetalleVentaNewDetalleVenta = listaDetalleVentaNewDetalleVenta.getFactura();
                    listaDetalleVentaNewDetalleVenta.setFactura(factura);
                    listaDetalleVentaNewDetalleVenta = em.merge(listaDetalleVentaNewDetalleVenta);
                    if (oldFacturaOfListaDetalleVentaNewDetalleVenta != null && !oldFacturaOfListaDetalleVentaNewDetalleVenta.equals(factura)) {
                        oldFacturaOfListaDetalleVentaNewDetalleVenta.getListaDetalleVenta().remove(listaDetalleVentaNewDetalleVenta);
                        oldFacturaOfListaDetalleVentaNewDetalleVenta = em.merge(oldFacturaOfListaDetalleVentaNewDetalleVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = factura.getIdFactura();
                if (findFactura(id) == null) {
                    throw new NonexistentEntityException("The factura with id " + id + " no longer exists.");
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
            Factura factura;
            try {
                factura = em.getReference(Factura.class, id);
                factura.getIdFactura();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The factura with id " + id + " no longer exists.", enfe);
            }
            Duenio duenio = factura.getDuenio();
            if (duenio != null) {
                duenio.getListaFacturas().remove(factura);
                duenio = em.merge(duenio);
            }
            List<DetalleVenta> listaDetalleVenta = factura.getListaDetalleVenta();
            for (DetalleVenta listaDetalleVentaDetalleVenta : listaDetalleVenta) {
                listaDetalleVentaDetalleVenta.setFactura(null);
                listaDetalleVentaDetalleVenta = em.merge(listaDetalleVentaDetalleVenta);
            }
            em.remove(factura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Factura> findFacturaEntities() {
        return findFacturaEntities(true, -1, -1);
    }

    public List<Factura> findFacturaEntities(int maxResults, int firstResult) {
        return findFacturaEntities(false, maxResults, firstResult);
    }

    private List<Factura> findFacturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Factura.class));
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

    public Factura findFactura(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Factura.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Factura> rt = cq.from(Factura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

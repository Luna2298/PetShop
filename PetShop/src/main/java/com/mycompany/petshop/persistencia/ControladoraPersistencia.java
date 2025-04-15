package com.mycompany.petshop.persistencia;

import com.mycompany.petshop.logica.DetalleVenta;
import com.mycompany.petshop.logica.DetalleVentaTurno;
import com.mycompany.petshop.logica.Duenio;

import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.FacturaDeTurno;
import com.mycompany.petshop.logica.Mascota;
import com.mycompany.petshop.logica.Producto;

import com.mycompany.petshop.logica.Relacion;
import com.mycompany.petshop.logica.Turno;
import com.mycompany.petshop.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    ProductoJpaController proJpa = new ProductoJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();
    
    RelacionJpaController relaJpa = new RelacionJpaController();
    
    TurnoJpaController turnoJpa = new TurnoJpaController();
    FacturaDeTurnoJpaController facturaJpa = new FacturaDeTurnoJpaController();
    DetalleVentaTurnoJpaController detalleVentaTurnoJpa = new DetalleVentaTurnoJpaController();
    
    FacturaJpaController faJpa = new FacturaJpaController();
    DetalleVentaJpaController detalleVentaProductoJpa = new DetalleVentaJpaController();
    
    /*Lista de Duenios*/
    public List<Duenio> traerListaDuenios() {
        
        return duenioJpa.findDuenioEntities();
    }

    public List<Mascota> traerListaMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }

    public List<Relacion> traerListaRelaciones() {
        
        return relaJpa.findRelacionEntities();
    }

    public List<Turno> traerListaTurnos() {
        
        return turnoJpa.findTurnoEntities();
    }

    public List<Producto> traerListaProductos() {
        
        return proJpa.findProductoEntities();
    }

    /*Mascota*/
    public void guardarMascota(Mascota masco) {
        
        mascoJpa.create(masco);
    }

/*Duenio*/
    public void guardarDuenio(Duenio duenio) {
        
        duenioJpa.create(duenio);
    }

 /*Biieenn revisado, esta correcto*/
    public Duenio traerDuenio(int duenioInt) {
        
        return duenioJpa.findDuenio(duenioInt);
    }

    public Mascota traerMascota(int idMascota) {
        
        return mascoJpa.findMascota(idMascota);
    }

    public void guardarRelacionn(Relacion rela) {
        
        relaJpa.create(rela);
    }

/*Biieenn revisado, es correcto*/
    public Relacion traerUnaRelacion(int id) {
        
        return relaJpa.findRelacion(id);
    }

    public void modificarMascotaEnRelacion(Relacion rela) {
        
        try {
            relaJpa.edit(rela);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDuenioEnRelacion(Relacion rela) {
        
        try {
            relaJpa.edit(rela);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


    public void modiDuenio(Duenio duenio) {
        
        try {
            duenioJpa.edit(duenio);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public void modiMascota(Mascota ma) {
       
        try {
            mascoJpa.edit(ma);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public void borrarRelacion(int idRelacion) {
        
        try {
            relaJpa.destroy(idRelacion);
            
        } catch (NonexistentEntityException ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


    public void guardarTurno(Turno turno) {
        
        turnoJpa.create(turno);
    }


/*Biieenn revisado, esta correcto*/
    public Turno traerTurno(int idTurnoAPagar) {
        
        return turnoJpa.findTurno(idTurnoAPagar);
    }


     /*Biieenn revisado, esta correcto*/
    public void crearFacturaDeTurno(FacturaDeTurno facturaTurno) {
        
        facturaJpa.create(facturaTurno);
    }


    public List<FacturaDeTurno> traerListaFacturaTurnos() {
        
        return facturaJpa.findFacturaDeTurnoEntities();
    }


/*Bien revisado, esta correcto*/
    public FacturaDeTurno traerUltimaFacturaTurno(int idFacturaTurno) {
        
        return facturaJpa.findFacturaDeTurno(idFacturaTurno);
    }


    public void crearDetalleVentaTurno(DetalleVentaTurno detalleVentaTurno) {
        
        detalleVentaTurnoJpa.create(detalleVentaTurno);
    }

    public List<DetalleVentaTurno> traerListaDetalleVentaTurnos() {
        
        return detalleVentaTurnoJpa.findDetalleVentaTurnoEntities();
    }


/*Bieeeennn revisado, esta correcto*/
    public void borrarDetalleVentaTurnoEnLista(int id) {
        
        try {
            detalleVentaTurnoJpa.destroy(id);
            
        } catch (NonexistentEntityException ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


    public void crearProducto(Producto pro) {
        
        proJpa.create(pro);
    }


/*Biienn revisado, esta correcto*/
    public Producto traerProducto(int id_Producto) {
        
        return proJpa.findProducto(id_Producto);
    }


    public void modificarProducto(Producto proBandera) {
        
        try {
            
            proJpa.edit(proBandera);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


/*Biieenn revisado, esta correcto*/
    public void borrarProducto(int id_Producto) {
        
        try {
            
            proJpa.destroy(id_Producto);
            
        } catch (NonexistentEntityException ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }



    public void crearFacturaProducto(Factura factura) {
        
        faJpa.create(factura);
    }


/*Bien revisado, esta correcto*/
    public Factura traerUltimaFacturaProducto(int idFactura) {
        
        return faJpa.findFactura(idFactura);
    }


    public void crearDetalleVentaProducto(DetalleVenta detaVenta) {
        
        detalleVentaProductoJpa.create(detaVenta);
    }


/*Bien revisado, esta correcto*/
    public void borrarDetalleVentaProductoEnLista(int idDetalleProducto) {
        
        try {
            
            detalleVentaProductoJpa.destroy(idDetalleProducto);
            
        } catch (NonexistentEntityException ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


/*Bien revisado, esta correcto*/
    public void editarDuenioEnFactura(Factura factura) {
      
        try {
            
            faJpa.edit(factura);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


/*Bien revisado, esta correcto*/
    public void editarDetalleVentaProducto(DetalleVenta detalleVenta) {
        
        try {
            
            detalleVentaProductoJpa.edit(detalleVenta);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }


 /*Biieenn revisado, esta correcto*/
    public void modiFactura(Factura factura) {
        
        try {
            
            faJpa.edit(factura);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public void modificarStockProducto(Producto producto) {
        
        try {
            proJpa.edit(producto);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public List<Factura> traerListaFacturas() {
        
        return faJpa.findFacturaEntities();
    }
    
    
    /*Biieenn revisado, esta correcto*/
    public List<DetalleVenta> traerListaDetalleVenta() {
       
        return detalleVentaProductoJpa.findDetalleVentaEntities();
    }
    
    public void borrarFacturaTurno(int id) {
        
        try {
            
            facturaJpa.destroy(id);
            
        } catch (NonexistentEntityException ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    
    public void borrarFactura(int id) {
        
        try {
            
            faJpa.destroy(id);
            
        } catch (NonexistentEntityException ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    
     /*Biieenn revisado, esta correcto*/
    public void modiFacturaTurno(FacturaDeTurno fac) {
        
        try {
            facturaJpa.edit(fac);
            
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public void agregarDetalleAListaDeFactura(Factura facturaUltimaProducto) {
        
        try {
            
            faJpa.edit(facturaUltimaProducto);
            
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

}

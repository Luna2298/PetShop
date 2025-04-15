package com.mycompany.petshop.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Factura implements Serializable {
   
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idFactura;
    
    @ManyToOne
    private Duenio duenio;
    
    /*@Temporal(TemporalType.DATE)*/
    private String fechaFactura;
    
    private double subTotalCompra;
    
    private double descuentoCompra;
    
    private double ivaCompra;
    
    private double totalPagar;
    
    @OneToMany(mappedBy="factura")
    private List<DetalleVenta> listaDetalleVenta;
    

    public Factura() {
    }

    public Factura(int idFactura, Duenio duenio, String fechaFactura, double subTotalCompra,
            double descuentoCompra, double ivaCompra, double totalPagar, 
            List<DetalleVenta> listaDetalleVenta) {
        
        this.idFactura = idFactura;
        this.duenio = duenio;
        this.fechaFactura = fechaFactura;
        this.subTotalCompra = subTotalCompra;
        this.descuentoCompra = descuentoCompra;
        this.ivaCompra = ivaCompra;
        this.totalPagar = totalPagar;
        this.listaDetalleVenta = listaDetalleVenta;
    }
    

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getSubTotalCompra() {
        return subTotalCompra;
    }

    public void setSubTotalCompra(double subTotalCompra) {
        this.subTotalCompra = subTotalCompra;
    }

    public double getDescuentoCompra() {
        return descuentoCompra;
    }

    public void setDescuentoCompra(double descuentoCompra) {
        this.descuentoCompra = descuentoCompra;
    }

    public double getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(double ivaCompra) {
        this.ivaCompra = ivaCompra;
    }
    
    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public List<DetalleVenta> getListaDetalleVenta() {
        return listaDetalleVenta;
    }

    public void setListaDetalleVenta(List<DetalleVenta> listaDetalleVenta) {
        this.listaDetalleVenta = listaDetalleVenta;
    }
    
    
}

package com.mycompany.petshop.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DetalleVenta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idDetalleVenta;
    
    @ManyToOne
    private Factura factura;
    
    @ManyToOne
    private Producto producto;
    
    private double cantidad;
    private double subTotal;
    private double descuento;
    private double iva;
    private double total;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, Factura factura, 
            Producto producto, double cantidad, double subTotal, 
            double descuento, double iva, double total) {
        
        this.idDetalleVenta = idDetalleVenta;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.iva = iva;
        this.total = total;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    /*=================================================================*/
    
    /*Partes de la tabla del Detalle de Venta*/
    public String getNombre() {
    
        return producto.getNombre();
    }
    
    public double getPrecio() {
    
        return producto.getPrecio();
    }
    
    
    /*Cabecera del reporte o Detalle de Venta*/
    public int getIdFactura() {
    
        return factura.getIdFactura();
    }
    
    public String getDuenio() {
    
        return factura.getDuenio().mostrarNombreCompleto();
    }
    
    /*Footer del Detalle de Venta*/
    public double getSubTotalCompra() {
        
        return factura.getSubTotalCompra();
    }
    
    public double getDescuentoCompra() {
        
        return factura.getDescuentoCompra();
    }
    
    public double getIvaCompra() {
        
        return factura.getIvaCompra();
    }
    
    public double getTotalPagar() {
    
        return factura.getTotalPagar();
    }
}

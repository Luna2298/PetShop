package com.mycompany.petshop.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DetalleVentaTurno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idDetalleVentaTurno;
    
    @ManyToOne
    private FacturaDeTurno facturaDeTurno;
    
    @OneToOne
    private Turno turno;
    
    private double precio;

    public DetalleVentaTurno() {
    }

    public DetalleVentaTurno(int idDetalleVentaTurno, 
            FacturaDeTurno facturaDeTurno, Turno turno, double precio) {
        
        this.idDetalleVentaTurno = idDetalleVentaTurno;
        this.facturaDeTurno = facturaDeTurno;
        this.turno = turno;
        this.precio = precio;
    }

    public int getIdDetalleVentaTurno() {
        return idDetalleVentaTurno;
    }

    public void setIdDetalleVentaTurno(int idDetalleVentaTurno) {
        this.idDetalleVentaTurno = idDetalleVentaTurno;
    }

    public FacturaDeTurno getFacturaDeTurno() {
        return facturaDeTurno;
    }

    public void setFacturaDeTurno(FacturaDeTurno facturaDeTurno) {
        this.facturaDeTurno = facturaDeTurno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}

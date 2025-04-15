package com.mycompany.petshop.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FacturaDeTurno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idFacturaTurno;
    
    @ManyToOne
    private Duenio duenio;
    
    private String fechaPagoTurno;
    
    private double totalPagarTurno;

    public FacturaDeTurno() {
    }

    public FacturaDeTurno(int idFacturaTurno, String fechaPagoTurno,
            double totalPagarTurno, Duenio duenio) {
        
        this.idFacturaTurno = idFacturaTurno;
        this.fechaPagoTurno = fechaPagoTurno;
        this.totalPagarTurno = totalPagarTurno;
        this.duenio = duenio;
    }

    public int getIdFacturaTurno() {
        return idFacturaTurno;
    }

    public void setIdFacturaTurno(int idFacturaTurno) {
        this.idFacturaTurno = idFacturaTurno;
    }

    public String getFechaPagoTurno() {
        return fechaPagoTurno;
    }

    public void setFechaPagoTurno(String fechaPagoTurno) {
        this.fechaPagoTurno = fechaPagoTurno;
    }

    public double getTotalPagarTurno() {
        return totalPagarTurno;
    }

    public void setTotalPagarTurno(double totalPagarTurno) {
        this.totalPagarTurno = totalPagarTurno;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
    
    
}

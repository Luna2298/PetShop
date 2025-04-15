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
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idTurno;
    
    @ManyToOne
    private Mascota mascota;
    
    @ManyToOne
    private Duenio duenio;
    
    /*@OneToOne
    private DetalleVentaTurno detalleVentaTurno;*/
    
    private String peluqueria;
    private String atencionMedica;
    private String descripcion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;

    public Turno() {
    }

    public Turno(int idTurno, Mascota mascota, String peluqueria, 
            String atencionMedica, String descripcion, Date fechaTurno/*,
            DetalleVentaTurno detalleVentaTurno*/) {
        
        this.idTurno = idTurno;
        this.mascota = mascota;
        this.peluqueria = peluqueria;
        this.atencionMedica = atencionMedica;
        this.descripcion = descripcion;
        this.fechaTurno = fechaTurno;
        /*this.detalleVentaTurno = detalleVentaTurno;*/
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getPeluqueria() {
        return peluqueria;
    }

    public void setPeluqueria(String peluqueria) {
        this.peluqueria = peluqueria;
    }

    public String getAtencionMedica() {
        return atencionMedica;
    }

    public void setAtencionMedica(String atencionMedica) {
        this.atencionMedica = atencionMedica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    /*public DetalleVentaTurno getDetalleVentaTurno() {
        return detalleVentaTurno;
    }

    public void setDetalleVentaTurno(DetalleVentaTurno detalleVentaTurno) {
        this.detalleVentaTurno = detalleVentaTurno;
    }*/
    
    
}

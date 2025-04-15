package com.mycompany.petshop.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Relacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idRelacion;
    
    @ManyToOne
    private Mascota mascota;
    
    @ManyToOne
    private Duenio duenio;

    public Relacion() {
    }

    public Relacion(int idRelacion, Mascota mascota, Duenio duenio) {
        this.idRelacion = idRelacion;
        this.mascota = mascota;
        this.duenio = duenio;
    }

    public int getIdRelacion() {
        return idRelacion;
    }

    public void setIdRelacion(int idRelacion) {
        this.idRelacion = idRelacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
    
    
}

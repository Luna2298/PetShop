package com.mycompany.petshop.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idMascota;
    private String nombre;

    
    private String especie;
    private String raza;
    
    private String color;
    private String alergico;
    private String atencion;
    private String observacion;
    
    
    @OneToMany(mappedBy="mascota")
    private List<Turno> listaTurnos;
    /*
    OneToMany:
    Una Mascota a Muchos Turnos
    */
    

    public Mascota() {
    }

    public Mascota(int idMascota, String nombre, String especie, 
            String raza, String color, String alergico, String atencion, 
            String observacion, List<Turno> listaTurnos) {
        
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion = atencion;
        this.observacion = observacion;
        this.listaTurnos = listaTurnos;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /*public List<Duenio> getListaDuenio() {
        return listaDuenio;
    }

    public void setListaDuenio(List<Duenio> listaDuenio) {
        this.listaDuenio = listaDuenio;
    }*/

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    public String mostrarMascota() {
    
        return nombre + ", " + especie + ", " + raza;
    }
}

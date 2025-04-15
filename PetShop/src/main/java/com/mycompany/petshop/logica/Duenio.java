package com.mycompany.petshop.logica;

import java.io.Serializable;
import java.util.LinkedList;
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
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idDuenio;
    private String nombre;
    private String apellido;
    private String celular;
    
    @OneToMany(mappedBy="duenio")
    private List<Factura> listaFacturas;
    /*
    OneToMany:
    Un Duenio a Muchas Facturas
    */
    
    @OneToMany(mappedBy="duenio")
    private List<Turno> listaTurnos;
    /*
    OneToMany:
    Una Mascota a Muchos Turnos
    */
    
    @OneToMany(mappedBy="duenio")
    private List<FacturaDeTurno> listaFacturasTurno;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String apellido, 
            String celular, List<Factura> listaFacturas, 
            List<Turno> listaTurnos, List<FacturaDeTurno> listaFacturasTurno) {
        
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.listaFacturas = listaFacturas;
        this.listaTurnos = listaTurnos;
        this.listaFacturasTurno = listaFacturasTurno;
    }
    
    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    
    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public List<FacturaDeTurno> getListaFacturasTurno() {
        return listaFacturasTurno;
    }

    public void setListaFacturasTurno(List<FacturaDeTurno> listaFacturasTurno) {
        this.listaFacturasTurno = listaFacturasTurno;
    }
    
    
    
    
    public String mostrarNombreCompleto() {
    
        return apellido + ", " + nombre;
    }
    
    public String mostrarDatos() {
    
        return apellido + ", " + nombre + ", " + celular;
    }

    @Override
    public String toString() {
        return "Duenio{" + "idDuenio=" + idDuenio + ", nombre=" + nombre +
                ", apellido=" + apellido + ", celular=" + celular + 
                /*", listaMascotas=" + listaMascota +*/
                ", listaFacturas=" + listaFacturas + '}';
    }
    
    
    
}

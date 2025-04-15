package com.mycompany.petshop.logica;

import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.FacturaDeTurno;
import com.mycompany.petshop.logica.Turno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-04-11T17:11:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Duenio.class)
public class Duenio_ { 

    public static volatile ListAttribute<Duenio, Factura> listaFacturas;
    public static volatile SingularAttribute<Duenio, String> apellido;
    public static volatile ListAttribute<Duenio, FacturaDeTurno> listaFacturasTurno;
    public static volatile SingularAttribute<Duenio, String> celular;
    public static volatile SingularAttribute<Duenio, String> nombre;
    public static volatile ListAttribute<Duenio, Turno> listaTurnos;
    public static volatile SingularAttribute<Duenio, Integer> idDuenio;

}
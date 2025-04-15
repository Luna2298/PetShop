package com.mycompany.petshop.logica;

import com.mycompany.petshop.logica.DetalleVenta;
import com.mycompany.petshop.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-04-11T17:11:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Duenio> duenio;
    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile SingularAttribute<Factura, String> fechaFactura;
    public static volatile SingularAttribute<Factura, Double> totalPagar;
    public static volatile ListAttribute<Factura, DetalleVenta> listaDetalleVenta;

}
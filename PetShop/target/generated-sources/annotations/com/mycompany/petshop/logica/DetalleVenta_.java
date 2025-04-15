package com.mycompany.petshop.logica;

import com.mycompany.petshop.logica.Factura;
import com.mycompany.petshop.logica.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-04-11T17:11:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Double> total;
    public static volatile SingularAttribute<DetalleVenta, Factura> factura;
    public static volatile SingularAttribute<DetalleVenta, Double> iva;
    public static volatile SingularAttribute<DetalleVenta, Double> descuento;
    public static volatile SingularAttribute<DetalleVenta, Integer> idDetalleVenta;
    public static volatile SingularAttribute<DetalleVenta, Producto> producto;
    public static volatile SingularAttribute<DetalleVenta, Double> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Double> subTotal;

}
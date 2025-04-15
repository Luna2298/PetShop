package com.mycompany.petshop.logica;

import com.mycompany.petshop.logica.FacturaDeTurno;
import com.mycompany.petshop.logica.Turno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-04-11T17:11:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(DetalleVentaTurno.class)
public class DetalleVentaTurno_ { 

    public static volatile SingularAttribute<DetalleVentaTurno, FacturaDeTurno> facturaDeTurno;
    public static volatile SingularAttribute<DetalleVentaTurno, Double> precio;
    public static volatile SingularAttribute<DetalleVentaTurno, Turno> turno;
    public static volatile SingularAttribute<DetalleVentaTurno, Integer> idDetalleVentaTurno;

}
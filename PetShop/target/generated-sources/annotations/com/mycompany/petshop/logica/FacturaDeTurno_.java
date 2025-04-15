package com.mycompany.petshop.logica;

import com.mycompany.petshop.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-04-11T17:11:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(FacturaDeTurno.class)
public class FacturaDeTurno_ { 

    public static volatile SingularAttribute<FacturaDeTurno, Integer> idFacturaTurno;
    public static volatile SingularAttribute<FacturaDeTurno, Duenio> duenio;
    public static volatile SingularAttribute<FacturaDeTurno, Double> totalPagarTurno;
    public static volatile SingularAttribute<FacturaDeTurno, String> fechaPagoTurno;

}
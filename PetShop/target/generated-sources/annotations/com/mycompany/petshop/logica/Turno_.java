package com.mycompany.petshop.logica;

import com.mycompany.petshop.logica.Duenio;
import com.mycompany.petshop.logica.Mascota;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-04-11T17:11:54", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> descripcion;
    public static volatile SingularAttribute<Turno, String> atencionMedica;
    public static volatile SingularAttribute<Turno, Duenio> duenio;
    public static volatile SingularAttribute<Turno, Mascota> mascota;
    public static volatile SingularAttribute<Turno, String> peluqueria;
    public static volatile SingularAttribute<Turno, Integer> idTurno;
    public static volatile SingularAttribute<Turno, Date> fechaTurno;

}
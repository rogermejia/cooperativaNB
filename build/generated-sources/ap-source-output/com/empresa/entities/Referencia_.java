package com.empresa.entities;

import com.empresa.entities.Cliente;
import com.empresa.entities.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Referencia.class)
public class Referencia_ { 

    public static volatile SingularAttribute<Referencia, Integer> idreferencia;
    public static volatile SingularAttribute<Referencia, Persona> idpersona;
    public static volatile SingularAttribute<Referencia, Integer> tiempoconocerse;
    public static volatile SingularAttribute<Referencia, Cliente> idcliente;

}
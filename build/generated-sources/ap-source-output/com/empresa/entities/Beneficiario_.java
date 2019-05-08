package com.empresa.entities;

import com.empresa.entities.Cliente;
import com.empresa.entities.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Beneficiario.class)
public class Beneficiario_ { 

    public static volatile SingularAttribute<Beneficiario, String> parentesco;
    public static volatile SingularAttribute<Beneficiario, Persona> idpersona;
    public static volatile SingularAttribute<Beneficiario, Float> porcentaje;
    public static volatile SingularAttribute<Beneficiario, Integer> edad;
    public static volatile SingularAttribute<Beneficiario, Cliente> idcliente;
    public static volatile SingularAttribute<Beneficiario, Integer> idbeneficiario;

}
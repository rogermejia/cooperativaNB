package com.empresa.entities;

import com.empresa.entities.Beneficiario;
import com.empresa.entities.Cuenta;
import com.empresa.entities.Persona;
import com.empresa.entities.Referencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Beneficiario> beneficiarioList;
    public static volatile SingularAttribute<Cliente, Persona> idpersona;
    public static volatile ListAttribute<Cliente, Cuenta> cuentaList;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile SingularAttribute<Cliente, String> miembro;
    public static volatile ListAttribute<Cliente, Referencia> referenciaList;

}
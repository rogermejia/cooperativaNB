package com.empresa.entities;

import com.empresa.entities.Beneficiario;
import com.empresa.entities.Cliente;
import com.empresa.entities.Direccion;
import com.empresa.entities.Referencia;
import com.empresa.entities.Telefono;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile ListAttribute<Persona, Cliente> clienteList;
    public static volatile ListAttribute<Persona, Beneficiario> beneficiarioList;
    public static volatile SingularAttribute<Persona, Integer> idpersona;
    public static volatile ListAttribute<Persona, Telefono> telefonoList;
    public static volatile ListAttribute<Persona, Direccion> direccionList;
    public static volatile SingularAttribute<Persona, String> documentonum;
    public static volatile ListAttribute<Persona, Referencia> referenciaList;
    public static volatile SingularAttribute<Persona, String> nombres;

}
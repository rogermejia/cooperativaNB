package com.empresa.entities;

import com.empresa.entities.Cuenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Tipocuenta.class)
public class Tipocuenta_ { 

    public static volatile SingularAttribute<Tipocuenta, Integer> idtipocuenta;
    public static volatile ListAttribute<Tipocuenta, Cuenta> cuentaList;
    public static volatile SingularAttribute<Tipocuenta, String> nombre;

}
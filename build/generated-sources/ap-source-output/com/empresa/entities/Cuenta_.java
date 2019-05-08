package com.empresa.entities;

import com.empresa.entities.Cliente;
import com.empresa.entities.Tipocuenta;
import com.empresa.entities.Transaccion;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, BigDecimal> totalcargos;
    public static volatile SingularAttribute<Cuenta, BigDecimal> totalabonos;
    public static volatile SingularAttribute<Cuenta, Tipocuenta> idtipocuenta;
    public static volatile SingularAttribute<Cuenta, Integer> numcuenta;
    public static volatile SingularAttribute<Cuenta, Integer> idcuenta;
    public static volatile SingularAttribute<Cuenta, BigDecimal> saldo;
    public static volatile ListAttribute<Cuenta, Transaccion> transaccionList;
    public static volatile SingularAttribute<Cuenta, Cliente> idcliente;

}
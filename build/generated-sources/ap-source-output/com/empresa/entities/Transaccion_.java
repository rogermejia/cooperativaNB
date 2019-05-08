package com.empresa.entities;

import com.empresa.entities.Cuenta;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-07T13:15:12")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Date> fecha;
    public static volatile SingularAttribute<Transaccion, Integer> idtran;
    public static volatile SingularAttribute<Transaccion, BigDecimal> montocargo;
    public static volatile SingularAttribute<Transaccion, Cuenta> idcuenta;
    public static volatile SingularAttribute<Transaccion, BigDecimal> montoabono;

}
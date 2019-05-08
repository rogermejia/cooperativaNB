/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rogelio.mejiausam
 */
@Entity
@Table(name = "cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")
    , @NamedQuery(name = "Cuenta.findByIdcuenta", query = "SELECT c FROM Cuenta c WHERE c.idcuenta = :idcuenta")
    , @NamedQuery(name = "Cuenta.findByNumcuenta", query = "SELECT c FROM Cuenta c WHERE c.numcuenta = :numcuenta")
    , @NamedQuery(name = "Cuenta.findByTotalcargos", query = "SELECT c FROM Cuenta c WHERE c.totalcargos = :totalcargos")
    , @NamedQuery(name = "Cuenta.findByTotalabonos", query = "SELECT c FROM Cuenta c WHERE c.totalabonos = :totalabonos")
    , @NamedQuery(name = "Cuenta.findBySaldo", query = "SELECT c FROM Cuenta c WHERE c.saldo = :saldo")
    , @NamedQuery(name="cuentas.byCliente", query="SELECT c FROM Cuenta c where c.idcliente = :idCliente")
})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcuenta")
    private Integer idcuenta;
    @Basic(optional = false)
    @Column(name = "numcuenta")
    private int numcuenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "totalcargos")
    private BigDecimal totalcargos;
    @Basic(optional = false)
    @Column(name = "totalabonos")
    private BigDecimal totalabonos;
    @Basic(optional = false)
    @Column(name = "saldo")
    private BigDecimal saldo;
    @OneToMany(mappedBy = "idcuenta", cascade = CascadeType.PERSIST)
    private List<Transaccion> transaccionList;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idcliente;
    @JoinColumn(name = "idtipocuenta", referencedColumnName = "idtipocuenta")
    @ManyToOne(optional = false)
    private Tipocuenta idtipocuenta;

    public Cuenta() {
    }

    public Cuenta(Integer idcuenta) {
        this.idcuenta = idcuenta;
    }

    public Cuenta(Integer idcuenta, int numcuenta, BigDecimal totalcargos, BigDecimal totalabonos, BigDecimal saldo) {
        this.idcuenta = idcuenta;
        this.numcuenta = numcuenta;
        this.totalcargos = totalcargos;
        this.totalabonos = totalabonos;
        this.saldo = saldo;
    }

    public Integer getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(Integer idcuenta) {
        this.idcuenta = idcuenta;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public BigDecimal getTotalcargos() {
        return totalcargos;
    }

    public void setTotalcargos(BigDecimal totalcargos) {
        this.totalcargos = totalcargos;
    }

    public BigDecimal getTotalabonos() {
        return totalabonos;
    }

    public void setTotalabonos(BigDecimal totalabonos) {
        this.totalabonos = totalabonos;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @XmlTransient
    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Tipocuenta getIdtipocuenta() {
        return idtipocuenta;
    }

    public void setIdtipocuenta(Tipocuenta idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcuenta != null ? idcuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.idcuenta == null && other.idcuenta != null) || (this.idcuenta != null && !this.idcuenta.equals(other.idcuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Cuenta[ idcuenta=" + idcuenta + " ]";
    }
    
}

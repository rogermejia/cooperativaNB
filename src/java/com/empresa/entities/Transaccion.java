/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rogelio.mejiausam
 */
@Entity
@Table(name = "transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")
    , @NamedQuery(name = "Transaccion.findByIdtran", query = "SELECT t FROM Transaccion t WHERE t.idtran = :idtran")
    , @NamedQuery(name = "Transaccion.findByMontocargo", query = "SELECT t FROM Transaccion t WHERE t.montocargo = :montocargo")
    , @NamedQuery(name = "Transaccion.findByMontoabono", query = "SELECT t FROM Transaccion t WHERE t.montoabono = :montoabono")
    , @NamedQuery(name = "Transaccion.findByFecha", query = "SELECT t FROM Transaccion t WHERE t.fecha = :fecha")
    , @NamedQuery(name="transacciones.byCuenta", query="SELECT t FROM Transaccion t where t.idcuenta = :idCuenta")
})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtran")
    private Integer idtran;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "montocargo")
    private BigDecimal montocargo;
    @Basic(optional = false)
    @Column(name = "montoabono")
    private BigDecimal montoabono;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta")
    @ManyToOne(optional = false)
    private Cuenta idcuenta;

    public Transaccion() {
    }

    public Transaccion(Integer idtran) {
        this.idtran = idtran;
    }

    public Transaccion(Integer idtran, BigDecimal montocargo, BigDecimal montoabono, Date fecha) {
        this.idtran = idtran;
        this.montocargo = montocargo;
        this.montoabono = montoabono;
        this.fecha = fecha;
    }

    public Integer getIdtran() {
        return idtran;
    }

    public void setIdtran(Integer idtran) {
        this.idtran = idtran;
    }

    public BigDecimal getMontocargo() {
        return montocargo;
    }

    public void setMontocargo(BigDecimal montocargo) {
        this.montocargo = montocargo;
    }

    public BigDecimal getMontoabono() {
        return montoabono;
    }

    public void setMontoabono(BigDecimal montoabono) {
        this.montoabono = montoabono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cuenta getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(Cuenta idcuenta) {
        this.idcuenta = idcuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtran != null ? idtran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.idtran == null && other.idtran != null) || (this.idtran != null && !this.idtran.equals(other.idtran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Transaccion[ idtran=" + idtran + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tipocuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocuenta.findAll", query = "SELECT t FROM Tipocuenta t")
    , @NamedQuery(name = "Tipocuenta.findByIdtipocuenta", query = "SELECT t FROM Tipocuenta t WHERE t.idtipocuenta = :idtipocuenta")
    , @NamedQuery(name = "Tipocuenta.findByNombre", query = "SELECT t FROM Tipocuenta t WHERE t.nombre = :nombre")})
public class Tipocuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipocuenta")
    private Integer idtipocuenta;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipocuenta")
    private List<Cuenta> cuentaList;

    public Tipocuenta() {
    }

    public Tipocuenta(Integer idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    public Integer getIdtipocuenta() {
        return idtipocuenta;
    }

    public void setIdtipocuenta(Integer idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocuenta != null ? idtipocuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocuenta)) {
            return false;
        }
        Tipocuenta other = (Tipocuenta) object;
        if ((this.idtipocuenta == null && other.idtipocuenta != null) || (this.idtipocuenta != null && !this.idtipocuenta.equals(other.idtipocuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Tipocuenta[ idtipocuenta=" + idtipocuenta + " ]";
    }
    
}

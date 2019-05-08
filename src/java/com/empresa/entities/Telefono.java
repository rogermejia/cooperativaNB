/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rogelio.mejiausam
 */
@Entity
@Table(name = "telefono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t")
    , @NamedQuery(name = "Telefono.findByIdtelefono", query = "SELECT t FROM Telefono t WHERE t.idtelefono = :idtelefono")
    , @NamedQuery(name = "Telefono.findByTelefono", query = "SELECT t FROM Telefono t WHERE t.telefono = :telefono")})
public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefono")
    private Integer idtelefono;
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @ManyToOne
    private Persona idpersona;

    public Telefono() {
    }

    public Telefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public Integer getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefono != null ? idtelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.idtelefono == null && other.idtelefono != null) || (this.idtelefono != null && !this.idtelefono.equals(other.idtelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Telefono[ idtelefono=" + idtelefono + " ]";
    }
    
}

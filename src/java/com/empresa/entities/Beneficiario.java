/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "beneficiario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beneficiario.findAll", query = "SELECT b FROM Beneficiario b")
    , @NamedQuery(name = "Beneficiario.findByIdbeneficiario", query = "SELECT b FROM Beneficiario b WHERE b.idbeneficiario = :idbeneficiario")
    , @NamedQuery(name = "Beneficiario.findByEdad", query = "SELECT b FROM Beneficiario b WHERE b.edad = :edad")
    , @NamedQuery(name = "Beneficiario.findByParentesco", query = "SELECT b FROM Beneficiario b WHERE b.parentesco = :parentesco")
    , @NamedQuery(name = "Beneficiario.findByPorcentaje", query = "SELECT b FROM Beneficiario b WHERE b.porcentaje = :porcentaje")})
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbeneficiario")
    private Integer idbeneficiario;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "parentesco")
    private String parentesco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje")
    private Float porcentaje;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne
    private Cliente idcliente;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @ManyToOne
    private Persona idpersona;

    public Beneficiario() {
    }

    public Beneficiario(Integer idbeneficiario) {
        this.idbeneficiario = idbeneficiario;
    }

    public Integer getIdbeneficiario() {
        return idbeneficiario;
    }

    public void setIdbeneficiario(Integer idbeneficiario) {
        this.idbeneficiario = idbeneficiario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
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
        hash += (idbeneficiario != null ? idbeneficiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiario)) {
            return false;
        }
        Beneficiario other = (Beneficiario) object;
        if ((this.idbeneficiario == null && other.idbeneficiario != null) || (this.idbeneficiario != null && !this.idbeneficiario.equals(other.idbeneficiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.entities.Beneficiario[ idbeneficiario=" + idbeneficiario + " ]";
    }
    
}

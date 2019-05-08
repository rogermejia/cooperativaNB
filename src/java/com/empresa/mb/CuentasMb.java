package com.empresa.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.empresa.dao.CuentaDao;
import com.empresa.entities.*;
import javax.ejb.EJB;

@ManagedBean
@ViewScoped
public class CuentasMb {
	private Persona afiliadoSeleccionado;
	private List<Persona> afiliados;
	private Cuenta cuentaSeleccionada;
	private List<Cuenta> cuentas;
	private List<Transaccion> transaciones;
        @EJB
	private CuentaDao cuDao;
	
	@PostConstruct
	public void init() {
		afiliadoSeleccionado = new Persona();
		afiliados = new ArrayList<Persona>();
		cuentaSeleccionada = new Cuenta();
		cuentas = new ArrayList<Cuenta>();
		transaciones = new ArrayList<Transaccion>();
//		cuDao = new CuentaDao();
		getClientes();
	}
	
	public void getClientes() {
		afiliados = cuDao.getClientes();
	}

	public Persona getAfiliadoSeleccionado() {
		return afiliadoSeleccionado;
	}
	
	public void verCuentas(Persona per) {
		cuentas = cuDao.getCuentas(per.getClienteList().get(0));
	}
	
	public void verTransacciones(Cuenta cuen) {
		transaciones = cuDao.getTransacciones(cuen);
	}

	public void setAfiliadoSeleccionado(Persona afiliadoSeleccionado) {
		this.afiliadoSeleccionado = afiliadoSeleccionado;
	}

	public List<Persona> getAfiliados() {
		return afiliados;
	}

	public void setAfiliados(List<Persona> afiliados) {
		this.afiliados = afiliados;
	}

	public Cuenta getCuentaSeleccionada() {
		return cuentaSeleccionada;
	}

	public void setCuentaSeleccionada(Cuenta cuentaSeleccionada) {
		this.cuentaSeleccionada = cuentaSeleccionada;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Transaccion> getTransaciones() {
		return transaciones;
	}

	public void setTransaciones(List<Transaccion> transaciones) {
		this.transaciones = transaciones;
	}
	
	
}

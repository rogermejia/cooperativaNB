package com.empresa.entities;

public class PersonaGenerica {
	private String nombre;
	private String apellidos;
	private String numeroDocumento;
	private int tiempoconocerse;
	private int edad;
	private String parentesco;
	private Float porcentaje;
	
	
	
	public PersonaGenerica() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public int getTiempoconocerse() {
		return tiempoconocerse;
	}
	public void setTiempoconocerse(int tiempoconocerse) {
		this.tiempoconocerse = tiempoconocerse;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
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
        
	
	
	
	
}

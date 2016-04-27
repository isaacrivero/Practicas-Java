package com.ejemplos.clases.abstractas;

public abstract class Coche {
	
	private String marca;
	private String modelo;
	private String matricula;
	
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.matricula = "";
	}
	
	public Coche(String marca, String modelo, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula="
				+ matricula + "]";
	}

	public abstract void encenderCentralita();
	public abstract void darAviso(String a);
	public abstract void arrancar();
}

package com.ejemplos.clases.abstractas;

public abstract class Policia {
	
	public Pistola arma;
	private String nombre;
	private Integer placa;
	private String rango;
	
	public Policia() {
		super();
		this.arma = new Pistola();
		this.arma.setMarca("Colt");
		this.nombre = "";
		this.placa = 0;
		this.rango = "";
	}
	
	public Policia(Pistola arma, String nombre, 
			Integer placa, String rango) {
		super();
		this.arma = arma;
		this.nombre = nombre;
		this.placa = placa;
		this.rango = rango;
	}

	public Pistola getArma() {
		return arma;
	}

	public void setArma(Pistola arma) {
		this.arma = arma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPlaca() {
		return placa;
	}

	public void setPlaca(Integer placa) {
		this.placa = placa;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
	
	@Override
	public String toString() {
		return "Policia [arma=" + arma + ", nombre=" + nombre + ", placa="
				+ placa + ", rango=" + rango + "]";
	}

	public abstract void investigar();
	
	public abstract void detener();
	
}

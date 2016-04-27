package com.ejemplos.ejercicios;

public class Mamifero {
	
	public Integer edad;
	private String raza;
	protected String familia;
	public String nombre;
	
	public Mamifero() {
		super();
		this.edad = 0;
		this.raza = "";
		this.familia = "";
		this.nombre="";
	}
	
	//Comentario para pruebas. Nuria
	
	public Mamifero(Integer edad, String raza, 
			String familia,String nombre) {
		super();
		this.edad = edad;
		this.raza = raza;
		this.familia = familia;
		this.nombre=nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public void reproducir(){
		System.out.println("Ven pa'ca cordera!");
	}
	
	@Override
	public String toString() {
		return "Mamifero [edad=" + edad + ", raza=" + raza + ", familia="
				+ familia + ", nombre="+nombre+"]";
	}
	

}

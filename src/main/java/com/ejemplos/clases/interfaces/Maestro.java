package com.ejemplos.clases.interfaces;

public class Maestro implements Sensei {
	
	private String nombre;
	
	public Maestro() {
		super();
		this.nombre = "";
	}

	public Maestro(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void ensegnar(String materia) {
		System.out.println("Dar cera Pulir cera!");

	}

	@Override
	public void darquepensar() {
		System.out.println("Yo aprend� karate para" +
				"defenderme para darme cuenta que cuando sab�a " +
				"karate no lo necesitaba! ");

	}

}

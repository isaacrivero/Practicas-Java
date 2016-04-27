package com.ejemplos.interfaces;

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
		System.out.println("Yo aprendí karate para" +
				"defenderme para darme cuenta que cuando sabía " +
				"karate no lo necesitaba! ");

	}

}

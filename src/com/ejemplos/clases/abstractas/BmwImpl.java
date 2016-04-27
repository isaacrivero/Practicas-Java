package com.ejemplos.clases.abstractas;

public final class BmwImpl extends Bmw {

	public BmwImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BmwImpl(String marca, String modelo, String matricula) {
		super(marca, modelo, matricula);
		// TODO Auto-generated constructor stub
	}

	public BmwImpl(String modelo, String matricula) {
		super(modelo, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		System.out.println("Brooooooom!!!");

	}

}

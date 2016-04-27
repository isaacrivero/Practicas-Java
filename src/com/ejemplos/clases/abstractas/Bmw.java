package com.ejemplos.clases.abstractas;

public abstract class Bmw extends Coche {

	public Bmw() {
		super();
		this.setMarca("BMW");
	}

	public Bmw(String modelo, String matricula) {
		super("BMW", modelo, matricula);
		
	}
	
	public Bmw(String marca,String modelo, String matricula) {
		super(marca, modelo, matricula);
	
	}

	@Override
	public void encenderCentralita() {
		System.out.println("Bip bip!");

	}

	@Override
	public void darAviso(String a) {
		System.out.println("Aviso: "+a);

	}

	public abstract void arrancar();
	
	public void meGustaConducir(){
		System.out.println("fiuuuuuu iuuuuuu!");
		//tiroriroooooooo	
	}
}

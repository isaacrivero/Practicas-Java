package com.ejemplos.ejercicios;

public class Perro extends Mamifero {

	public Boolean tieneduegno;
	public String nombreduegno;
	private boolean tienepulgas;
	
	
	//comentario molon!
	public Perro() {
		super();
		tieneduegno=new Boolean(false);
		nombreduegno=new String("");
		tienepulgas=false;

		
	}
	public Perro(Integer edad, String raza, 
			String familia, String nombre) {
		super(edad, raza, familia, nombre);
	}
	public Perro(Integer edad, String raza, String familia,
			String nombre,
			Boolean tieneduegno, String nombreduegno,
			boolean tienepulgas) {
		super(edad, raza, familia,nombre);
		this.tieneduegno=tieneduegno;
		this.nombreduegno=nombreduegno;
		this.tienepulgas=tienepulgas;
	}
	public boolean isTienepulgas() {
		return tienepulgas;
	}
	public void setTienepulgas(boolean tienepulgas) {
		this.tienepulgas = tienepulgas;
	}
	
	@Override
	public void reproducir(){
		super.reproducir();
		System.out.println("En cuclillas! Guau!");
	}
	
	@Override
	public String toString() {
		return "Perro [tieneduegno=" + tieneduegno + ", nombreduegno="
				+ nombreduegno + ", tienepulgas=" + tienepulgas + ", edad="
				+ edad + ", familia=" + familia + ", getRaza()=" + getRaza()
				+ ", nombre="+nombre+"]";
	}
	
	//guau!
	
	
}

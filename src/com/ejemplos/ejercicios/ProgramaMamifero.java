package com.ejemplos.ejercicios;

public class ProgramaMamifero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mamifero m=new Mamifero();
		m.edad=27;
		m.setFamilia("Simios");
		m.setRaza("Orangután");
		m.nombre="Naranjito";
		m.reproducir();
		System.out.println(m);
		Mamifero m2=new Mamifero(7,"Cocker",
				"Vertebrados","Relampago");
		Perro toby=new Perro();
		toby.setTienepulgas(true);
		toby.tieneduegno=true;
		toby.nombreduegno="David";
		toby.reproducir();
		System.out.println(toby);
		Perro perro2=new Perro();
		perro2.nombre="Dama";
		perro2.setRaza("Pastor Aleman");
		perro2.edad=-1;
		System.out.println(perro2);
		Perro perro3=new Perro(1,"Salchicha","Vertebrados",
				"Scout",true,"Joe",false);
		System.out.println(perro3);
	}

}

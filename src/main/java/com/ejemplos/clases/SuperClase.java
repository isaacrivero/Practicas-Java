package com.ejemplos.clases;

import com.ejemplos.clases.Clase;

public class SuperClase extends Clase {
	
	public void haceAlgo(){
		System.out.println("Hace algo en hija");
		//tambien haceAlgo() de la clase padre
		super.haceAlgo();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

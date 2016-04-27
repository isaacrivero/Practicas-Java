package com.ejemplos.clases;

import com.ejemplos.clases.beans.Cliente;

public class ProgramaCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c1=new Cliente();
		c1.publico=1;
		int i=c1.getProtegido();
		//c1.id=1;
		//c1.dir="Autonomia 64";
		System.out.println(c1);
		System.out.println("conflicto");
		Cliente c2=new Cliente(
				0,
				"Pepe","923547896",
				"calle de mi casa es particular",
				"0789541B");
		System.out.println(c2.getNombre());
		c2.setNombre("juan");
		System.out.println(c2);
		System.out.println(Cliente.CONSTANTE);
		/*
		 * 
		 * struct cliente{
		 * 
		 * int id;
		 * char * nombre;
		 * 
		 * 
		 * }
		 * 
		 * void init_cliente(cliente *c){
		 * c.id=0;
		 * c.nombre=alleoc(sizeof(char)*20);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

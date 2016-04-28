package com.ejemplos.datos;

public class Cadenas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hola Mundo";
		System.out.println(s);
		System.out.println(s.length());
		StringBuffer s2=new StringBuffer("Hola Mundo");
		System.out.println(s2);
		System.out.println(s2.length());
		s2.append("!!!");
		System.out.println(s2);
		System.out.println(s2.length());
		String s3="Hola Mundo";
		if(s3.equals(s3)){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		char c;
		c=s2.charAt(0);
		System.out.println(c);
		String s4=s.substring(0, 3);
		System.out.println(s4);
		int i;
		i=s.indexOf("Mundo");
		System.out.println(i);
		s=s.replace('H', 'h');
		System.out.println(s);
		System.out.println(String.valueOf(s));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String dias="Lunes,Martes,Miércoles,Jueves," +
				"Viernes,Sábado,Domingo";
		String [] adias=dias.split(",");
		for(String dia:adias){
			System.out.println(dia);
		}
		
		
		/**
		 * prueba comentario Mireia 
		 */
	}

}

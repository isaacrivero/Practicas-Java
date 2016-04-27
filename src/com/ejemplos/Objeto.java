package com.ejemplos;

public class Objeto {

	public String s;
	/**
	 * @param args
	 */
	public Objeto(){
		this.s="cadena";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objeto o= new Objeto();
		System.out.println(o);
		o.s="otra cadena";
		System.out.println(o.s);
		Objeto o2=o;
		System.out.println(o2.s);
		System.out.println(o instanceof Objeto);
	}

}

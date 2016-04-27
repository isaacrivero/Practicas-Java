package com.ejemplos;

import java.util.Vector;

public class Vectores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add("Hola");
		v.add(3.5);
		for (Object o:v){
			System.out.println(o);
		}
	}

}

package com.ejemplos.clases.abstractas;

public class ProgramaBmw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bmw x5=new BmwImpl();
		x5.arrancar();
		System.out.println(x5);
		Bmw m5=new BmwImpl("BMW","X5","");
		System.out.println(m5);
	}

}

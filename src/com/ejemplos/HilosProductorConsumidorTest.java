package com.ejemplos;


public class HilosProductorConsumidorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HilosContenedor c = new HilosContenedor ();
	    HilosProductor produce = new HilosProductor (c);
	    HilosConsumidor consume = new HilosConsumidor (c);
	    produce.start();
	    consume.start();
	}

}


package com.ejemplos;
//Comentario Iker

public class Enumerado {
	public static final int NORTE=1;
	public static final int SUR=2;
	public static final int ESTE=3;
	public static final int OESTE=4;
	public direcciones dir;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumerado e= new Enumerado();
		System.out.println(e.dir.ESTE);
		System.out.println(e.ESTE);
	}

}

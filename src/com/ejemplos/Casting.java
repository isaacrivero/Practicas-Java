package com.ejemplos;

public class Casting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l=2000;
		int i=0;
		i=(int) l;
		System.out.println(i);
		char c='c';
		//conversión automática de char a int
		i=c;
		float f;
		f=i;
		System.out.println(f);
	}

}

package com.ejemplos.datos;

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
		//conversi�n autom�tica de char a int
		i=c;
		float f;
		f=i;
		System.out.println(f);
		try {
			int x = Integer.parseInt("9");
			double d = Double.parseDouble("5");
			//transforma a entero desde hexadecimal
			int b = Integer.parseInt("444", 16);
			f = Float.parseFloat("3.2");
			System.out.println(x);
			System.out.println(d);
			System.out.println(b);
			System.out.println(f);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}

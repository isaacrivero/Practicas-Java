package com.ejemplos;

public class MetodosEspeciales {

	/**
	 * @param args
	 */
	public int sumador (int ... varios){
		int s=0;
		for(int i:varios){
			s+=i;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosEspeciales m= new MetodosEspeciales();
		System.out.println(m.sumador(1,2,3,4,5,6));
	}

}

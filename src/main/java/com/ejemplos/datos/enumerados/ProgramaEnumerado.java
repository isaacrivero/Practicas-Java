package com.ejemplos.datos.enumerados;

public class ProgramaEnumerado {
	int i;
	/**
	 * @param args
	 */
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramaEnumerado e=new ProgramaEnumerado();
		e.setI(Enumerado.NORTE);
		System.out.println(e.i);
	}
	

}

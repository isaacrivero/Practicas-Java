package com.ejemplos;

public class EnumeradoUso {
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
		EnumeradoUso e=new EnumeradoUso();
		e.setI(Enumerado.NORTE);
		System.out.println(e.i);
	}
	

}

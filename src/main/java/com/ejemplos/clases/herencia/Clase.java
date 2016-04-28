package com.ejemplos.clases.herencia;

public class Clase {
	public int i;
	
	protected int j;
	
	private int k;
	
	Clase(){
		this.j=0;
		this.k=0;
	}
	
	Clase(int i){
		this.i=i;
		this.j=0;
		this.k=0;
	}
	
	Clase(int i, int j){
		this.i=i;
		this.j=j;
		this.k=0;
	}
	
	Clase(int i, int j, int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	public void haceAlgo(){
	System.out.println("Hace algo");
	}
	
	protected void finalize() throws Throwable{
		//cosas que quiero hacer al destruir el objeto
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase c= new Clase();
		c.i=12;
		System.out.println(c.i);
		c.setJ(7);
		System.out.println(c.getJ());
		c.setK(27);
		System.out.println(c.getK());
		Clase c2=new Clase(2);
		System.out.println(c2.i);
		Clase c3=new Clase(2,3);
		System.out.println(c3.i);
		System.out.println(c3.getJ());
		Clase c4=new Clase(2,3,4);
		System.out.println(c4.i);
		System.out.println(c4.getJ());
		System.out.println(c4.getK());
	}

}

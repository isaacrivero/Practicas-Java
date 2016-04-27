package com.ejemplos.clases.beans;

public class Cliente {
	// constantes
	public static int CONSTANTE=27;
	//atributos
	private long id;
	private String nombre;
	private String tlf;
	private String dir;
	private String nifcif;
	public Integer nota;
	
	public int publico;
	protected int protegido;
	
	public int getProtegido(){
		return protegido;
	}
	public void setProtegido(int i){
		if(i>=0){
			protegido=i;
		}else{
			System.out.println("El valo de protegido " +
					"es demasiado pequeño, no se ha guardado");
		}
	}
	private void privado(){
		System.out.println("shhiiiii es un secreto!");
	}

	public Cliente(){
		id=0;
		nombre="";
		tlf="";
		dir="";
		nifcif="";
		
	}

	public Cliente(	long id, String nombre, String tlf, 
					String dir, String nifcif) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tlf = tlf;
		this.dir = dir;
		this.nifcif = nifcif;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getNifcif() {
		return nifcif;
	}

	public void setNifcif(String nifcif) {
		this.nifcif = nifcif;
	}

	@Override
	public String toString() {
		
		return "Cliente [id=" + id + ", nombre=" + nombre 
				+ ", tlf=" + tlf
				+ ", dir=" + dir + ", nifcif=" + nifcif + "]";
	}


}

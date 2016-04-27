package com.ejemplos.clases.beans;

public final class Empresa extends Cliente {
	private String nresponsable;

	public Empresa() {
		super();
		nresponsable="";
	}

	public Empresa(long id, String nombre, String tlf, 
			String dir, String nifcif, String nresponsable) {
		super(id, nombre, tlf, dir, nifcif);
		this.nresponsable=nresponsable;
	}

	public String getNresponsable() {
		return nresponsable;
	}

	public void setNresponsable(String nresponsable) {
		this.nresponsable = nresponsable;
	}

	@Override
	public String toString() {
		return "Empresa [nresponsable=" + nresponsable + ", publico=" + publico
				+ ", protegido=" + protegido + ", getId()=" + getId()
				+ ", getNombre()=" + getNombre() + ", getTlf()=" + getTlf()
				+ ", getDir()=" + getDir() + ", getNifcif()=" + getNifcif()
				+ "]";
	}
	
	public static void estatico(){
		
	}
}

package com.ejemplos.clases.abstractas;

public abstract class ComoInterfaz {
	
	public String modelotractor;
	
	
	public ComoInterfaz() {
		super();
		this.modelotractor = "";
	}
	
	public ComoInterfaz(String modelotractor) {
		super();
		this.modelotractor = modelotractor;
	}
	public abstract void ara();
	public abstract void siembre();
	public abstract void recoge();

}

package com.ejemplos;

public enum DireccionesGeo {
	NORTE(1), SUR(2), ESTE(3), OESTE(4);
	int d;
	DireccionesGeo(){
		this.d=1;
	}
	DireccionesGeo(int d){
		this.d=d;
	}
}

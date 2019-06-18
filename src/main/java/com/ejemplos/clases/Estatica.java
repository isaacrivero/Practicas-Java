package com.ejemplos.clases;

public class Estatica {

	public static int version = 10;
    public int numeroDeCapitulos;
    public static void anadeUnCapitulo() {
        //numeroDeCapitulos++;        // esto no funciona
        }
    public static void modifica_version( int i ) {
        version+=i;                    // esto si funciona
        }
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		Estatica e= new Estatica();
		e.modifica_version(1);
		e.modifica_version(1);
		e.modifica_version(1);
		e.modifica_version(1);
		System.out.println(e.version);


	}

}


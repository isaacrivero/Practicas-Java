package com.ejemplos.clases;

public class Estatica {
	public static final float MI_CONSTANTE=3.1415f;

	public static int version = 10;
    public int numeroDeCapitulos;
    public static void anadeUnCapitulo() {
        //numeroDeCapitulos++;        // esto no funciona
    }
    public static void modificaVersion(int i ) {
        version+=i;                    // esto si funciona
    }
    /**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer radio = 12;
		Double area = Math.PI * radio;
		Float area2 = Estatica.MI_CONSTANTE * radio;

		Estatica.modificaVersion(1);
		Estatica e= new Estatica();
		e.modificaVersion(1);
		e.modificaVersion(1);
		e.modificaVersion(1);
		System.out.println(Estatica.version);


	}

}


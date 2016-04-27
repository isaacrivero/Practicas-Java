package com.ejemplos.excepciones;

class Limites extends Exception {}
class demasiadoCalor extends Limites {}
class demasiadoFrio extends Limites {}
class demasiadoRapido extends Limites {}
class demasiadoCansado extends Limites {}
   
public class Excepciones {
	public static void main(String[] args) {
		int valor;
		int x;
		try {
		    for( x=0,valor = 100; x < 100; x ++ )
		        valor /= x;
		    }
		catch( ArithmeticException e ) {
		    System.out.println( "Matem�ticas locas!" );
		    }
		catch( Exception e ) {
		    System.out.println( "Se ha producido un error" );
		    }
			int temp=30;
			int dormir=7;
		    try {
		        if( temp > 40 )
		            throw( new demasiadoCalor() );
		        if( dormir < 8 )
		            throw( new demasiadoCansado() );
		    } catch( Limites lim ) {
		        if( lim instanceof demasiadoCalor )
		            {
		            System.out.println( "Capturada excesivo calor!" );
		            return;
		            }
		        if( lim instanceof demasiadoCansado ) {
		            System.out.println( "Capturada excesivo cansancio!" );
		            return;
		            }
		    } finally{
		        System.out.println( "En la clausula finally" );
		    }
		    
	}
}

package com.ejemplos.awt;


import java.awt.*;
import java.applet.Applet;

public class ListaMult extends Applet {
    List lm = new List( 6,true );

    public void init() {
        Button boton = new Button( "Aceptar" );

        lm.add( "Mercurio" ); 
        lm.add( "Venus" ); 
        lm.add( "Tierra" ); 
        lm.add( "Marte" ); 
        lm.add( "Jupiter" ); 
        lm.add( "Saturno" ); 
        lm.add( "Neptuno" ); 
        lm.add( "Urano" ); 
        lm.add( "Pluton" ); 
        add( lm );
        add( boton );
        }

    public boolean action( Event evt,Object obj ) {
        if( evt.target instanceof Button )
            {
            if( "Aceptar".equals( obj ) ) 
                {
                String seleccion[];

                seleccion = lm.getSelectedItems();
                for( int i=0; i < seleccion.length; i++ )
                    System.out.println( seleccion[i] );
                }
            }

        return true;
        }
    }

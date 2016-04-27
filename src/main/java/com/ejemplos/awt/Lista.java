package com.ejemplos.awt;


import java.awt.*;
import java.applet.Applet;

public class Lista extends Applet {

    public void init() {
        List l = new List( 4,false );
        l.add( "Mercurio" ); 
        l.add( "Venus" ); 
        l.add( "Tierra" ); 
        l.add( "Marte" ); 
        l.add( "Jupiter" ); 
        l.add( "Saturno" ); 
        l.add( "Neptuno" ); 
        l.add( "Urano" ); 
        l.add( "Pluton" ); 
        add( l );
        }
    public boolean action( Event evt,Object obj ) {
        if( evt.target instanceof List )
            System.out.println( "Entrada de la Lista: " + obj );

        return true;
        }
    }
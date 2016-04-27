package com.ejemplos.awt;
import java.awt.*;
import java.applet.Applet;

public class CampoTexto extends Applet {
    TextField tf1,tf2,tf3,tf4;

    public void init() {
        // Campo de texto vacío
        tf1 = new TextField();
        // Campo de texto vacío con 20 columnas
        tf2 = new TextField( 20 );
        // Texto predefinido
        tf3 = new TextField( "Hola" );
        // Texto predefinido en 30 columnas
        tf4 = new TextField( "Hola",30 );
        add( tf1 );
        add( tf2 );
        add( tf3 );
        add( tf4 );
        }

    public boolean action( Event evt,Object obj ) {
        if( evt.target instanceof TextField )
            {
            if( evt.target.equals( tf1 ) )
                System.out.println( "Campo de Texto 1: " +
                    evt.arg.toString() );
            if( evt.target.equals( tf1 ) )
                System.out.println( "Campo de Texto 2: " +
                    evt.arg.toString() );
            if( evt.target.equals( tf1 ) )
                System.out.println( "Campo de Texto 3: " +
                    evt.arg.toString() );
            if( evt.target.equals( tf1 ) )
                System.out.println( "Campo de Texto 4: " +
                    evt.arg.toString() );
            }
        return true;
        }
    }
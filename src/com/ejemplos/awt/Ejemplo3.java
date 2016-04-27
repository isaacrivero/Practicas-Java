package com.ejemplos.awt;

import java.awt.*;

public class Ejemplo3 extends java.applet.Applet {
    public static void main( String args[] ) {
        Frame f = new Frame( "Ejemplo 3" );
        Ejemplo3 ej = new Ejemplo3();

        f.add( "Center",ej );
        f.pack();
        f.show();
        }
    }
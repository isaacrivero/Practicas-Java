package com.ejemplos.awt;

import java.awt.*;

public class Ejemplo2 extends Panel {
    public static void main( String args[] ) {
        Frame f = new Frame( "Ejemplo 2" );
        Ejemplo2 ej = new Ejemplo2();

        f.add( "Center",ej );
        f.pack();
        f.show();
        }
    }

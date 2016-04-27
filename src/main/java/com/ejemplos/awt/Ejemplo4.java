package com.ejemplos.awt;

import java.awt.*;

public class Ejemplo4 extends java.applet.Applet {
    public void init() {
        add( new Button( "Uno" ) );
        add( new Button( "Dos" ) );
        }

    public static void main( String args[] ) {
        Frame f = new Frame( "Ejemplo 4" );
        Ejemplo4 ej = new Ejemplo4();

        ej.init();

        f.add( "Center",ej );
        f.pack();
        f.show();
        }
    }
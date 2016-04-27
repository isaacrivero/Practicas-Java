package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class BotonComprobacion extends Applet {
    Checkbox Relleno;

    public void init() {
        Relleno = new Checkbox( "Relleno");

        add( Relleno );
        }

    public boolean action( Event evt,Object obj ) {
        if( evt.target instanceof Checkbox )
            System.out.println( "CheckBox: " + evt.arg.toString() );

        return true;
        }
    }
package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class BotonSeleccion extends Applet {
    Choice Selector;

    public void init() {
        Selector = new Choice();

        Selector.addItem( "Rojo" );
        Selector.addItem( "Verde" );
        Selector.addItem( "Azul" );
        add( Selector );
    }

public boolean action( Event evt,Object obj ) {
    if( evt.target instanceof Choice )
        {
        String color = (String)obj;

        System.out.println( "El color elegido es el " + color );
        }

    return true;
    }
}

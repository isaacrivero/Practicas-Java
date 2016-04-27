package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;
class BotonAceptar extends Button {

    public BotonAceptar() {
        setLabel( "Aceptar" );
        }

    public boolean action( Event evt,Object obj ) {
        System.out.println( "Boton Aceptar" );
        return true;
        }
    }


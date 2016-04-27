package com.ejemplos.awt;

import java.applet.Applet;

public class BotonAuto extends Applet {
    BotonAceptar boton;

    public void init() {
        boton = new BotonAceptar();
        add( boton );
        }
    }
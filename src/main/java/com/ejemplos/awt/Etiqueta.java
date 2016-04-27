package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class Etiqueta extends Applet {

    public void init() {
        Label etiq1 = new Label( "Hola Java!" );
        Label etiq2 = new Label( "Otra Etiqueta" );

        setLayout( new FlowLayout( FlowLayout.CENTER,10,10) );
        add( etiq1 );
        add( etiq2 );
        }
    }
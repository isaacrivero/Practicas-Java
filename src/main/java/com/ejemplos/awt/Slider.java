package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class Slider extends Applet {
    Scrollbar rojo,verde,azul;

    public void init() {
        rojo = new Scrollbar( Scrollbar.VERTICAL,0,1,0,255 );
        verde = new Scrollbar( Scrollbar.VERTICAL,0,1,0,255 );
        azul = new Scrollbar( Scrollbar.VERTICAL,0,1,0,255 );

        add( rojo );
        add( verde );
        add( azul );
        }
    }
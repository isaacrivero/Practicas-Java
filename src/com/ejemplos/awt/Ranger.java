package com.ejemplos.awt;


import java.awt.*;
import java.applet.Applet;

public class Ranger extends Applet {
    Scrollbar rango;

    public void init() {
        rango = new Scrollbar( Scrollbar.HORIZONTAL,0,64,0,255 );

        add( rango );
       
        }
    }

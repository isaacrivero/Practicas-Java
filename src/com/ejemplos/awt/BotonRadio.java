package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class BotonRadio extends Applet {
    CheckboxGroup Radio;

    public void init() {
        Radio = new CheckboxGroup();

        add( new Checkbox( "Primero",Radio,true) );
        add( new Checkbox( "Segundo",Radio,false) );
        add( new Checkbox( "Tercero",Radio,false) );
        }
    }
package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class AreaTexto extends Applet {
    TextArea t1,t2;

    public void init() {
        Button boton = new Button( "Aceptar" );

        t1 = new TextArea();
        t2 = new TextArea( "Tutorial de Java",5,40 );
        t2.setEditable( false );

        add( t1 );
        add( t2 );
        add( boton );
        }

    public boolean action( Event evt,Object obj ) {
        if( evt.target instanceof Button )
            {
            if( "Aceptar".equals( obj ) ) 
                {
                String texto = t1.getText();

                System.out.println( texto );
                }
            }

        return true;
        }
    }
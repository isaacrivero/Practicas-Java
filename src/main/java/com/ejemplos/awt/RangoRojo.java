package com.ejemplos.awt;


import java.awt.*;
import java.applet.Applet;

public class RangoRojo extends Applet {
    Scrollbar rango;
    TextField valor;
    Label etiqueta;

    public void init() {
        rango = new Scrollbar( Scrollbar.HORIZONTAL,0,1,0,255 );
        valor = new TextField( "0",5 );
        etiqueta = new Label( "Rojo (0-255)" );

        setLayout( new GridLayout( 1,3 ) );
        valor.setEditable( false );

        add( etiqueta );
        add( rango );
        add( valor );
        }

    public boolean handleEvent( Event evt ) {
        if( evt.target instanceof Scrollbar )
            {
            valor.setText( 
                Integer.toString( ((Scrollbar)evt.target).getValue() ) );
            return true;
            }

        return super.handleEvent( evt );
        }
    }

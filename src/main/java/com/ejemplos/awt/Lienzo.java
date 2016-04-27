package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class Lienzo extends Applet {
    Button boton;
    public void init() {
        setLayout( new BorderLayout( 15,15 ) );
        boton = new Button( "Test" ); 
        MiCanvas canv = new MiCanvas( 100,100 );

        add( "Center",canv );
        add( "South",boton );
        }

    public boolean action( Event evt,Object obj ) {
        System.out.println( "Evento: " + obj );
        return true;
        }

    public boolean mouseDown( Event evt,int x, int y ) {
        System.out.println( "Raton: ("+x+","+y+")" );
        return true;
        }
    }

class MiCanvas extends Canvas {
    private int ancho;
    private int alto;

    public MiCanvas( int anc,int alt ) {
        ancho = anc;
        alto = alt;
        //this.resize(anc, alt);
        reshape( 0,0,anc,alt );
        }

    public void paint( Graphics g ) {
        g.setColor( Color.blue );
        g.fillRect( 0,0,ancho,alto );
        }

    public boolean mouseDown( Event evt,int x, int y ) {
        if( x < ancho && y < alto ) 
            {
            System.out.println( "Raton en Canvas: ("+x+","+y+")" );
            return true;
            }
        return false;
        }
    }

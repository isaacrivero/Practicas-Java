package com.ejemplos.awt;

/*
 * SuperClase de partida para pr�ctica de AWT
 * Contenedor base un java.awt.Frame
 */

import java.awt.*;
import java.awt.event.*;
	
public class Ventana extends Frame {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana (int h, int v, boolean visible) {
	setSize(new Dimension(h,v));
	setVisible(visible);

	CerrarVentana cv = new CerrarVentana();
	this.addWindowListener(cv);

    }
	
    @SuppressWarnings("deprecation")
	public static void main (String[] args) {
	Ventana miVentana = new Ventana(600,300,true);
	miVentana.show();
    }
}


class CerrarVentana extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
	System.exit(0);
    }
}


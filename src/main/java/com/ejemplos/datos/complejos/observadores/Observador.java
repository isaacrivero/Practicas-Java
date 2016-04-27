package com.ejemplos.datos.complejos.observadores;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by pepesan on 28/04/2016.
 */
public class Observador implements Observer {


    public void update(Observable o, Object arg) {
        System.out.println("Nueva Actualizacion: "+o+" -> "+arg);
    }

}

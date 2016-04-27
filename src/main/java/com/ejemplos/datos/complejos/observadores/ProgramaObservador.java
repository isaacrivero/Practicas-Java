package com.ejemplos.datos.complejos.observadores;

/**
 * Created by pepesan on 28/04/2016.
 */
public class ProgramaObservador {
    public static void main(String args[]){
        Observada observado = new Observada();
        Observador observador = new Observador();

        observado.addObserver(observador);

        observado.cambiarMensaje("Cambio 1");
        observado.cambiarMensaje("Cambio 2");
        observado.cambiarMensaje("Cambio 3");
    }
}

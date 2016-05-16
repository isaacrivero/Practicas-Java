package com.ejemplos.clases.abstractas;

/**
 * Created by pepesan on 16/5/16.
 */
public class ControladorSumaConsola extends Controlador {

    public ControladorSumaConsola(Integer i){
        super(i);
    }
    public void calcula(Integer i) {
        this.i=++i;
    }


    public void log() {
        System.out.println("Se ha hecho un incremento " +
                "sobre i con el resultado: "+this.i);
    }
}

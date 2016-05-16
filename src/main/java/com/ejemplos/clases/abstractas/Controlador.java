package com.ejemplos.clases.abstractas;

import com.ejemplos.clases.interfaces.Interfaz;

/**
 * Created by pepesan on 16/5/16.
 */
public abstract class Controlador {

    public Integer i;

    public Controlador(Integer i){
        this.i=i;
        procesa();
    }
    /*
        Calcula una operación matemática sobre el atributo 1
     */
    public abstract void calcula(Integer i);


    /*
        Realizar el log de la operación sobre i
     */
    public abstract void log();

    public void procesa(){
        calcula(i);
        log();
    }
}

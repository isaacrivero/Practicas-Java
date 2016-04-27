package com.ejemplos.datos.complejos.observadores;

import java.util.Observable;

/**
 * Created by pepesan on 28/04/2016.
 */
public class Observada extends Observable {
    String mensaje;

    public Observada(){
        mensaje = "Objeto Observado Iniciado";
    }

    public void cambiarMensaje(String m){
        mensaje = m;
        //Marcamos el objeto observable como objeto que ha cambiado
        setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        notifyObservers(mensaje);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
    }
}

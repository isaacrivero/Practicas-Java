package com.ejemplos.datos.complejos.iteradores;

import java.util.Iterator;

/**
 * Created by pepesan on 28/04/2016.
 */
public class ConjuntoPersonas implements Iterable<Persona> {
    public Persona[] conjuntoPersonas; // Atributo de la clase

    public ConjuntoPersonas(Persona[] p) { // Constructor de la clase
        conjuntoPersonas = p;
    }
    public Iterator<Persona> iterator() {
        Iterator it = new MiIteratorPersona();
        return it;
    }
    protected class MiIteratorPersona implements Iterator<Persona>   {
        protected int posicionarray;
        public MiIteratorPersona()   { posicionarray = 0; }
        public boolean hasNext() {
            boolean result;
            if (posicionarray < conjuntoPersonas.length) { result = true; }
            else { result = false; }
            return result;
        }
        public Persona next() {
            posicionarray++;
            return conjuntoPersonas[posicionarray-1];
        }
        public void remove(){
            throw new UnsupportedOperationException("No soportado.");
        }
    }
}

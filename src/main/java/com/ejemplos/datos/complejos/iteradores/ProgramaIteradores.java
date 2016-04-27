package com.ejemplos.datos.complejos.iteradores;

/**
 * Created by pepesan on 28/04/2016.
 */
public class ProgramaIteradores  {
    public static void main(String arg[]) {
        Persona p1 = new Persona(74999999,35);
        Persona p2 = new Persona(72759474,30);
        Persona p3 = new Persona(74853735,25);
        Persona[] pp = {p1,p2,p3};
        ConjuntoPersonas cp = new ConjuntoPersonas(pp);
        for (Persona p : cp) // Esto es un for extendido o for-each
        {
            System.out.println("La persona:"+p.dni+" tiene una edad de:"+p.edad);
        }
    }
}
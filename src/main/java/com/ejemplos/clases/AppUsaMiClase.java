package com.ejemplos.clases;

public class AppUsaMiClase {
    public static void main(String[] args) {
        MiClase miObjeto;
        miObjeto=new MiClase();
        System.out.println(miObjeto);
        miObjeto.numAlumnos = 8;
        System.out.println(miObjeto.numAlumnos);
        // No es posible asignarlo, es privado
        // miobjeto.nombre= "Carl Marx";
        miObjeto.setNombre("Carl Marx");
        System.out.println(miObjeto.getNombre());

    }
}

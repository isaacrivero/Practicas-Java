package com.ejemplos.clases.herencia;

/**
 * Created by pepesan on 28/04/2016.
 */
public class Gato extends Animal {

    public Gato(){
        super();
    }
    public Gato(String color, String raza,
                 Float peso,Float altura,
                 String nombre){
        super(color,raza,peso,altura,nombre);
    }
     public void ruido(){
         System.out.println("Miauuuuu!");
     }

}

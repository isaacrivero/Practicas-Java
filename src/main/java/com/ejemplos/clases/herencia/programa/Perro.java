package com.ejemplos.clases.herencia.programa;

import com.ejemplos.clases.herencia.Animal;

/**
 * Created by pepesan on 28/04/2016.
 */
public class Perro extends Animal {

    private Integer lealtad;

    public Perro(){
        super();
        this.lealtad=10;
        this.raza="Canis";
    }
    public Perro(String color, String raza,
                 Float peso,Float altura,
                 String nombre){
        super(color,raza,peso,altura,nombre);
        this.lealtad=10;
    }
    public Perro(String color, String raza,
                 Float peso,Float altura,
                 String nombre, Integer lealtad){
        super(color,raza,peso,altura,nombre);
        this.lealtad=lealtad;
    }

    public Integer getLealtad() {
        return lealtad;
    }

    public void setLealtad(Integer lealtad) {
        this.lealtad = lealtad;
    }

    public void ruido(){
        ladrar();
    }
    public void ladrar(){
        System.out.println("Guau!");
    }


}

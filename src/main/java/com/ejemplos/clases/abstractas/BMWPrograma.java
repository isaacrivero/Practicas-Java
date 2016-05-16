package com.ejemplos.clases.abstractas;

/**
 * Created by pepesan on 16/5/16.
 */
public class BMWPrograma {

    public static void main(String[] args) {
        Bmw bmw=new Bmw() {
            @Override
            public void arrancar() {
                System.out.println("brum brum!");
            }
        };
        bmw.arrancar();
    }
}

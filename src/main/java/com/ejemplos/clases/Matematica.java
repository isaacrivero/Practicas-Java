package com.ejemplos.clases;

public class Matematica {
    public static final float PI = 3.1415f;
    public static int variableEstatica = 0;
    public static int cuentaDatos(int[] array){
        return array.length;
    }
    public static void main(String[] args) {
        System.out.println(Matematica.PI);
        int miarray[]= {1,1,2,3,4,4,5,6,6};
        System.out.println(Matematica.cuentaDatos(miarray));
        Matematica.variableEstatica++;
        System.out.println(Matematica.variableEstatica);
    }
}

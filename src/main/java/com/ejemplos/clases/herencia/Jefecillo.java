package com.ejemplos.clases.herencia;

import java.util.Arrays;

public class Jefecillo extends Empleado {
    private Empleado subordinados[];

    public Jefecillo(){
        super();
        this.subordinados = new Empleado[1];
    }

    public Jefecillo(
            String nombre,
            Integer edad,
            String puesto,
            Float sueldo,
            Empleado[] subordinados) {
        super(nombre, edad, puesto, sueldo);
        this.subordinados = subordinados;
    }

    public Empleado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empleado[] subordinados) {
        this.subordinados = subordinados;
    }
    public void addSubordinado(Empleado e){
        // añadir un subordinado al array
    }
    public void removeSubordinado(Empleado e){
        // borra un subordinado al array
    }
    public int getSubordinadosNumber(){
        return this.subordinados.length;
    }

    @Override
    public String toString() {
        return "Jefecillo{" +
                "subordinados=" + Arrays.toString(subordinados) +
                ", puesto='" + this.getPuesto() + '\'' +
                ", sueldo=" + this.getSueldo() +
                ", edad="+this.getEdad()+
                ", nombre="+this.getNombre()+
                '}';
    }
}

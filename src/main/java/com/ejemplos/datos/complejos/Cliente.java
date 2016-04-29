package com.ejemplos.datos.complejos;

import java.io.Serializable;

/**
 * Created by pepesan on 29/04/2016.
 */
public class Cliente implements Serializable{

    private String nombre;
    private String dni;
    private Direccion direccion;

    public Cliente() {
        this.nombre = "";
        this.dni = "";
        this.direccion=new Direccion();
    }
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion=new Direccion();
    }
    public Cliente(String nombre, String dni, Direccion direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion=direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

package com.ejemplos.datos.complejos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 29/04/2016.
 */
public class Cliente implements Serializable{

    private String nombre;
    private String dni;
    private List<Direccion> direcciones;

    public Cliente() {
        this.nombre = "";
        this.dni = "";
        this.direcciones=new ArrayList<Direccion>();
    }
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.direcciones=new ArrayList<Direccion>();
    }
    public Cliente(String nombre, String dni, List<Direccion> direcciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.direcciones=direcciones;
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

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
}

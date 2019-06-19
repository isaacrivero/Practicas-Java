package com.ejemplos.clases.herencia;

public class Vehiculo {
    private Float velocidad;

    public Vehiculo() {
        this.velocidad = 0.0f;
    }

    public Vehiculo(Float velocidad) {
        this.velocidad = velocidad;
    }

    public Float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                '}';
    }
}

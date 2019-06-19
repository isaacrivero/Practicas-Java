package com.ejemplos.clases.herencia;

public class Moto extends Vehiculo {
    private Boolean haceCaballito;

    public Moto() {
        super();
        this.haceCaballito = false;
    }

    public Moto(Float velocidad, Boolean haceCaballito) {
        super(velocidad);
        this.haceCaballito = haceCaballito;
    }

    public Boolean getHaceCaballito() {
        return haceCaballito;
    }

    public void setHaceCaballito(Boolean haceCaballito) {
        this.haceCaballito = haceCaballito;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "haceCaballito=" + haceCaballito +
                ", velocidad="+this.getVelocidad()+
                '}';
    }
}

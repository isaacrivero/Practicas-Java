package com.ejemplos.datos.complejos;

/**
 * Created by pepesan on 29/04/2016.
 */
public class Direccion {
    private String calle;
    private String numero;



    public Direccion() {
        this.calle = "";
        this.numero="";

    }
    public Direccion(String calle, String numero) {
        this.calle = calle;
        this.numero=numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direccion direccion = (Direccion) o;

        if (getCalle() != null ? !getCalle().equals(direccion.getCalle()) : direccion.getCalle() != null) return false;
        return getNumero() != null ? getNumero().equals(direccion.getNumero()) : direccion.getNumero() == null;

    }

    @Override
    public int hashCode() {
        int result = getCalle() != null ? getCalle().hashCode() : 0;
        result = 31 * result + (getNumero() != null ? getNumero().hashCode() : 0);
        return result;
    }
}

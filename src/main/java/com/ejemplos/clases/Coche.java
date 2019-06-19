package com.ejemplos.clases;

public class Coche {
    private String matricula;
    private Integer numRuedas;

    Coche(){
        this.matricula = "";
        this.numRuedas = 4;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(Integer numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", numRuedas=" + numRuedas +
                '}';
    }
}

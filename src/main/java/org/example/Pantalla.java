package org.example;

public class Pantalla {
    private String marca;
    private String modelo;
    private int anio;

    public Pantalla() {
    }

    public Pantalla(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anio + ")";
    }
}

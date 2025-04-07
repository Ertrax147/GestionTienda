package org.example;

public abstract class DispositivoTecnologico {
    protected String marca;
    protected String modelo;
    protected String procesador;
    protected String memoriaRAM;
    protected String memoriaAlmacenamiento;
    protected int añoFabricacion;
    protected double precio;
    protected int stock;

    // Constructor
    public DispositivoTecnologico(String marca, String modelo, String procesador, String memoriaRAM, String memoriaAlmacenamiento, int añoFabricacion, double precio, int stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.añoFabricacion = añoFabricacion;
        this.precio = precio;
        this.stock = stock;
    }

    public abstract String getTipo();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - Precio: " + precio + " - Stock: " + stock;
    }
}

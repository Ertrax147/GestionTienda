package org.example;

public class ComputadorEscritorio extends DispositivoTecnologico {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public ComputadorEscritorio(String marca, String modelo, String procesador, String memoriaRAM, String memoriaAlmacenamiento, int añoFabricacion, double precio, int stock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, modelo, procesador, memoriaRAM, memoriaAlmacenamiento, añoFabricacion, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    @Override
    public String getTipo() {
        return "Computador de Escritorio";
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public String getFuentePoder() {
        return fuentePoder;
    }

    public void setFuentePoder(String fuentePoder) {
        this.fuentePoder = fuentePoder;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tarjeta de Video: " + tarjetaVideo + " | Fuente de Poder: " + fuentePoder + " | Chasis: " + chasis + " | Pantalla: " + pantalla;
    }
}
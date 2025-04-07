package org.example;
public class ComputadorEscritorio extends DispositivoTecnologico {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public ComputadorEscritorio() {}

    public ComputadorEscritorio(String marca, int ram, int almacenamiento, String procesador, String modelo,
                                int anioFabricacion, double precio, int stock,
                                String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, ram, almacenamiento, procesador, modelo, anioFabricacion, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
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
    public String especificaciones() {
        return "Computador de escritorio: " + marca + " " + modelo + "\nRAM: " + ram + "GB, Almacenamiento: " +
                almacenamiento + "GB, Procesador: " + procesador + "\nTarjeta de video: " + tarjetaVideo +
                ", Fuente: " + fuentePoder + ", Chasis: " + chasis + "\nPantalla: " + pantalla.toString();
    }
}

package org.example;
public class Notebook extends DispositivoTecnologico {
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook() {}

    public Notebook(String marca, int ram, int almacenamiento, String procesador, String modelo,
                    int anioFabricacion, double precio, int stock,
                    String resolucionPantalla, String tipoTeclado, int bateria) {
        super(marca, ram, almacenamiento, procesador, modelo, anioFabricacion, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String especificaciones() {
        return "Notebook: " + marca + " " + modelo + "\nRAM: " + ram + "GB, Almacenamiento: " +
                almacenamiento + "GB, Procesador: " + procesador + "\nResolución pantalla: " +
                resolucionPantalla + ", Teclado: " + tipoTeclado + ", Batería: " + bateria + "mAh";
    }
}

package org.example;

import java.util.List;

public class Tablet extends DispositivoTecnologico {
    private String resolucionPantalla;
    private List<String> accesorios;

    public Tablet() {}

    public Tablet(String marca, int ram, int almacenamiento, String procesador, String modelo,
                  int anioFabricacion, double precio, int stock,
                  String resolucionPantalla, List<String> accesorios) {
        super(marca, ram, almacenamiento, procesador, modelo, anioFabricacion, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = accesorios;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public List<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<String> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String especificaciones() {
        return "Tablet: " + marca + " " + modelo + "\nRAM: " + ram + "GB, Almacenamiento: " +
                almacenamiento + "GB, Procesador: " + procesador + "\nResolución: " + resolucionPantalla +
                "\nAccesorios: " + String.join(", ", accesorios);
    }
}

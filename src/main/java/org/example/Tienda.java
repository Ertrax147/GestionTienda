package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tienda {
    private String direccion;
    private List<DispositivoTecnologico> catalogo;

    public Tienda(String direccion) {
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
    }

    public void agregarDispositivo(DispositivoTecnologico dispositivo) {
        catalogo.add(dispositivo);
    }

    public void modificarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public List<DispositivoTecnologico> buscarPorMarca(String marca) {
        return catalogo.stream()
                .filter(d -> d.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());
    }

    public List<DispositivoTecnologico> buscarPorModelo(String modelo) {
        return catalogo.stream()
                .filter(d -> d.getModelo().equalsIgnoreCase(modelo))
                .collect(Collectors.toList());
    }

    public List<DispositivoTecnologico> buscarPorTipo(String tipo) {
        return catalogo.stream()
                .filter(d -> d.getClass().getSimpleName().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<DispositivoTecnologico> getCatalogo() {
        return catalogo;
    }
}

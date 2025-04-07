package org.example;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<DispositivoTecnologico> dispositivos;
    private LocalDate fecha;

    public Venta() {}

    public Venta(Cliente cliente, List<DispositivoTecnologico> dispositivos) {
        this.cliente = cliente;
        this.dispositivos = dispositivos;
        this.fecha = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<DispositivoTecnologico> getDispositivos() {
        return dispositivos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Venta realizada el " + fecha + " a " + cliente.toString();
    }
}

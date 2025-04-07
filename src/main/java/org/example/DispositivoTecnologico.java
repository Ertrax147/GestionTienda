package org.example;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipo"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Notebook.class, name = "Notebook"),
        @JsonSubTypes.Type(value = Tablet.class, name = "Tablet"),
        @JsonSubTypes.Type(value = ComputadorEscritorio.class, name = "ComputadorEscritorio")
})

public abstract class DispositivoTecnologico {
    protected String marca;
    protected int ram;
    protected int almacenamiento;
    protected String procesador;
    protected String modelo;
    protected int anioFabricacion;
    protected double precio;
    protected int stock;

    public DispositivoTecnologico() {
    }

    public DispositivoTecnologico(String marca, int ram, int almacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int stock) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public abstract String especificaciones();

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anioFabricacion + ") - $" + precio;
    }
}

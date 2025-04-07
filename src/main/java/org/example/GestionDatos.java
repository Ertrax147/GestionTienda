package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GestionDatos {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void guardarClientes(List<Cliente> clientes) throws Exception {
        mapper.writeValue(new File("clientes.json"), clientes);
    }

    public static List<Cliente> cargarClientes() throws Exception {
        File archivo = new File("clientes.json");
        if (!archivo.exists()) return new ArrayList<>();
        CollectionType tipo = mapper.getTypeFactory().constructCollectionType(List.class, Cliente.class);
        return mapper.readValue(archivo, tipo);
    }

    public static void guardarDispositivos(List<DispositivoTecnologico> dispositivos) throws Exception {
        mapper.writeValue(new File("dispositivos.json"), dispositivos);
    }

    public static List<DispositivoTecnologico> cargarDispositivos() throws Exception {
        File archivo = new File("dispositivos.json");
        if (!archivo.exists()) return new ArrayList<>();
        CollectionType tipo = mapper.getTypeFactory().constructCollectionType(List.class, DispositivoTecnologico.class);
        mapper.registerSubtypes(ComputadorEscritorio.class, Notebook.class, Tablet.class);
        return mapper.readValue(archivo, tipo);
    }

    public static void guardarVentas(List<Venta> ventas) throws Exception {
        mapper.writeValue(new File("ventas.json"), ventas);
    }

    public static List<Venta> cargarVentas() throws Exception {
        File archivo = new File("ventas.json");
        if (!archivo.exists()) return new ArrayList<>();
        CollectionType tipo = mapper.getTypeFactory().constructCollectionType(List.class, Venta.class);
        return mapper.readValue(archivo, tipo);
    }
}

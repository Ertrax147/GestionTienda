package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class GestionDatos {
    private static final String ARCHIVO_CLIENTES = "clientes.json";
    private static final String ARCHIVO_DISPOSITIVOS = "dispositivos.json";
    private static final String ARCHIVO_VENTAS = "ventas.json";
    private static final String ARCHIVO_TIENDA = "tienda.json";

    private static ObjectMapper crearMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper;
    }

    // Clientes
    public static void guardarClientes(List<Cliente> clientes) {
        ObjectMapper mapper = crearMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARCHIVO_CLIENTES), clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Cliente> cargarClientes() {
        ObjectMapper mapper = crearMapper();
        try {
            File archivo = new File(ARCHIVO_CLIENTES);
            if (archivo.exists()) {
                return Arrays.asList(mapper.readValue(archivo, Cliente[].class));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    // Dispositivos
    public static void guardarDispositivos(List<DispositivoTecnologico> dispositivos) {
        ObjectMapper mapper = crearMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARCHIVO_DISPOSITIVOS), dispositivos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<DispositivoTecnologico> cargarDispositivos() {
        ObjectMapper mapper = crearMapper();
        try {
            File archivo = new File(ARCHIVO_DISPOSITIVOS);
            if (archivo.exists()) {
                return Arrays.asList(mapper.readValue(archivo, DispositivoTecnologico[].class));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    // Ventas
    public static void guardarVentas(List<Venta> ventas) {
        ObjectMapper mapper = crearMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARCHIVO_VENTAS), ventas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Venta> cargarVentas() {
        ObjectMapper mapper = crearMapper();
        try {
            File archivo = new File(ARCHIVO_VENTAS);
            if (archivo.exists()) {
                return Arrays.asList(mapper.readValue(archivo, Venta[].class));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    // Tienda
    public static void guardarTienda(Tienda tienda) {
        ObjectMapper mapper = crearMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARCHIVO_TIENDA), tienda);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Tienda cargarTienda() {
        ObjectMapper mapper = crearMapper();
        try {
            File archivo = new File(ARCHIVO_TIENDA);
            if (archivo.exists()) {
                return mapper.readValue(archivo, Tienda.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Tienda(); // Devuelve una nueva si no hay archivo
    }
}

package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Cliente> clientes = GestionDatos.cargarClientes();
            List<DispositivoTecnologico> dispositivos = GestionDatos.cargarDispositivos();
            List<Venta> ventas = GestionDatos.cargarVentas();

            // Creacion y registro de cliente...
            Cliente cliente = new Cliente("Carlos", "Pérez", "carlos@mail.com", "912345678", "Soltero", "Temuco");
            Cliente cliente2 = new Cliente("Carlos2","aa","aa","a","a","a");
            clientes.add(cliente);
            clientes.add(cliente2);
            GestionDatos.guardarClientes(clientes);

            // Crear dispositivos
            Pantalla pantalla = new Pantalla("LG", "UltraView", 2022);
            ComputadorEscritorio pc = new ComputadorEscritorio("HP", 16, 1000, "Intel i7", "EliteDesk", 2023, 950000, 5,
                    "NVIDIA GTX 1660", "650W", "ATX", pantalla);

            Notebook notebook = new Notebook("Dell", 8, 512, "Intel i5", "Inspiron", 2022, 600000, 3,
                    "1920x1080", "QWERTY", 4500);

            Tablet tablet = new Tablet("Samsung", 4, 64, "Exynos", "Tab A8", 2021, 300000, 4,
                    "1280x800", List.of("Funda", "Lápiz"));

            dispositivos.add(pc);
            dispositivos.add(notebook);
            dispositivos.add(tablet);
            GestionDatos.guardarDispositivos(dispositivos);

            // Crear tienda
            Tienda tienda = new Tienda("Calle Falsa 123");
            tienda.agregarDispositivo(pc);
            tienda.agregarDispositivo(notebook);
            tienda.agregarDispositivo(tablet);

            // Venta a cliente especifico
            List<DispositivoTecnologico> compra = new ArrayList<>();
            compra.add(notebook);
            notebook.reducirStock(1);
            Venta venta = new Venta(cliente, compra); //cliente seria "Carlos" el cliente que se crea
            ventas.add(venta);
            GestionDatos.guardarVentas(ventas);   //Se guarda venta
            GestionDatos.guardarDispositivos(dispositivos);  //Se actualiza con stock

            // Buscar por tipo
            System.out.println("Tablets disponibles:");
            tienda.buscarPorTipo("Tablet").forEach(d -> System.out.println(d.especificaciones()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

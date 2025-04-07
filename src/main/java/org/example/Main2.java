package org.example;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        // Cargar los datos de los clientes desde el archivo
        List<Cliente> clientes = GestionDatos.cargarClientes();
      //  List<DispositivoTecnologico> dispositivos = GestionDatos.cargarDispositivos();
        List<Venta> ventas = GestionDatos.cargarVentas();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes registrados:");
            for (Cliente cliente : clientes) {
                System.out.println("Nombre: " + cliente.getNombre() + " " + cliente.getApellido());
                System.out.println("Correo: " + cliente.getCorreo());
                System.out.println("Teléfono: " + cliente.getNumeroContacto());
                System.out.println("Estado Civil: " + cliente.getEstadoCivil());
                System.out.println("Ciudad: " + cliente.getCiudad());
                System.out.println("------------------------------");
            }
        }

//        if (dispositivos.isEmpty()) {
//            System.out.println("No hay dispositivos registrados.");
//        } else {
//            System.out.println("Lista de dispositivos registrados:");
//            for (DispositivoTecnologico dispositivo : dispositivos) {
//                System.out.println(dispositivo.especificaciones());
//                System.out.println("------------------------------");
//            }
//        }
//
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            System.out.println("Lista de ventas registradas:");
            for (Venta venta : ventas) {
                System.out.println(venta.toString());
                System.out.println("------------------------------");
            }
        }


    }
}

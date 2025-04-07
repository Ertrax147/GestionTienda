# Sistema de Gestión para Tienda de Dispositivos Tecnológicos

## Análisis de la Problemática

Las tiendas de tecnología necesitan llevar un registro organizado de sus **clientes**, **productos tecnológicos** (como computadores, notebooks y tablets), así como de sus **ventas**. La gestión manual de esta información puede derivar en pérdida de datos, errores en inventario y dificultades para realizar análisis o reportes.

Este sistema busca automatizar el proceso de venta y administración de una tienda de tecnología, permitiendo:

- Registrar diferentes tipos de dispositivos tecnológicos con sus atributos específicos.
- Asociar clientes a la tienda con sus datos personales.
- Realizar ventas asociando uno o varios dispositivos a un cliente.
- Controlar el stock automáticamente.
- Guardar y cargar los datos desde archivos `.json` para persistencia.
- Presentar una arquitectura clara usando principios de Programación Orientada a Objetos (POO).

---

## Principales Clases y Funcionalidades

### Clases

- **Tienda**
  - Contiene la dirección de la tienda.
  - Lista de clientes.
  - Lista del catálogo de dispositivos.
  - Permite registrar dispositivos y clientes.

- **Cliente**
  - Almacena la información personal del cliente (nombre, contacto, ciudad, etc.).

- **Dispositivo** *(Abstracta)*
  - Clase base para todos los dispositivos tecnológicos.
  - Contiene atributos comunes: marca, modelo, RAM, almacenamiento, procesador, año, precio, stock.
  - Método abstracto `especificaciones()`.

- **Notebook**, **ComputadorEscritorio**, **Tablet**
  - Heredan de `Dispositivo`.
  - Cada una agrega atributos específicos: tipo de teclado, accesorios, pantalla, etc.

- **Pantalla**
  - Clase auxiliar usada por `ComputadorEscritorio`.

- **Venta**
  - Representa una venta que contiene un cliente, una lista de dispositivos y la fecha.

- **GestorDatos**
  - Permite guardar y cargar datos en archivos `.json` usando Jackson

package org.iesalandalus.programacion.tallermecanico.vista;

import java.util.Map;
import java.util.TreeMap;

public enum Opcion {
    INSERTAR_CLIENTE (11, "Insertar cliente."),
    BUSCAR_CLIENTE(12, "Buscar cliente."),
    BORRAR_CLIENTE(13, "Borrar cliente."),
    LISTAR_CLIENTES(14, "Listar clientes."),
    MODIFICAR_CLIENTE(15, "Mostrar cliente."),
    INSERTAR_VEHICULO(21, "Insertar vehículo."),
    BUSCAR_VEHICULO(22, "Buscar vehículo."),
    BORRAR_VEHICULO(23, "Borrar vehículo."),
    LISTAR_VEHICULOS(24, "Listar vehículos."),
    INSERTAR_REVISION(31, "Insertar revisión."),
    BUSCAR_REVISION(32, "Buscar revisión."),
    BORRAR_REVISION(33, "Borrar revisión."),
    LISTAR_REVISIONES(34, "Listar revisiones."),
    LISTAR_REVISIONES_CLIENTE(35, "Listar revisiones de clientes."),
    LISTAR_REVISIONES_VEHICULO(36, "Listar revisiones de vehículos."),
    ANADIR_HORAS_REVISION(37, "Añadir las horas a la revisión."),
    ANADIR_PRECIO_MATERIAL_PREVISION(38, "Añadir el precio del material de la revisión."),
    CERRAR_REVISION(39, "Cerrar revisión."),
    SALIR(0, "Salir.");

    private int numeroOpcion;
    private String mensaje;
    private static Map<Integer, Opcion> opciones = new TreeMap<>();

    private Opcion(int numeroOpcion, String mensaje) {
        this.numeroOpcion = numeroOpcion;
        this.mensaje = mensaje;
    }

    public static boolean esValida(int numeroOpcion) {
        return opciones.containsKey(numeroOpcion);
    }

    public static Opcion get(int numeroOpcion) {
        if(!esValida(numeroOpcion)) {
            throw new IllegalArgumentException("El número de la opción no es correcto.");
        }
        return opciones.get(numeroOpcion);
    }

    @Override
    public String toString() {
        return String.format("%d, %s", numeroOpcion, mensaje);
    }
}

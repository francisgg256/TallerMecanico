package org.iesalandalus.programacion.tallermecanico.vista.eventos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public enum Evento {
    INSERTAR_CLIENTE (11, "Insertar cliente."),
    BUSCAR_CLIENTE(12, "Buscar cliente."),
    BORRAR_CLIENTE(13, "Borrar cliente."),
    LISTAR_CLIENTES(14, "Listar clientes."),
    MODIFICAR_CLIENTE(15, "Modificar cliente."),
    INSERTAR_VEHICULO(21, "Insertar vehículo."),
    BUSCAR_VEHICULO(22, "Buscar vehículo."),
    BORRAR_VEHICULO(23, "Borrar vehículo."),
    LISTAR_VEHICULOS(24, "Listar vehículos."),
    INSERTAR_REVISION(31, "Insertar revisión."),
    INSERTAR_MECANICO(32, "Insertar mecánico."),
    BUSCAR_TRABAJO(33, "Buscar revisión."),
    BORRAR_TRABAJO(34, "Borrar revisión."),
    LISTAR_TRABAJOS(35, "Listar revisiones."),
    LISTAR_TRABAJOS_CLIENTE(36, "Listar revisiones de clientes."),
    LISTAR_TRABAJOS_VEHICULO(37, "Listar revisiones de vehículos."),
    ANADIR_HORAS_TRABAJO(38, "Añadir las horas a la revisión."),
    ANADIR_PRECIO_MATERIAL_TRABAJO(39, "Añadir el precio del material de la revisión."),
    CERRAR_TRABAJO(40, "Cerrar revisión."),
    MOSTRAR_ESTADISTICAS_MENSUALES(50, "Mostrar estadísticas mensuales."),
    SALIR(0, "Salir.");

    private static final Map<Integer, Evento> opciones = new HashMap<>();
    private String mensaje;
    private int numeroOpcion;

    private Evento(int numeroOpcion, String mensaje) {
        this.mensaje = mensaje;
        this.numeroOpcion = numeroOpcion;
    }

    static {
        for (Evento evento : values()){
            opciones.put(evento.numeroOpcion, evento);
        }
    }

    public static boolean esValido(int numeroOpcion){
        return opciones.containsKey(numeroOpcion);
    }

    public static Evento get(int numeroOpcion){
        if (esValido(numeroOpcion)) {
            return opciones.get(numeroOpcion);
        } else throw new IllegalArgumentException("El número de opción no es valido.");
    }

    @Override
    public String toString() {
        return String.format("%s: %s",numeroOpcion, mensaje);
    }
}

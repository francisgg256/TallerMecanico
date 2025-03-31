package org.iesalandalus.programacion.tallermecanico.controlador;

import org.iesalandalus.programacion.tallermecanico.modelo.Modelo;
import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalandalus.programacion.tallermecanico.vista.texto.VistaTexto;

import java.util.Objects;

public class Controlador implements IControlador {

    private final Modelo modelo;
    private final VistaTexto vista;

    public Controlador(Modelo modelo, VistaTexto vista) {
        Objects.requireNonNull(modelo, "ERROR: El modelo no puede ser nulo.");
        Objects.requireNonNull(vista, "ERROR: La vista no puede ser nula.");
        this.modelo = modelo;
        this.vista = vista;
        this.vista.getGestorEventos().suscribir(this, Evento.values());
    }

    @Override
    public void comenzar() {
        modelo.comenzar();
        vista.comenzar();
    }

    @Override
    public void terminar() {
        modelo.terminar();
        vista.terminar();
    }

    @Override
    public void actualizar(Evento evento) {
        try {
            String resultado = "";
            switch (evento) {
                case INSERTAR_CLIENTE -> {modelo.insertar(vista.leerCliente()); resultado = "Cliente insertado correctamente.";}
                case INSERTAR_VEHICULO -> {modelo.insertar(vista.leerVehiculo()); resultado = "Vehículo insertado correctamente.";}
                case INSERTAR_REVISION -> {modelo.insertar(vista.leerRevision()); resultado = "Trabajo de revisión insertado correctamente.";}
                case INSERTAR_MECANICO -> {modelo.insertar(vista.leerMecanico()); resultado = "Trabajo de mecánico insertado correctamente.";}
                case BUSCAR_CLIENTE -> vista.mostrarCliente(modelo.buscar(vista.leerClienteDni()));
                case BUSCAR_VEHICULO -> vista.mostrarVehiculo(modelo.buscar(vista.leerVehiculoMatricula()));
                case BUSCAR_TRABAJO -> vista.mostrarTrabajo(modelo.buscar(vista.leerRevision()));
                case MODIFICAR_CLIENTE -> {modelo.modificar(vista.leerClienteDni(), vista.leerNuevoNombre(), vista.leerNuevoTelefono()); resultado = "El cliente se ha modificado correctamente.";}
                case ANADIR_HORAS_TRABAJO -> {modelo.anadirHoras(vista.leerTrabajoVehiculo(), vista.leerHoras()); resultado = "Horas añadidas correctamente.";}
                case ANADIR_PRECIO_MATERIAL_TRABAJO -> {modelo.anadirPrecioMaterial(vista.leerTrabajoVehiculo(), vista.leerPrecioMaterial()); resultado = "Precio del material añadido correctamente.";}
                case CERRAR_TRABAJO -> {modelo.cerrar(vista.leerTrabajoVehiculo(), vista.leerFechaCierre()); resultado = "Trabajo cerrado correctamente.";}
                case BORRAR_CLIENTE -> {modelo.borrar(vista.leerClienteDni()); resultado = "Cliente eliminado correctamente.";}
                case BORRAR_VEHICULO -> {modelo.borrar(vista.leerVehiculoMatricula()); resultado = "Vehículo eliminado correctamente.";}
                case BORRAR_TRABAJO -> {modelo.borrar(vista.leerRevision()); resultado = "Trabajo eliminado correctamente.";}
                case LISTAR_CLIENTES -> vista.mostrarClientes(modelo.getClientes());
                case LISTAR_VEHICULOS -> vista.mostrarVehiculos(modelo.getVehiculos());
                case LISTAR_TRABAJOS -> vista.mostrarTrabajos(modelo.getTrabajos());
                case LISTAR_TRABAJOS_CLIENTE -> vista.mostrarTrabajosCliente(modelo.getTrabajos(vista.leerClienteDni()));
            }
        } catch (Exception e) {
            vista.notificarResultado(evento, e.getMessage(), false);
        }
    }
}

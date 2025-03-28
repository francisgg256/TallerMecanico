package org.iesalandalus.programacion.tallermecanico.vista.texto;

import org.iesalandalus.programacion.tallermecanico.controlador.Controlador;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Trabajo;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.GestorEventos;

import java.util.List;
import java.util.Objects;

public class VistaTexto {

    private Controlador controlador;
    private GestorEventos gestorEventos;

    public void setControlador(Controlador controlador) {
        Objects.requireNonNull(controlador, "ERROR: El controlador no puede ser nulo.");
        this.controlador = controlador;
    }

    public void comenzar() {
        Evento evento;
        do {
            Consola.mostrarMenu();
            evento = Consola.elegirOpcion();
            ejecutar(evento);
        } while (evento != Evento.SALIR);
        controlador.terminar();
    }

    public void terminar() {
        System.out.println("Hasta luego.");
    }

    private void ejecutar(Evento evento) {
        try {
            switch (evento) {
                case INSERTAR_CLIENTE -> insertarCliente();
                case INSERTAR_VEHICULO -> insertarVehiculo();
                case INSERTAR_TRABAJO -> insertarTrabajo();
                case BUSCAR_CLIENTE -> buscarCliente();
                case BUSCAR_VEHICULO -> buscarVehiculo();
                case BUSCAR_TRABAJO -> buscarTrabajo();
                case BORRAR_CLIENTE -> borrarCliente();
                case BORRAR_VEHICULO -> borrarVehiculo();
                case BORRAR_TRABAJO -> borrarTrabajo();
                case LISTAR_CLIENTES -> listarClientes();
                case LISTAR_VEHICULOS -> listarVehiculos();
                case LISTAR_TRABAJOS -> listarTrabajos();
                case LISTAR_TRABAJOS_CLIENTE -> listarTrabajosCliente();
                case LISTAR_TRABAJOS_VEHICULO -> listarTrabajosVehiculo();
                case MODIFICAR_CLIENTE -> modificarCliente();
                case ANADIR_HORAS_TRABAJO -> anadirHoras();
                case ANADIR_PRECIO_MATERIAL_TRABAJO -> anadirPrecioMaterial();
                case CERRAR_TRABAJO -> cerrarTrabajo();
                case SALIR -> salir();
            }
        } catch (Exception e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }
    }

    private void insertarCliente() {
        Consola.mostrarCabecera("Insertar Cliente");
        controlador.insertar(Consola.leerCliente());
        System.out.println("Cliente insertado correctamente.");
    }

    private void insertarVehiculo() {
        Consola.mostrarCabecera("Insertar Vehículo");
        controlador.insertar(Consola.leerVehiculo());
        System.out.println("Vehículo insertado correctamente.");
    }

    private void insertarTrabajo() {
        Consola.mostrarCabecera("Insertar Trabajo");
        controlador.insertar(Consola.leerTrabajo());
        System.out.println("Revisión insertada correctamente.");
    }

    private void buscarCliente() {
        Consola.mostrarCabecera("Buscar Cliente");
        Cliente cliente = controlador.buscar(Consola.leerClienteDni());
        System.out.println(cliente != null) ? ;
    }

    private void buscarVehiculo() {

    }

    private void buscarTrabajo() {

    }

    private void modificarCliente() {

    }

    private void anadirHoras() {

    }

    private void anadirPrecioMaterial() {

    }

    private void cerrarTrabajo() {

    }

    private void borrarCliente() {

    }

    private void borrarVehiculo() {

    }

    private void borrarTrabajo() {

    }

    private void listarClientes() {
        Consola.mostrarCabecera("Listar Clientes.");
        List<Cliente> clientes = controlador.getClientes();
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }else {
            System.out.println("No hay clientes que mostrar.");
        }
    }

    private void listarVehiculos() {
        Consola.mostrarCabecera("Listar Vehículos.");
        List<Vehiculo> vehiculos =  controlador.getVehiculos();
        if (!vehiculos.isEmpty()) {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        }else {
            System.out.println("No hay vehículos que mostrar.");
        }
    }

    private void listarTrabajos() {
        Consola.mostrarCabecera("Listar Revisiones.");
        List<Trabajo> trabajos = controlador.getTrabajo();
        if (!trabajos.isEmpty()) {
            for (Trabajo trabajo : trabajos) {
                System.out.println(trabajo);
            }
        }else {
            System.out.println("No hay revisiones que mostrar.");
        }
    }

    private void listarTrabajosCliente() {
        Consola.mostrarCabecera("Listar Revisiones por Cliente.");
        List<Trabajo> trabajosCliente = controlador.getTrabajos();
        if (!trabajosCliente.isEmpty()) {
            for (Trabajo trabajo : trabajosCliente) {
                System.out.println(trabajo);
            }
        }else {
            System.out.println("No hay revisiones programadas para este cliente.");
        }
    }

    private void listarTrabajosVehiculo() {
        Consola.mostrarCabecera("Listar Revisiones por Vehículo.");
        List<Trabajo> trabajosVehiculo = controlador.getTrabajos();
        if (!trabajosVehiculo.isEmpty()) {
            for (Trabajo trabajo : trabajosVehiculo) {
                System.out.println(trabajo);
            }
        }else {
            System.out.println("No hay revisiones programadas para este vehículo.");
        }
    }

    private void salir() {

    }
}

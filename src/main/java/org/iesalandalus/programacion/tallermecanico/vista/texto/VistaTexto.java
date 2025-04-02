package org.iesalandalus.programacion.tallermecanico.vista.texto;

import org.iesalandalus.programacion.tallermecanico.controlador.Controlador;
import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.*;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.GestorEventos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class VistaTexto {
    private GestorEventos gestorEventos;

    public VistaTexto() {
        this.gestorEventos = new GestorEventos(Evento.values());
    }
    public GestorEventos getGestorEventos() {
        return gestorEventos;
    }

    public void comenzar() throws TallerMecanicoExcepcion {
        Evento evento;
        do {
            Consola.mostrarMenu();
            evento = Consola.elegirOpcion();
            ejecutar(evento);
        } while (evento != Evento.SALIR);
    }

    public void terminar() {
        System.out.println("Hasta luego.");
    }

    private void ejecutar(Evento evento) {
        Consola.mostrarCabecera(evento.toString());
        gestorEventos.notificar(evento);
    }

    public static Cliente leerCliente() {
        String nombre = Consola.leerCadena("Introduce el nombre: ");
        String dni = Consola.leerCadena("Introduce el DNI: ");
        String telefono = Consola.leerCadena("Introduce el teléfono: ");
        return new Cliente(nombre, dni, telefono);
    }

    public static Cliente leerClienteDni() {
        return Cliente.get(Consola.leerCadena("Introduce el DNI: "));
    }

    public static String leerNuevoNombre() {
        return Consola.leerCadena("Introduce el nuevo nombre: ");
    }

    public static String leerNuevoTelefono() {
        return Consola.leerCadena("Introduce el nuevo teléfono: ");
    }

    public static Vehiculo leerVehiculo() {
        String marca = Consola.leerCadena("Introduce la marca: ");
        String modelo = Consola.leerCadena("Introduce el modelo: ");
        String matricula = Consola.leerCadena("Introduce la matrícula: ");
        return new Vehiculo(marca, modelo, matricula);
    }

    public static Vehiculo leerVehiculoMatricula() {
        return Vehiculo.get(Consola.leerCadena("Introduce la matrícula: "));
    }

    public Trabajo leerRevision() {
        Cliente cliente = leerClienteDni();
        Vehiculo vehiculo = leerVehiculoMatricula();
        LocalDate fechaInicio = Consola.leerFecha("Introduce la fecha de inicio: ");
        return new Revision(cliente, vehiculo, fechaInicio);
    }

    public Trabajo leerMecanico() {
        Cliente cliente = leerClienteDni();
        Vehiculo vehiculo = leerVehiculoMatricula();
        LocalDate fechaInicio = Consola.leerFecha("Introduce la fecha de inicio: ");
        return new Mecanico(cliente, vehiculo, fechaInicio);
    }

    public static Trabajo leerTrabajoVehiculo() {
        return Trabajo.get(leerVehiculoMatricula());
    }

    public static int leerHoras() {
        return Consola.leerEntero("Introduce las horas a añadir: ");
    }

    public static float leerPrecioMaterial() {
        return Consola.leerReal("Introduce el precio del material a añadir: ");
    }

    public static LocalDate leerFechaCierre() {
        return Consola.leerFecha("Introduce la fecha de cierre: ");
    }

    public void notificarResultado(Evento evento, String texto, boolean exito) {
        if (exito) {
            System.out.println(texto);
        } else {
            System.out.printf("ERROR: %s%n", texto);
        }
    }

    public void mostrarCliente(Cliente cliente) {
        System.out.println((cliente != null) ? cliente : "No existe ningún cliente con dicho DNI.");
    }

    public void mostrarVehiculo(Vehiculo vehiculo) {
        System.out.println((vehiculo != null) ? vehiculo : "No existe ningún vehículo con dicha matrícula.");
    }

    public void mostrarTrabajo(Trabajo trabajo) {
        System.out.println((trabajo != null) ? trabajo : "No existe ningún trabajo para ese cliente, vehículo y fecha.");
    }

    public void mostrarClientes(List<Cliente> clientes) {
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("No hay clientes que mostrar");
        }
    }

    public void mostrarVehiculos(List<Vehiculo> vehiculos) {
        if (!vehiculos.isEmpty()) {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        } else {
            System.out.println("No hay vehículos que mostrar");
        }
    }

    public void mostrarTrabajos(List<Trabajo> trabajos) {
        if (!trabajos.isEmpty()) {
            for (Trabajo trabajo : trabajos) {
                System.out.println(trabajo);
            }
        } else {
            System.out.println("No hay trabajos que mostrar");
        }
    }
}
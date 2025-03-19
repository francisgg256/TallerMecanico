package org.iesalandalus.programacion.tallermecanico.controlador;

import org.iesalandalus.programacion.tallermecanico.modelo.Modelo;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Revision;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.tallermecanico.vista.Vista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Controlador {

    private final Modelo modelo;
    private final Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        Objects.requireNonNull(modelo, "ERROR: El modelo no puede ser nulo.");
        Objects.requireNonNull(vista, "ERROR: La vista no puede ser nula.");
        this.modelo = modelo;
        this.vista = vista;
    }

    public void comenzar() {

    }

    public void terminar() {

    }

    public void insertar(Cliente cliente) {

    }

    public void insertar(Vehiculo vehiculo) {

    }

    public void insertar(Revision revision) {

    }

    public Cliente buscar(Cliente cliente) {

    }

    public Vehiculo buscar(Vehiculo vehiculo) {

    }

    public Revision buscar(Revision revision) {

    }

    public Cliente modificar(Cliente cliente, String nombre, String telefono) {

    }

    public Revision anadirHoras(Revision revision, int horas) {

    }

    public Revision anadirPrecioMaterial(Revision revision, float precioMaterial) {

    }

    public Revision cerrar(Revision revision, LocalDate fechaFin) {

    }

    public void borrar(Cliente cliente) {

    }

    public void borrar(Vehiculo vehiculo) {

    }

    public void borrar(Revision revision) {

    }

    public List<Cliente> getClientes() {

    }

    public List<Vehiculo> getVehiculos() {

    }

    public List<Revision> getRevisiones() {

    }

    public List<Revision> getRevisiones(Cliente cliente) {

    }

    public List<Revision> getRevisiones(Vehiculo vehiculo) {

    }
}

package org.iesalandalus.programacion.tallermecanico.vista.ventanas;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.*;
import org.iesalandalus.programacion.tallermecanico.vista.Vista;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.GestorEventos;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Dialogos;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class VistaGrafica implements Vista {
    private static VistaGrafica instancia = null;

    private VistaGrafica() {}

    public static VistaGrafica getInstancia(){
        if (instancia == null){
            instancia = new VistaGrafica();
        }
        return instancia;
    }

    @Override
    public GestorEventos getGestorEventos() {
        return new GestorEventos(Evento.values());
    }

    @Override
    public void comenzar() {
        LanzadoraVistaGrafica.comenzar();
    }

    @Override
    public void terminar() {

    }

    @Override
    public Cliente leerCliente() {
        return null;
    }

    @Override
    public Cliente leerClienteDni() {
        return null;
    }

    @Override
    public String leerNuevoNombre() {
        return "";
    }

    @Override
    public String leerNuevoTelefono() {
        return "";
    }

    @Override
    public Vehiculo leerVehiculo() {
        return null;
    }

    @Override
    public Vehiculo leerVehiculoMatricula() {
        return null;
    }

    @Override
    public Trabajo leerRevision() {
        return null;
    }

    @Override
    public Trabajo leerMecanico() {
        return null;
    }

    @Override
    public Trabajo leerTrabajoVehiculo() {
        return null;
    }

    @Override
    public int leerHoras() {
        return 0;
    }

    @Override
    public float leerPrecioMaterial() {
        return 0;
    }

    @Override
    public LocalDate leerFechaCierre() {
        return null;
    }

    @Override
    public LocalDate leerMes() {
        return null;
    }

    @Override
    public void notificarResultado(Evento evento, String texto, boolean exito) {
        if (exito) {
            Dialogos.mostrarDialogoInformacion();
        }
    }

    @Override
    public void mostrarCliente(Cliente cliente) {

    }

    @Override
    public void mostrarVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public void mostrarTrabajo(Trabajo trabajo) {

    }

    @Override
    public void mostrarClientes(List<Cliente> clientes) {

    }

    @Override
    public void mostrarVehiculos(List<Vehiculo> vehiculos) {

    }

    @Override
    public void mostrarTrabajos(List<Trabajo> trabajoes) {

    }

    @Override
    public void mostrarEstadisticas(Map<TipoTrabajo, Integer> estadisticas) {

    }
}

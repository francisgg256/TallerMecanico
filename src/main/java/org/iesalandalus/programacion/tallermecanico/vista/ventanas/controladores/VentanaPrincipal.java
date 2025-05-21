package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.WindowEvent;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.Evento;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.VistaGrafica;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controladores;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Dialogos;

public class VentanaPrincipal extends Controlador {

    @FXML
    private Button btBuscarCliente;

    @FXML
    private Button btBuscarTrabajo;

    @FXML
    private Button btBuscarVehiculo;

    @FXML
    private Button btInsertarCliente;

    @FXML
    private Button btInsertarTrabajo;

    @FXML
    private Button btBorrarCliente;

    @FXML
    private Button btBorrarTrabajo;

    @FXML
    private Button btBorrarVehiculo;

    @FXML
    void insertarCliente(ActionEvent event) {
        InsertarCliente insertarCliente = (InsertarCliente) Controladores.get("/vistas/InsertarCliente.fxml","Insertar Cliente", getEscenario());
        insertarCliente.getEscenario().show();
        insertarCliente.centrar();
    }

    @FXML
    void insertarVehiculo(ActionEvent event) {
        InsertarVehiculo insertarVehiculo = (InsertarVehiculo) Controladores.get("/vistas/InsertarVehiculo.fxml", "Insertar Vehículo", getEscenario());
        insertarVehiculo.getEscenario().show();
        insertarVehiculo.centrar();
    }

    @FXML
    void insertarTrabajo(ActionEvent event) {
        InsertarTrabajo insertarTrabajo = (InsertarTrabajo) Controladores.get("/vistas/InsertarTrabajo.fxml", "Insertar Trabajo", getEscenario());
        insertarTrabajo.getEscenario().show();
        insertarTrabajo.centrar();
    }

    @FXML
    void buscarCliente(ActionEvent event) {
        BuscarCliente buscarCliente = (BuscarCliente) Controladores.get("/vistas/BuscarCliente.fxml", "Buscar Cliente", getEscenario());
        buscarCliente.getEscenario().show();
        buscarCliente.centrar();
    }

    @FXML
    void buscarVehiculo(ActionEvent event) {
        BuscarVehiculo buscarVehiculo = (BuscarVehiculo) Controladores.get("/vistas/BuscarVehiculo.fxml", "Buscar Vehículo", getEscenario());
        buscarVehiculo.getEscenario().show();
        buscarVehiculo.centrar();
    }

    @FXML
    void buscarTrabajo(ActionEvent event) {
        BuscarTrabajo buscarTrabajo = (BuscarTrabajo) Controladores.get("/vistas/BuscarTrabajo.fxml", "Buscar Trabajo", getEscenario());
        buscarTrabajo.getEscenario().show();
        buscarTrabajo.centrar();
    }

    @FXML
    void borrarCliente(ActionEvent event) {
        BorrarCliente borrarCliente = (BorrarCliente) Controladores.get("/vistas/BorrarCliente.fxml", "Borrar Cliente", getEscenario());
        borrarCliente.getEscenario().show();
        borrarCliente.centrar();
    }

    @FXML
    void borrarVehiculo(ActionEvent event) {
        BorrarVehiculo borrarVehiculo = (BorrarVehiculo) Controladores.get("/vistas/BorrarVehiculo.fxml", "Borrar Vehículo", getEscenario());
        borrarVehiculo.getEscenario().show();
        borrarVehiculo.centrar();
    }

    @FXML
    void borrarTrabajo(ActionEvent event) {
        BorrarTrabajo borrarTrabajo = (BorrarTrabajo) Controladores.get("/vistas/BorrarTrabajo.fxml", "Borrar Trabajo", getEscenario());
        borrarTrabajo.getEscenario().show();
        borrarTrabajo.centrar();
    }

    @FXML
    void salir(ActionEvent event) {
        if (Dialogos.mostrarDialogoConfirmacion("Salir", "¿Estás seguro de que quieres salir de la aplicación?", getEscenario())) {
            getEscenario().close();
            VistaGrafica.getInstancia().getGestorEventos().notificar(Evento.SALIR);
        }
    }

    void salir(WindowEvent event) {
        if (Dialogos.mostrarDialogoConfirmacion("Salir","¿Estás seguro de que quieres salir de la aplicación?", getEscenario())) {
            getEscenario().close();
            VistaGrafica.getInstancia().getGestorEventos().notificar(Evento.SALIR);
        } else {
            event.consume();
        }
    }

    @FXML
    void initialize() {

    }


}


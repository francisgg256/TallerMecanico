package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controladores;

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
    private Button btListarCliente;

    @FXML
    private Button btListarTrabajo;

    @FXML
    private Button btListarVehiculo;

    @FXML
    void insertarCliente(ActionEvent event) {
        InsertarCliente insertarCliente = (InsertarCliente) Controladores.get("/vistas/InsertarCliente.fxml","Insertar Cliente", getEscenario());
        insertarCliente.getEscenario().show();
        insertarCliente.centrar();
    }

    @FXML
    void insertarVehiculo(ActionEvent event) {

    }
    @FXML
    void initialize() {

    }
}


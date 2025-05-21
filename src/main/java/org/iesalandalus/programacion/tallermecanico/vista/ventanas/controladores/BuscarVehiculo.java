package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class BuscarVehiculo extends Controlador{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btBuscar;

    @FXML
    private Button btCancelar;

    @FXML
    private ListView<?> lvListaBuscarVehiculos;

    @FXML
    private TextField tfBuscarMatricula;

    @FXML
    void buscar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btBuscar != null : "fx:id=\"btBuscar\" was not injected: check your FXML file 'BuscarVehiculo.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'BuscarVehiculo.fxml'.";
        assert lvListaBuscarVehiculos != null : "fx:id=\"lvListaBuscarVehiculos\" was not injected: check your FXML file 'BuscarVehiculo.fxml'.";
        assert tfBuscarMatricula != null : "fx:id=\"tfBuscarMatricula\" was not injected: check your FXML file 'BuscarVehiculo.fxml'.";

    }

}


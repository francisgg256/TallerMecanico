package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class BuscarTrabajo extends Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btBuscar;

    @FXML
    private Button btCancelar;

    @FXML
    private DatePicker dpFechaInicio;

    @FXML
    private ListView<?> lvListaBuscarTrabajos;

    @FXML
    private TextField tfDni;

    @FXML
    private TextField tfMatricula;

    @FXML
    void buscar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btBuscar != null : "fx:id=\"btBuscar\" was not injected: check your FXML file 'BuscarTrabajo.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'BuscarTrabajo.fxml'.";
        assert dpFechaInicio != null : "fx:id=\"dpFechaInicio\" was not injected: check your FXML file 'BuscarTrabajo.fxml'.";
        assert lvListaBuscarTrabajos != null : "fx:id=\"lvListaBuscarTrabajos\" was not injected: check your FXML file 'BuscarTrabajo.fxml'.";
        assert tfDni != null : "fx:id=\"tfDni\" was not injected: check your FXML file 'BuscarTrabajo.fxml'.";
        assert tfMatricula != null : "fx:id=\"tfMatricula\" was not injected: check your FXML file 'BuscarTrabajo.fxml'.";

    }

}

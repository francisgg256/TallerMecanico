package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class InsertarTrabajo extends Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btAceptar;

    @FXML
    private Button btCancelar;

    @FXML
    private DatePicker dpFechaInicio;

    @FXML
    private TextField tfDni;

    @FXML
    private TextField tfMatrícula;

    @FXML
    void aceptar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btAceptar != null : "fx:id=\"btAceptar\" was not injected: check your FXML file 'InsertarTrabajo.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'InsertarTrabajo.fxml'.";
        assert dpFechaInicio != null : "fx:id=\"dpFechaInicio\" was not injected: check your FXML file 'InsertarTrabajo.fxml'.";
        assert tfDni != null : "fx:id=\"tfDni\" was not injected: check your FXML file 'InsertarTrabajo.fxml'.";
        assert tfMatrícula != null : "fx:id=\"tfMatrícula\" was not injected: check your FXML file 'InsertarTrabajo.fxml'.";

    }

}



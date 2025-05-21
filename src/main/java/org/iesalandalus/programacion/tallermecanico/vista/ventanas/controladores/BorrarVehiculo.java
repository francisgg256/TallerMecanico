package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class BorrarVehiculo extends Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btAceptar;

    @FXML
    private Button btCancelar;

    @FXML
    private TextField tfMatriculaBorrarVehiculo;

    @FXML
    void aceptar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btAceptar != null : "fx:id=\"btAceptar\" was not injected: check your FXML file 'BorrarVehiculo.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'BorrarVehiculo.fxml'.";
        assert tfMatriculaBorrarVehiculo != null : "fx:id=\"tfMatriculaBorrarVehiculo\" was not injected: check your FXML file 'BorrarVehiculo.fxml'.";

    }

}


package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class InsertarVehiculo extends Controlador {

    @FXML
    private Button btAceptar;

    @FXML
    private Button btCancelar;

    @FXML
    private TextField tfMarca;

    @FXML
    private TextField tfMatricula;

    @FXML
    private TextField tfModelo;

    @FXML
    void aceptar(ActionEvent event) {
        new Vehiculo(tfMarca.getText(), tfModelo.getText(), tfMatricula.getText());
    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btAceptar != null : "fx:id=\"btAceptar\" was not injected: check your FXML file 'InsertarVehiculo.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'InsertarVehiculo.fxml'.";
        assert tfMarca != null : "fx:id=\"tfMarca\" was not injected: check your FXML file 'InsertarVehiculo.fxml'.";
        assert tfMatricula != null : "fx:id=\"tfMatricula\" was not injected: check your FXML file 'InsertarVehiculo.fxml'.";
        assert tfModelo != null : "fx:id=\"tfModelo\" was not injected: check your FXML file 'InsertarVehiculo.fxml'.";

    }

}


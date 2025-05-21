package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class InsertarCliente extends Controlador {

    @FXML
    private Button btAceptar;

    @FXML
    private Button btCancelar;

    @FXML
    private TextField tfDni;

    @FXML
    private TextField tfNombre;

    @FXML
    private TextField tfTelefono;

    @FXML
    void aceptar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btAceptar != null : "fx:id=\"btAceptar\" was not injected: check your FXML file 'InsertarCliente.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'InsertarCliente.fxml'.";
        assert tfDni != null : "fx:id=\"tfDni\" was not injected: check your FXML file 'InsertarCliente.fxml'.";
        assert tfNombre != null : "fx:id=\"tfNombre\" was not injected: check your FXML file 'InsertarCliente.fxml'.";
        assert tfTelefono != null : "fx:id=\"tfTelefono\" was not injected: check your FXML file 'InsertarCliente.fxml'.";

    }

}


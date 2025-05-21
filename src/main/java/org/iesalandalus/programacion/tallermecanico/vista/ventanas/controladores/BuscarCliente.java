package org.iesalandalus.programacion.tallermecanico.vista.ventanas.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.utilidades.Controlador;

public class BuscarCliente extends Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btBuscar;

    @FXML
    private Button btCancelar;

    @FXML
    private ListView<?> lvListaBuscarClientes;

    @FXML
    private TextField tfBuscarDni;

    @FXML
    void buscar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btBuscar != null : "fx:id=\"btBuscar\" was not injected: check your FXML file 'BuscarCliente.fxml'.";
        assert btCancelar != null : "fx:id=\"btCancelar\" was not injected: check your FXML file 'BuscarCliente.fxml'.";
        assert lvListaBuscarClientes != null : "fx:id=\"lvListaBuscarClientes\" was not injected: check your FXML file 'BuscarCliente.fxml'.";
        assert tfBuscarDni != null : "fx:id=\"tfBuscarDni\" was not injected: check your FXML file 'BuscarCliente.fxml'.";

    }

}

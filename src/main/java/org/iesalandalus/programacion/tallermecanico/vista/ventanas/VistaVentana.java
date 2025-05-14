package org.iesalandalus.programacion.tallermecanico.vista.ventanas;

import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros.Vehiculos;
import org.iesalandalus.programacion.tallermecanico.vista.Vista;

public class VistaVentana implements Vista {
    private static VistaVentana instancia = null;

    static VistaVentana getInstancia(){
        if (instancia == null){
            instancia = new VistaVentana();
        }
        return instancia;
    }
}

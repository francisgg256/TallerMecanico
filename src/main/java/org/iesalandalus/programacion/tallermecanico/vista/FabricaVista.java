package org.iesalandalus.programacion.tallermecanico.vista;

import org.iesalandalus.programacion.tallermecanico.vista.texto.VistaTexto;
import org.iesalandalus.programacion.tallermecanico.vista.ventanas.VistaGrafica;

public enum FabricaVista {

    TEXTO {
        @Override
        public Vista crear() {
            return new VistaTexto();
        }
    },

    VENTANA {
        @Override
        public Vista crear() {
            return VistaGrafica.getInstancia();
        }
    };

    public abstract Vista crear();
}
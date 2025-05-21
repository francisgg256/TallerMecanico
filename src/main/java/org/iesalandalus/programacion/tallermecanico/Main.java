package org.iesalandalus.programacion.tallermecanico;

import org.iesalandalus.programacion.tallermecanico.controlador.Controlador;
import org.iesalandalus.programacion.tallermecanico.controlador.IControlador;
import org.iesalandalus.programacion.tallermecanico.modelo.FabricaModelo;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.FabricaFuenteDatos;
import org.iesalandalus.programacion.tallermecanico.vista.FabricaVista;

public class Main {
    public static void main(String[] args) {
        IControlador controlador = new Controlador(FabricaModelo.CASCADA, FabricaFuenteDatos.FICHEROS, FabricaVista.VENTANA);
        controlador.comenzar();

    }

    private static FabricaVista procesarArgumentosVista(String[] args) {
        FabricaVista fabricaVista = FabricaVista.VENTANA;
        for (String argumento : args) {
            if (argumento.equalsIgnoreCase("-vventana")) {
                fabricaVista = FabricaVista.VENTANA;
            } else if (argumento.equalsIgnoreCase("-vtexto")) {
                fabricaVista = FabricaVista.TEXTO;
            }
        }
        return fabricaVista;
    }
}
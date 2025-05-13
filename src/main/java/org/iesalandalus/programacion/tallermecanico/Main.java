package org.iesalandalus.programacion.tallermecanico;

import org.iesalandalus.programacion.tallermecanico.controlador.Controlador;
import org.iesalandalus.programacion.tallermecanico.modelo.FabricaModelo;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.FabricaFuenteDatos;
import org.iesalandalus.programacion.tallermecanico.vista.FabricaVista;


public class Main {
    public static void main(String[] args){
        FabricaModelo fabricaModelo = FabricaModelo.CASCADA;
        FabricaVista fabricaVista = FabricaVista.TEXTO;
        FabricaFuenteDatos fabricaFuenteDatos = FabricaFuenteDatos.MEMORIA;
        Controlador controlador = new Controlador(fabricaModelo,fabricaFuenteDatos,fabricaVista);
        controlador.comenzar();
    }
}
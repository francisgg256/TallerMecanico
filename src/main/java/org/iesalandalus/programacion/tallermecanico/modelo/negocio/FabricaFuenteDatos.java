package org.iesalandalus.programacion.tallermecanico.modelo.negocio;

import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros.FuenteDatosFicheros;

public enum FabricaFuenteDatos {
    MEMORIA {
        @Override
        public IFuenteDatos crear() {
            return new FuenteDatosFicheros();
        }
    };
    public abstract IFuenteDatos crear();

}
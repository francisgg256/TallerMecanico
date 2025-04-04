package org.iesalandalus.programacion.tallermecanico.modelo.negocio;

import org.iesalandalus.programacion.tallermecanico.modelo.negocio.memoria.FuenteDatosMemoria;

public enum FabricaFuenteDatos {
    FICHEROS() {
        @Override
        public IFuenteDatos crear() {
            return new FuenteDatosMemoria();
        }
    };

    public abstract IFuenteDatos crear();
}

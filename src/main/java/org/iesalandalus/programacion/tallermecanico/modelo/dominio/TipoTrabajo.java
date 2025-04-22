package org.iesalandalus.programacion.tallermecanico.modelo.dominio;

import java.util.Objects;

public enum TipoTrabajo {
    MECANICO("Mecanico"),
    REVISION("Revision");

    private String nombre;

    private TipoTrabajo(String nombre) {
        this.nombre = nombre;
    }

    public static TipoTrabajo get(Trabajo trabajo) {
        Objects.requireNonNull(trabajo, "El trabajo no puede ser nulo.");
        TipoTrabajo tipoTrabajo = null;
        if (trabajo instanceof Revision) {
            tipoTrabajo = REVISION;
        } else if (trabajo instanceof Mecanico) {
            tipoTrabajo = MECANICO;
        }
        return tipoTrabajo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

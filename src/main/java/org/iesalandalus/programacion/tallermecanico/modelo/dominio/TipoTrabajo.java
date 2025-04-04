package org.iesalandalus.programacion.tallermecanico.modelo.dominio;

public enum TipoTrabajo {
    MECANICO("Mecanico"),
    REVISION("Revision");

    private String nombre;

    private TipoTrabajo(String nombre) {
        this.nombre = nombre;
    }

    public static TipoTrabajo get(Trabajo trabajo) {
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
        return String.format("[nombre=%s]", nombre);
    }
}

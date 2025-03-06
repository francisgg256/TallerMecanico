package org.iesalandalus.programacion.tallermecanico.modelo.negocio;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehiculos {
    Vehiculo coleccionVehiculos;

    List<Vehiculo>vehiculos;

    public Vehiculos() {
        vehiculos = new ArrayList<>();
    }

    public List<Vehiculo> get() {
        List<Vehiculo> nuevoVehiculo;
        nuevoVehiculo = vehiculos;
        return nuevoVehiculo;
    }

    public void insertar(Vehiculo vehiculo) throws TallerMecanicoExcepcion{
        Objects.requireNonNull(vehiculo, "No se puede insertar un vehículo nulo.");
        if (!vehiculos.contains(vehiculo)) {
            vehiculos.add(vehiculo);
        } else {
            throw new TallerMecanicoExcepcion("Ya existe un vehículo con esa matrícula.");
        }
    }

    public Vehiculo buscar(Vehiculo vehiculo) {
        Objects.requireNonNull(vehiculo, "No se puede buscar un vehículo nulo.");
        if (vehiculos.contains(vehiculo)) {
            int indexVehiculo = vehiculos.indexOf(vehiculo);
            return vehiculos.get(indexVehiculo);
        } else {
            return null;
        }
    }

    public void borrar(Vehiculo vehiculo) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(vehiculo,"No se puede borrar un vehículo nulo.");
        if (vehiculos.contains(vehiculo)) {
            vehiculos.remove(vehiculo);
        } else {
            throw new TallerMecanicoExcepcion("No existe ningún vehículo con esa matrícula.");
        }
    }
}

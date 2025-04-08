package org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.*;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.ITrabajos;

import javax.swing.text.Document;
import javax.swing.text.Element;
import java.time.LocalDate;
import java.util.*;

public class Trabajos implements ITrabajos {
//    private static final String FICHERO_TRABAJOS = ;
//    private static final DateTimeFormatter FORMATO_FECHA = ;
//    private static final String RAIZ = ;
//    private static final String TRABAJO = ;
//    private static final String CLIENTE = ;
//    private static final String VEHICULO = ;
//    private static final String FECHA_INICIO = ;
//    private static final String FECHA_FIN = ;
//    private static final String HORAS = ;
//    private static final String PRECIO_MATERIAL = ;
//    private static final String TIPO = ;
//    private static final String REVISION = ;
//    private static final String MECANICO = ;

    List<Trabajo> coleccionTrabajos;

    public Trabajos() {
        coleccionTrabajos = new ArrayList<>();
    }

//    Trabajos getInstancia() {
//
//    }

    @Override
    public void comenzar() {

    }

    @Override
    public void terminar() {

    }

    @Override
    public List<Trabajo> get() {
        return new ArrayList<>(coleccionTrabajos);
    }

    @Override
    public List<Trabajo> get(Cliente cliente) {
        List<Trabajo>trabajosCliente = new ArrayList<>();

        for (Trabajo trabajo : coleccionTrabajos) {
            if (trabajo.getCliente().getDni().equals(cliente.getDni())) {
                trabajosCliente.add(trabajo);
            }
        }
        return trabajosCliente;
    }

    @Override
    public List<Trabajo> get(Vehiculo vehiculo) {
        List<Trabajo>trabajosVehiculo = new ArrayList<>();

        for (Trabajo trabajo : coleccionTrabajos) {
            if (trabajo.getVehiculo().matricula().equals(vehiculo.matricula())) {
                trabajosVehiculo.add(trabajo);
            }
        }
        return trabajosVehiculo;
    }

    @Override
    public void insertar(Trabajo trabajo) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(trabajo, "No se puede insertar un trabajo nulo.");
        comprobarTrabajo(trabajo.getCliente(), trabajo.getVehiculo(), trabajo.getFechaInicio());
        coleccionTrabajos.add(trabajo);
    }

    private void comprobarTrabajo(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio) throws TallerMecanicoExcepcion{
        Objects.requireNonNull(cliente, "Cliente no nulo.");
        Objects.requireNonNull(vehiculo, "Vehiculo no nulo.");
        Objects.requireNonNull(fechaInicio, "Revisión no nulo.");

        for (Trabajo trabajoExistente : coleccionTrabajos) {
            if (!trabajoExistente.estaCerrado()) {
                if (trabajoExistente.getCliente().equals(cliente)) {
                    throw new TallerMecanicoExcepcion("El cliente tiene otro trabajo en curso.");
                }
                if (trabajoExistente.getVehiculo().equals(vehiculo)) {
                    throw new TallerMecanicoExcepcion("El vehículo está actualmente en el taller.");
                }
            }
            if (trabajoExistente.estaCerrado()) {
                if (trabajoExistente.getCliente().equals(cliente) && !fechaInicio.isAfter(trabajoExistente.getFechaFin())) {
                    throw new TallerMecanicoExcepcion("El cliente tiene otro trabajo posterior.");
                }
                if (trabajoExistente.getVehiculo().equals(vehiculo) && !fechaInicio.isAfter(trabajoExistente.getFechaFin())) {
                    throw new TallerMecanicoExcepcion("El vehículo tiene otro trabajo posterior.");
                }
            }
        }
    }

    @Override
    public Trabajo anadirHoras(Trabajo trabajo, int horas) throws TallerMecanicoExcepcion{
        Objects.requireNonNull(trabajo, "No puedo añadir horas a un trabajo nulo.");
        Objects.requireNonNull(horas, "Las horas de la revision no pueden ser nulas.");
        Trabajo trabajo1;
        trabajo1 = getTrabajoAbierto(trabajo.getVehiculo());
        if (trabajo1  instanceof Revision revision) {
            if (revision.estaCerrado()) {
                throw new TallerMecanicoExcepcion("No existe ningún trabajo abierto para dicho vehículo.");
            }
            revision.anadirHoras(horas);
        }
        if (trabajo1 instanceof Mecanico mecanico) {
            if (mecanico.estaCerrado()) {
                throw new TallerMecanicoExcepcion("No existe ningún trabajo abierto para dicho vehículo.");
            }
            mecanico.anadirHoras(horas);
        }
        return trabajo1;
    }

    private Trabajo getTrabajoAbierto(Vehiculo vehiculo) throws TallerMecanicoExcepcion{
        Trabajo trabajoAux = null;
        Iterator<Trabajo> iterador = coleccionTrabajos.iterator();
        boolean encontrado = false;
        if (iterador.hasNext() && !encontrado) {
            trabajoAux = iterador.next();
            if (trabajoAux.getVehiculo().equals(vehiculo) && !trabajoAux.estaCerrado()) {
                encontrado = true;
            }
        }
        if (trabajoAux == null) {
            throw new TallerMecanicoExcepcion("No existe ningún trabajo abierto para dicho vehículo.");
        }
        return trabajoAux;
    }

    @Override
    public Trabajo anadirPrecioMaterial(Trabajo trabajo, float precioMaterial) throws TallerMecanicoExcepcion{
        Objects.requireNonNull(trabajo, "No puedo añadir precio del material a un trabajo nulo.");
        Objects.requireNonNull(precioMaterial, "El precio del material no puede ser nulo.");
        Trabajo trabajo1;
        trabajo1 = getTrabajoAbierto(trabajo.getVehiculo());
        if (trabajo1 instanceof Revision) {
            throw new TallerMecanicoExcepcion("No se puede añadir precio al material para este tipo de trabajos.");
        }
        if (trabajo1 instanceof Mecanico mecanico) {
            mecanico.anadirPrecioMaterial(precioMaterial);
        }
        return trabajo1;
    }

    @Override
    public Trabajo cerrar(Trabajo trabajo, LocalDate fechaFin) throws TallerMecanicoExcepcion{
        Objects.requireNonNull(trabajo, "No puedo cerrar un trabajo nulo.");
        if (!coleccionTrabajos.contains(trabajo)) {
            throw new TallerMecanicoExcepcion("No existe ningún trabajo abierto para dicho vehículo.");
        }
        trabajo.cerrar(fechaFin);
        return trabajo;
    }

    @Override
    public Trabajo buscar(Trabajo trabajo) {
        Objects.requireNonNull(trabajo, "No se puede buscar un trabajo nulo.");
        if (coleccionTrabajos.contains(trabajo)) {
            int indexTrabajo = coleccionTrabajos.indexOf(trabajo);
            return coleccionTrabajos.get(indexTrabajo);
        } else {
            return null;
        }
    }

    @Override
    public void borrar(Trabajo trabajo) throws TallerMecanicoExcepcion {
        Objects.requireNonNull(trabajo,"No se puede borrar un trabajo nulo.");
        if (coleccionTrabajos.contains(trabajo)) {
            coleccionTrabajos.remove(trabajo);
        } else {
            throw new TallerMecanicoExcepcion("No existe ningún trabajo igual.");
        }
    }

    @Override
    public Map<TipoTrabajo, Integer> getEstadisticasMensuales(LocalDate mes) {
        Map<TipoTrabajo, Integer> mapaEstadisticas;
        mapaEstadisticas = inicializarEstadisticas();
        for (Trabajo trabajo : coleccionTrabajos) {
            if (trabajo.getFechaInicio().getMonth() == mes.getMonth() && trabajo.getFechaInicio().getYear() == mes.getYear()) {
                mapaEstadisticas.put(TipoTrabajo.get(trabajo), mapaEstadisticas.get(TipoTrabajo.get(trabajo)) + 1);
            }
        }
        return mapaEstadisticas;
    }

    private Map<TipoTrabajo, Integer> inicializarEstadisticas() {
        Map<TipoTrabajo, Integer> mapaTipoTrabajos = new HashMap<>();
        mapaTipoTrabajos.put(TipoTrabajo.MECANICO, 0);
        mapaTipoTrabajos.put(TipoTrabajo.REVISION, 0);
        return mapaTipoTrabajos;
    }

//    private void procesarDocumentoXml(Document documentoXml) {
//
//    }
//
//    private Vehiculo getTrabajo(Element elemento) {
//
//    }
//
//    private Document crearDocumentoXml() {
//
//    }
//
//    private Element getElemento(Document documentoXml, Trabajo trabajo) {
//
//    }
}

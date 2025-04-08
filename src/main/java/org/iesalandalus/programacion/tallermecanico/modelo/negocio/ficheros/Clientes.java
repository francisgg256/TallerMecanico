package org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.IClientes;

import javax.swing.text.Document;
import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Clientes implements IClientes {
//    private static final String FICHERO_CLIENTES =;
//    private static final String RAIZ =;
//    private static final String CLIENTE =;
//    private static final String NOMBRE =;
//    private static final String DNI =;
//    private static final String TELEFONO =;

    List<Cliente> clientes;
    public Clientes(){
        clientes = new ArrayList<>();
    }

//    Clientes getInstancia() {
//        if ()
//    }

    @Override
    public void comenzar() {

    }

    @Override
    public void terminar() {

    }

    @Override
    public List<Cliente> get(){
        List <Cliente> nuevaCliente;
        nuevaCliente = clientes;
        return nuevaCliente;
    }

    @Override
    public void insertar(Cliente cliente)throws TallerMecanicoExcepcion {
        Objects.requireNonNull(cliente,"No se puede insertar un cliente nulo.");
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            throw new TallerMecanicoExcepcion("Ya existe un cliente con ese DNI.");
        }
    }

    @Override
    public Cliente modificar(Cliente cliente, String nombre, String telefono)throws TallerMecanicoExcepcion{
        Objects.requireNonNull(cliente, "No se puede modificar un cliente nulo.");

        if (clientes.contains(cliente)){
            if (nombre != null && !nombre.isBlank()){
                buscar(cliente).setNombre(nombre);
            }
            if (telefono != null && !telefono.isBlank()){
                buscar(cliente).setTelefono(telefono);
            }
            return buscar(cliente);
        } else {
            throw new TallerMecanicoExcepcion("No existe ningún cliente con ese DNI.");
        }
    }

    @Override
    public Cliente buscar(Cliente cliente){
        Objects.requireNonNull(cliente, "No se puede buscar un cliente nulo.");
        if (clientes.contains(cliente)){
            int indexCliente = clientes.indexOf(cliente);
            return clientes.get(indexCliente);
        } else {
            return null;
        }
    }

    @Override
    public void borrar(Cliente cliente)throws TallerMecanicoExcepcion{
        Objects.requireNonNull(cliente,"No se puede borrar un cliente nulo.");
        if (clientes.contains(cliente)){
            clientes.remove(cliente);
        } else {
            throw new TallerMecanicoExcepcion("No existe ningún cliente con ese DNI.");
        }
    }

//    private void procesarDocumentoXml(Document documentoXml) {
//
//    }
//
//    private Vehiculo getCliente(Element elemento) {
//
//    }
//
//    private Document crearDocumentoXml() {
//
//    }
//
//    private Element getElemento(Document documentoXml, Cliente cliente) {
//
//    }
}

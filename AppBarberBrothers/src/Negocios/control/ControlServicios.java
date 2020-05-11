package Negocios.control;

import Datos.entidades.Servicios;
import Negocios.modelo.ModeloServicio;
import java.util.List;
import java.util.Optional;

public class ControlServicios extends Control {
    
    private ModeloServicio modelo;
    
    public ControlServicios() {
        modelo = new ModeloServicio();
    }
    
    public boolean agregar(int idServicio, String nombre, double precioUnitario, int duracion) {
        Servicios servicio = new Servicios(idServicio, nombre, precioUnitario, duracion);
        modelo.agregarServicio(servicio);
        return true;

    }

    public void eliminar(int id) {
        modelo.eliminarServicio(id);
    }

    public void modificar(Servicios servicio) {
        modelo.modificarServicio(servicio);
    }

    public Optional ver(int id) {
        return modelo.verServicio(id);
    }

    public List listar() {
        return modelo.listarServicios();
    }
    
}

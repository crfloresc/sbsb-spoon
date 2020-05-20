package Negocios.control;

import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.entidades.Empleado;
import Negocios.modelo.ModeloEmpleado;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ControlEmpleados extends Control {

    private ModeloEmpleado modelo;

    public ControlEmpleados() {
        modelo = new ModeloEmpleado();
    }

    public boolean agregar(int id, String nombreCompleto, Date fechaIngreso, String tipoEmpleado) {
        Empleado empleado = new Empleado(id, fechaIngreso, nombreCompleto, tipoEmpleado);
        modelo.agregarEmpleado(empleado);
        return true;

    }

    public void eliminar(int id) throws IllegalOrphanException{
        try {
            modelo.eliminarEmpleado(id);
        } catch (IllegalOrphanException e) {
            throw e;
        }
    }

    public void modificar(Empleado empleado) {
        modelo.modificarEmpleado(empleado);
    }

    public Optional ver(int id) {
        return modelo.verEmpleado(id);
    }

    public List listar() {
        return modelo.listarEmpleados();
    }

}

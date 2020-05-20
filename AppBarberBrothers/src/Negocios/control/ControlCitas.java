package Negocios.control;

import Negocios.modelo.ModeloCitas;
import Datos.entidades.Citas;
import Datos.entidades.Clientes;
import Datos.entidades.Empleado;
import Datos.entidades.Servicios;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class ControlCitas extends Control {
        
    private ModeloCitas modelo;
    
    public ControlCitas() {
         modelo = new ModeloCitas();        
    }
    
    public boolean agregar(int id, Date fecha, Empleado barbero, Clientes cliente, Servicios servicio) {
        Citas cita = new Citas(id, fecha, barbero, cliente, servicio);
        if (Periodo.comprobarCupo(listar(), cita)) {
            modelo.agregarCita(cita);
            return true;
        } else {
            return false;
        }
    }
    
    public void eliminar(int id) {
        modelo.eliminarCita(id);
    }
    
    public void modificar(Citas cita) {
        modelo.modificarCita(cita);
    }
    
    public Optional ver(int id) {
        return modelo.verCita(id);
    }
    
    public List listar() {
        return modelo.listarCitas();
    }
    
}

package Negocios.control;

import Negocios.modelo.ModeloCitas;
import Datos.entidades.Citas;
import Datos.entidades.Clientes;
import Datos.entidades.Empleado;
import Datos.entidades.Servicios;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.time.DateUtils;


public class ControlCitas extends Control {
        
    private ModeloCitas modelo;
    
    public ControlCitas() {
         modelo = new ModeloCitas();        
    }
    
    public void agregar(int id, Date fecha, Empleado barbero, Clientes cliente, Servicios servicio) {
        Citas cita = new Citas(id, fecha, barbero, cliente, servicio);
        if (comprobarCupo(cita)) {
            modelo.agregarCita(cita);
        } else {
            // TODO: en caso contrario, mostrar mensaje de error al usuario
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
    
    /**
     * Comprueba si existe cupo en determinada fecha y hora, busca las citas 
     * registradas y calcula el inicio y el final de cada fecha para comparar si 
     * tiene conflicto con una cita agendada.
     * 
     * @param nueva_cita cita a agregar en el calendario
     * @return true si es posible agregar la cita, false en caso contrario
     */
    public boolean comprobarCupo(Citas nueva_cita) {
        for (Iterator iterator = listar().iterator(); iterator.hasNext();) {
            Citas cita = (Citas) iterator.next();
            Date inicio_servicio = cita.getFecha();
            Date fin_servicio = DateUtils.addHours(cita.getFecha(), cita.getServicio().getDuracion());
            Date inicio_cita = cita.getFecha();
            Date fin_cita = DateUtils.addHours(inicio_cita, nueva_cita.getServicio().getDuracion());
            
            boolean esta_ocupando = (DateUtils.truncatedCompareTo(inicio_cita, inicio_servicio, Calendar.MINUTE) >= 0
                    && DateUtils.truncatedCompareTo(inicio_cita, fin_servicio, Calendar.MINUTE) < 0)
                    || (DateUtils.truncatedCompareTo(fin_cita, inicio_servicio, Calendar.MINUTE) > 0
                    && DateUtils.truncatedCompareTo(fin_cita, fin_servicio, Calendar.MINUTE) <= 0);
            try {
                if (esta_ocupando) {
                    throw new Exception();
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
}

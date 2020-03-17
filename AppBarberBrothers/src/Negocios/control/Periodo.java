/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios.control;

import Datos.entidades.Citas;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author Luis
 */
public class Periodo {

    private Periodo() {
    }
    
    /**
     * Comprueba si existe cupo en determinada fecha y hora, busca las citas 
     * registradas y calcula el inicio y el final de la fecha para la cita a
     * añadir para comparar si no tiene conflicto con una cita agendada.
     * 
     * @param nueva_cita cita a agregar en el calendario
     * @return true si es posible agregar la cita, false en caso contrario
     */
    static boolean comprobarCupo(List lista, Citas nueva_cita) {
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            final Citas cita = (Citas) iterator.next();
            final Date inicio_servicio = cita.getFecha();
            final Date fin_servicio = DateUtils.addHours(cita.getFecha(), cita.getServicio().getDuracion());
            final Date inicio_cita = cita.getFecha();
            final Date fin_cita = DateUtils.addHours(inicio_cita, nueva_cita.getServicio().getDuracion());
            
            boolean esta_ocupando = (DateUtils.truncatedCompareTo(inicio_cita, inicio_servicio, Calendar.MINUTE) >= 0
                    && DateUtils.truncatedCompareTo(inicio_cita, fin_servicio, Calendar.MINUTE) < 0)
                    || (DateUtils.truncatedCompareTo(fin_cita, inicio_servicio, Calendar.MINUTE) > 0
                    && DateUtils.truncatedCompareTo(fin_cita, fin_servicio, Calendar.MINUTE) <= 0);
            try {
                if (esta_ocupando) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
}

package Negocios.control;

import Datos.entidades.Citas;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.time.DateUtils;

public class Periodo {

    private Periodo() {
    }

    /**
     * Comprueba si existe cupo en determinada fecha y hora, busca las citas
     * registradas y calcula el inicio y el final de la fecha para la cita a
     * añadir para comparar si no tiene conflicto con una cita agendada.
     *
     * @param cita cita a agregar en el calendario
     * @return true si es posible agregar la cita, false en caso contrario
     */
    static boolean comprobarCupo(List lista, Citas cita) {
        Date inicio_cita = DateUtils.truncate(cita.getFecha(), Calendar.MINUTE);
        Date fin_cita = DateUtils.addMinutes(inicio_cita, cita.getServicio().getDuracion());

        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            Citas cita_obtenida = (Citas) iterator.next();
            Date inicio_cita_encontrada = DateUtils.truncate(cita_obtenida.getFecha(), Calendar.MINUTE);
            Date fin_cita_encontrada = DateUtils.addMinutes(cita_obtenida.getFecha(), cita_obtenida.getServicio().getDuracion());

            if ((inicio_cita.compareTo(inicio_cita_encontrada) == 0 && cita.getBarbero().equals(cita_obtenida.getBarbero())
                    || fin_cita.compareTo(fin_cita_encontrada) == 0 && cita.getBarbero().equals(cita_obtenida.getBarbero()))
                    || ((inicio_cita.after(inicio_cita_encontrada)
                    && fin_cita.before(fin_cita_encontrada)) && cita.getBarbero().equals(cita_obtenida.getBarbero()))) {
                return false;
            }
        }

        return true;
    }

}

package appbarberbrothers;

import Negocios.control.ControlCitas;
import Datos.entidades.Citas;
import Datos.entidades.Clientes;
import Datos.entidades.Empleado;
import Datos.entidades.Servicios;
import java.util.Date;

public class AppBarberBrothers {

    public static void main(String[] args) {
        
        ControlCitas control = new ControlCitas();
        
        Date date = new Date(2020, 10, 10);
        Empleado barbero = new Empleado(1);//HAY QUE REGISTRAR UN EMPLEADO CON EL ID:1 EN LA BD (A MANO)
        Clientes cliente  = new Clientes(2);//HAY QUE REGISTRAR UN CLIENTE CON EL ID:2 EN LA BD (A MANO)
        Servicios servicio = new Servicios(3);//HAY QUE REGISTRAR UN SERVICIO CON EL ID:3 EN LA BD (A MANO)  
        
        control.agregar(15, date, barbero, cliente, servicio);
        
        for (Object object : control.listar()) {
             Citas cita = (Citas) object;
             System.out.println(cita.toString());
        }
        
    }
    
}

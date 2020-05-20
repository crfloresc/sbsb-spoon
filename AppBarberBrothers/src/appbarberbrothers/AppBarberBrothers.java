package appbarberbrothers;

import Negocios.control.ControlCitas;
import Datos.entidades.Citas;
import Datos.entidades.Clientes;
import Datos.entidades.Empleado;
import Datos.entidades.Servicios;
import Negocios.control.ControlEmpleados;
import Negocios.control.ControlServicios;
import java.util.Date;

public class AppBarberBrothers {

    public static void main(String[] args) {
        
//        ControlEmpleados control = new ControlEmpleados();
//        Date date = new Date();
//        control.agregar(20, "El JONAS", date , "A");
        
        ControlServicios control = new ControlServicios();
        control.agregar(100, "Fade black mohawk", 120.0 , 45);
        
        
//        Empleado barbero = new Empleado(1, "José Manuel Iñiguez Nebot");//HAY QUE REGISTRAR UN EMPLEADO CON EL ID:1 EN LA BD (A MANO)
//        Clientes cliente  = new Clientes(2, "Francisco Quispe López", new Date((1996 - 1900), (7 - 1), 22));//HAY QUE REGISTRAR UN CLIENTE CON EL ID:2 EN LA BD (A MANO)
//        Servicios servicio = new Servicios(3, "Corte de cabello", 70, 20);//HAY QUE REGISTRAR UN SERVICIO CON EL ID:3 EN LA BD (A MANO)  
//        
//        control.agregar(20, date, barbero, cliente, servicio);
//        
//        for (Object object : control.listar()) {
//             Citas cita = (Citas) object;
//             System.out.println(cita.toString());
//        }
        
    }
    
}

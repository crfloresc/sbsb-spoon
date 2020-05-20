
package Negocios.modelo;

import Datos.DAO.DAOFactory;
import Datos.DAO.EmpleadoDAO;
import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.entidades.Empleado;
import java.util.List;
import java.util.Optional;


public class ModeloEmpleado {
    
    private EmpleadoDAO empleadoDAO;
    
    public ModeloEmpleado() {        
        empleadoDAO = DAOFactory.obtenerInstancia().crearEmpleadoDAO();   
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.guardar(empleado);    
    }
    
    public void eliminarEmpleado(int id) throws IllegalOrphanException{
        try {
            empleadoDAO.eliminar(id);
        } catch (IllegalOrphanException e) {
            throw e;
        } 
    }
    
    public void modificarEmpleado(Empleado empleado) {
        empleadoDAO.actualizar(empleado);
    }
    
    public Optional verEmpleado(int id) {
        return empleadoDAO.obtener(id);
    }
    
    public List listarEmpleados() {
        return empleadoDAO.obtenerTodo();
    }
    
}

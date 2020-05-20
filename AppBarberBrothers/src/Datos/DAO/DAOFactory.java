package Datos.DAO;

import Datos.DAO.CitaDAO;

public class DAOFactory extends IDAOFactory {
    
    private static CitaDAO citaDAO;
    private static EmpleadoDAO empleadoDAO;
    private static DAOFactory DAOFactory;    
    private static ServicioDAO servicioDAO;
    
    private DAOFactory() {          
    }
    
    public static DAOFactory obtenerInstancia() {
        if(DAOFactory == null) {
            DAOFactory = new DAOFactory();
        }            
        return DAOFactory;
    }
    
    @Override
    public CitaDAO crearCitaDAO(){
        if(citaDAO == null) {
            citaDAO = new CitaDAO();
        }        
        return citaDAO;          
    }
    
    @Override
    public EmpleadoDAO crearEmpleadoDAO(){
        if(empleadoDAO == null) {
            empleadoDAO = new EmpleadoDAO();
        }        
        return empleadoDAO;          
    }
    
    @Override
    public ServicioDAO crearServicioDAO(){
        if(servicioDAO == null) {
            servicioDAO = new ServicioDAO();
        }        
        return servicioDAO;          
    }

    
}

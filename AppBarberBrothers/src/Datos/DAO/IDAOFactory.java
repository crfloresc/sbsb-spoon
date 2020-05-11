package Datos.DAO;

import Datos.DAO.CitaDAO;


public abstract class IDAOFactory {
    
    public CitaDAO crearCitaDAO(){
        return null;
    }    
    
    public EmpleadoDAO crearEmpleadoDAO() {
        return null;
    }
    
    public ServicioDAO crearServicioDAO() {
        return null;
    }
}

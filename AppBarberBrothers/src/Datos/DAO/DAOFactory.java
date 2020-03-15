package Datos.DAO;

import Datos.DAO.CitaDAO;

public class DAOFactory extends IDAOFactory {
    
    private static CitaDAO citaDAO;
    private static DAOFactory DAOFactory;
    
    
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

    
}

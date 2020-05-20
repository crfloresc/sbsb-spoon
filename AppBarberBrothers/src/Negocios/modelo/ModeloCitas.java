package Negocios.modelo;

import Datos.DAO.CitaDAO;
import Datos.DAO.DAOFactory;
import Datos.entidades.Citas;
import java.util.List;
import java.util.Optional;


public class ModeloCitas {
    
    private CitaDAO citaDAO;
    
    public ModeloCitas() {        
        citaDAO = DAOFactory.obtenerInstancia().crearCitaDAO();   
    }
    
    public void agregarCita(Citas cita) {
        citaDAO.guardar(cita);    
    }
    
    public void eliminarCita(int id) {
        citaDAO.eliminar(id);    
    }
    
    public void modificarCita(Citas cita) {
        citaDAO.actualizar(cita);
    }
    
    public Optional verCita(int id) {
        return citaDAO.obtener(id);
    }
    
    public List listarCitas() {
        return citaDAO.obtenerTodo();
    }
    
    
    
    
    
    
    
    
    
    
    
}

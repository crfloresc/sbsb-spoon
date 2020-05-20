package Negocios.modelo;

import Datos.DAO.DAOFactory;
import Datos.DAO.ServicioDAO;
import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.entidades.Servicios;
import java.util.List;
import java.util.Optional;

public class ModeloServicio {
    
    private ServicioDAO servicioDAO;
    
    public ModeloServicio() {        
        servicioDAO = DAOFactory.obtenerInstancia().crearServicioDAO();
    }
    
    public void agregarServicio(Servicios servicio) {
        servicioDAO.guardar(servicio);    
    }
    
    public void eliminarServicio(int id) throws IllegalOrphanException{
        try {
            servicioDAO.eliminar(id);
        } catch (IllegalOrphanException e) {
            throw e;
        } 
    }
    
    public void modificarServicio(Servicios servicio) {
        servicioDAO.actualizar(servicio);
    }
    
    public Optional verServicio(int id) {
        return servicioDAO.obtener(id);
    }
    
    public List listarServicios() {
        return servicioDAO.obtenerTodo();
    }
    
}

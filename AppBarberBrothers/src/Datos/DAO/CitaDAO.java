package Datos.DAO;

import Datos.controladores.CitasJpaController;
import Datos.controladores.exceptions.NonexistentEntityException;
import Datos.entidades.Citas;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaDAO implements DAO {
    
    private  CitasJpaController controlCitas = new CitasJpaController();

    @Override
    public void guardar(Object t) {
        controlCitas.create((Citas) t);
    }

    @Override
    public void eliminar(int id) {
        try {
            controlCitas.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Object t) {
        try {
            controlCitas.edit((Citas) t);
        } catch (Exception ex) {
            Logger.getLogger(CitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Optional obtener(int id) {
        Citas cita = controlCitas.findCitas(id);
        return Optional.of(cita);
    }

    @Override
    public List obtenerTodo() {
        return controlCitas.findCitasEntities();
    }

    
    
}

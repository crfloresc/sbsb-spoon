/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.DAO;

import Datos.controladores.ServiciosJpaController;
import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.controladores.exceptions.NonexistentEntityException;
import Datos.entidades.Servicios;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ServicioDAO implements DAO {
    
    private ServiciosJpaController controladorServicios = new ServiciosJpaController();

    @Override
    public void guardar(Object t) {
        controladorServicios.create((Servicios)t);
    }

    @Override
    public void eliminar(int id) {
        try {
            controladorServicios.destroy(id);
        } catch (IllegalOrphanException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Object t) {
        try {
            controladorServicios.edit((Servicios)t);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Optional obtener(int id) {
        Servicios serv = controladorServicios.findServicios(id);
        return Optional.of(serv);
    }

    @Override
    public List obtenerTodo() {
         return controladorServicios.findServiciosEntities();
    }
    
}

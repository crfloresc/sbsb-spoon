/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.DAO;

import Datos.controladores.EmpleadoJpaController;
import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.controladores.exceptions.NonexistentEntityException;
import Datos.entidades.Empleado;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class EmpleadoDAO implements DAO {
    
    private EmpleadoJpaController controladorEmpleados = new EmpleadoJpaController();

    @Override
    public void guardar(Object t) {
        controladorEmpleados.create((Empleado) t);
    }

    @Override
    public void eliminar(int id) throws IllegalOrphanException{
        try {
            controladorEmpleados.destroy(id);
        } catch (IllegalOrphanException ex) {
            //Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Object t) {
        try {
            controladorEmpleados.edit((Empleado)t);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Optional obtener(int id) {
        Empleado emp = controladorEmpleados.findEmpleado(id);
        return Optional.of(emp);
    }

    @Override
    public List obtenerTodo() {
        return controladorEmpleados.findEmpleadoEntities();
    }
    
}

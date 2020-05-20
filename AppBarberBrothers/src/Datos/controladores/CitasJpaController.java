/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.controladores;

import Datos.controladores.exceptions.NonexistentEntityException;
import Datos.entidades.Citas;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Datos.entidades.Empleado;
import Datos.entidades.Clientes;
import Datos.entidades.Servicios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class CitasJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    public CitasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("AppBarberBrothersPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Citas citas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado barbero = citas.getBarbero();
            if (barbero != null) {
                barbero = em.getReference(barbero.getClass(), barbero.getIdUsuario());
                citas.setBarbero(barbero);
            }
            Clientes cliente = citas.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getIdUsuario());
                citas.setCliente(cliente);
            }
            Servicios servicio = citas.getServicio();
            if (servicio != null) {
                servicio = em.getReference(servicio.getClass(), servicio.getIdServicio());
                citas.setServicio(servicio);
            }
            em.persist(citas);
            if (barbero != null) {
                barbero.getCitasList().add(citas);
                barbero = em.merge(barbero);
            }
            if (cliente != null) {
                cliente.getCitasList().add(citas);
                cliente = em.merge(cliente);
            }
            if (servicio != null) {
                servicio.getCitasList().add(citas);
                servicio = em.merge(servicio);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Citas citas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Citas persistentCitas = em.find(Citas.class, citas.getIdCita());
            Empleado barberoOld = persistentCitas.getBarbero();
            Empleado barberoNew = citas.getBarbero();
            Clientes clienteOld = persistentCitas.getCliente();
            Clientes clienteNew = citas.getCliente();
            Servicios servicioOld = persistentCitas.getServicio();
            Servicios servicioNew = citas.getServicio();
            if (barberoNew != null) {
                barberoNew = em.getReference(barberoNew.getClass(), barberoNew.getIdUsuario());
                citas.setBarbero(barberoNew);
            }
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getIdUsuario());
                citas.setCliente(clienteNew);
            }
            if (servicioNew != null) {
                servicioNew = em.getReference(servicioNew.getClass(), servicioNew.getIdServicio());
                citas.setServicio(servicioNew);
            }
            citas = em.merge(citas);
            if (barberoOld != null && !barberoOld.equals(barberoNew)) {
                barberoOld.getCitasList().remove(citas);
                barberoOld = em.merge(barberoOld);
            }
            if (barberoNew != null && !barberoNew.equals(barberoOld)) {
                barberoNew.getCitasList().add(citas);
                barberoNew = em.merge(barberoNew);
            }
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getCitasList().remove(citas);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getCitasList().add(citas);
                clienteNew = em.merge(clienteNew);
            }
            if (servicioOld != null && !servicioOld.equals(servicioNew)) {
                servicioOld.getCitasList().remove(citas);
                servicioOld = em.merge(servicioOld);
            }
            if (servicioNew != null && !servicioNew.equals(servicioOld)) {
                servicioNew.getCitasList().add(citas);
                servicioNew = em.merge(servicioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = citas.getIdCita();
                if (findCitas(id) == null) {
                    throw new NonexistentEntityException("The citas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Citas citas;
            try {
                citas = em.getReference(Citas.class, id);
                citas.getIdCita();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The citas with id " + id + " no longer exists.", enfe);
            }
            Empleado barbero = citas.getBarbero();
            if (barbero != null) {
                barbero.getCitasList().remove(citas);
                barbero = em.merge(barbero);
            }
            Clientes cliente = citas.getCliente();
            if (cliente != null) {
                cliente.getCitasList().remove(citas);
                cliente = em.merge(cliente);
            }
            Servicios servicio = citas.getServicio();
            if (servicio != null) {
                servicio.getCitasList().remove(citas);
                servicio = em.merge(servicio);
            }
            em.remove(citas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Citas> findCitasEntities() {
        return findCitasEntities(true, -1, -1);
    }

    public List<Citas> findCitasEntities(int maxResults, int firstResult) {
        return findCitasEntities(false, maxResults, firstResult);
    }

    private List<Citas> findCitasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Citas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Citas findCitas(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Citas.class, id);
        } finally {
            em.close();
        }
    }

    public int getCitasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Citas> rt = cq.from(Citas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.controladores;

import Datos.controladores.exceptions.IllegalOrphanException;
import Datos.controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Datos.entidades.Citas;
import Datos.entidades.Servicios;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class ServiciosJpaController implements Serializable {

    public ServiciosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("AppBarberBrothersPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Servicios servicios) {
        if (servicios.getCitasList() == null) {
            servicios.setCitasList(new ArrayList<Citas>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Citas> attachedCitasList = new ArrayList<Citas>();
            for (Citas citasListCitasToAttach : servicios.getCitasList()) {
                citasListCitasToAttach = em.getReference(citasListCitasToAttach.getClass(), citasListCitasToAttach.getIdCita());
                attachedCitasList.add(citasListCitasToAttach);
            }
            servicios.setCitasList(attachedCitasList);
            em.persist(servicios);
            for (Citas citasListCitas : servicios.getCitasList()) {
                Servicios oldServicioOfCitasListCitas = citasListCitas.getServicio();
                citasListCitas.setServicio(servicios);
                citasListCitas = em.merge(citasListCitas);
                if (oldServicioOfCitasListCitas != null) {
                    oldServicioOfCitasListCitas.getCitasList().remove(citasListCitas);
                    oldServicioOfCitasListCitas = em.merge(oldServicioOfCitasListCitas);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Servicios servicios) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Servicios persistentServicios = em.find(Servicios.class, servicios.getIdServicio());
            List<Citas> citasListOld = persistentServicios.getCitasList();
            List<Citas> citasListNew = servicios.getCitasList();
            List<String> illegalOrphanMessages = null;
            for (Citas citasListOldCitas : citasListOld) {
                if (!citasListNew.contains(citasListOldCitas)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Citas " + citasListOldCitas + " since its servicio field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Citas> attachedCitasListNew = new ArrayList<Citas>();
            for (Citas citasListNewCitasToAttach : citasListNew) {
                citasListNewCitasToAttach = em.getReference(citasListNewCitasToAttach.getClass(), citasListNewCitasToAttach.getIdCita());
                attachedCitasListNew.add(citasListNewCitasToAttach);
            }
            citasListNew = attachedCitasListNew;
            servicios.setCitasList(citasListNew);
            servicios = em.merge(servicios);
            for (Citas citasListNewCitas : citasListNew) {
                if (!citasListOld.contains(citasListNewCitas)) {
                    Servicios oldServicioOfCitasListNewCitas = citasListNewCitas.getServicio();
                    citasListNewCitas.setServicio(servicios);
                    citasListNewCitas = em.merge(citasListNewCitas);
                    if (oldServicioOfCitasListNewCitas != null && !oldServicioOfCitasListNewCitas.equals(servicios)) {
                        oldServicioOfCitasListNewCitas.getCitasList().remove(citasListNewCitas);
                        oldServicioOfCitasListNewCitas = em.merge(oldServicioOfCitasListNewCitas);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = servicios.getIdServicio();
                if (findServicios(id) == null) {
                    throw new NonexistentEntityException("The servicios with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Servicios servicios;
            try {
                servicios = em.getReference(Servicios.class, id);
                servicios.getIdServicio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicios with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Citas> citasListOrphanCheck = servicios.getCitasList();
            for (Citas citasListOrphanCheckCitas : citasListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Servicios (" + servicios + ") cannot be destroyed since the Citas " + citasListOrphanCheckCitas + " in its citasList field has a non-nullable servicio field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(servicios);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Servicios> findServiciosEntities() {
        return findServiciosEntities(true, -1, -1);
    }

    public List<Servicios> findServiciosEntities(int maxResults, int firstResult) {
        return findServiciosEntities(false, maxResults, firstResult);
    }

    private List<Servicios> findServiciosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Servicios.class));
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

    public Servicios findServicios(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Servicios.class, id);
        } finally {
            em.close();
        }
    }

    public int getServiciosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Servicios> rt = cq.from(Servicios.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

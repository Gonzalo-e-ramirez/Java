/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.PeluqueriaCanina;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gonza Hermoso
 */
public class PeluqueriaCaninaJpaController implements Serializable {

    public PeluqueriaCaninaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    //Creamos el contructor por defecto pasandole a emf nuestra persistencia.
    public PeluqueriaCaninaJpaController(){
        this.emf = Persistence.createEntityManagerFactory("Persistencia");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PeluqueriaCanina peluqueriaCanina) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(peluqueriaCanina);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPeluqueriaCanina(peluqueriaCanina.getNumCliente()) != null) {
                throw new PreexistingEntityException("PeluqueriaCanina " + peluqueriaCanina + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PeluqueriaCanina peluqueriaCanina) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            peluqueriaCanina = em.merge(peluqueriaCanina);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = peluqueriaCanina.getNumCliente();
                if (findPeluqueriaCanina(id) == null) {
                    throw new NonexistentEntityException("The peluqueriaCanina with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PeluqueriaCanina peluqueriaCanina;
            try {
                peluqueriaCanina = em.getReference(PeluqueriaCanina.class, id);
                peluqueriaCanina.getNumCliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The peluqueriaCanina with id " + id + " no longer exists.", enfe);
            }
            em.remove(peluqueriaCanina);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PeluqueriaCanina> findPeluqueriaCaninaEntities() {
        return findPeluqueriaCaninaEntities(true, -1, -1);
    }

    public List<PeluqueriaCanina> findPeluqueriaCaninaEntities(int maxResults, int firstResult) {
        return findPeluqueriaCaninaEntities(false, maxResults, firstResult);
    }

    private List<PeluqueriaCanina> findPeluqueriaCaninaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PeluqueriaCanina.class));
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

    public PeluqueriaCanina findPeluqueriaCanina(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PeluqueriaCanina.class, id);
        } finally {
            em.close();
        }
    }

    public int getPeluqueriaCaninaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PeluqueriaCanina> rt = cq.from(PeluqueriaCanina.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

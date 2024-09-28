package com.carlos.lectorpdf.persistencia;

import com.carlos.lectorpdf.logica.Matriculado;
import com.carlos.lectorpdf.persistencia.exceptions.NonexistentEntityException;
import com.carlos.lectorpdf.persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class MatriculadoJpaController implements Serializable {

    public MatriculadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public MatriculadoJpaController() {
        emf = Persistence.createEntityManagerFactory("GestorDeAsociadosPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Matriculado matriculado) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(matriculado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMatriculado(matriculado.getMatricula()) != null) {
                throw new PreexistingEntityException("Matriculado " + matriculado + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Matriculado matriculado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            matriculado = em.merge(matriculado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = matriculado.getMatricula();
                if (findMatriculado(id) == null) {
                    throw new NonexistentEntityException("The matriculado with id " + id + " no longer exists.");
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
            Matriculado matriculado;
            try {
                matriculado = em.getReference(Matriculado.class, id);
                matriculado.getMatricula();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The matriculado with id " + id + " no longer exists.", enfe);
            }
            em.remove(matriculado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Matriculado> findMatriculadoEntities() {
        return findMatriculadoEntities(true, -1, -1);
    }

    public List<Matriculado> findMatriculadoEntities(int maxResults, int firstResult) {
        return findMatriculadoEntities(false, maxResults, firstResult);
    }

    private List<Matriculado> findMatriculadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Matriculado.class));
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

    public Matriculado findMatriculado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Matriculado.class, id);
        } finally {
            em.close();
        }
    } 

    public int getMatriculadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Matriculado> rt = cq.from(Matriculado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

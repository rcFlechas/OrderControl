package com.ordercontrol.DAO.JPA;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ordercontrol.DAO.GenericDAO;

@Repository
public abstract class  GenericDAOJPAImpl <T, Id extends Serializable> implements GenericDAO<T, Id>{
	private Class<T> claseDePersistencia;

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
	public GenericDAOJPAImpl() {
        this.claseDePersistencia = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

	public T buscarPorClave(Id id) {        
        T objeto = null;
        try {
            objeto = (T) em.find(claseDePersistencia, id);            
        } finally {
            em.close();
        }
        return objeto;
	}

	public List<T> buscarTodos() {
		List<T> listaDeObjetos = null;
        try {
            TypedQuery<T> consulta = (TypedQuery<T>) em.createQuery("select obj from " + claseDePersistencia.getSimpleName() + " obj ", claseDePersistencia);
            listaDeObjetos = consulta.getResultList();            
        } finally {
            em.close();
        }
        return listaDeObjetos;
	}

	public boolean insertar(T objeto) {
		boolean a = false;        
        try {            
            System.out.println(em.contains(objeto));
            em.persist(objeto);            
            System.out.println(em.contains(objeto));
            if(em.contains(objeto))a = true;
        } catch (PersistenceException e){   
            e.printStackTrace();
        } finally {
            em.close();
        }
        return a;
	}

	public boolean salvar(T objeto) {
		boolean a = false;
        try {                        
            em.merge(objeto);             
            if(em.contains(objeto))a = true;
        } catch (PersistenceException e) {
            
            throw e;
        } finally {
            em.close();
        }
        return a;
	}

	public boolean borrar(T objeto) {
		boolean a = false;
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.remove(em.merge(objeto));
            tx.commit();
        } catch (PersistenceException e) {
            if(tx != null)tx.rollback();
            throw e;
        } finally {
            em.close();
        }
        return a;
	}
    

}

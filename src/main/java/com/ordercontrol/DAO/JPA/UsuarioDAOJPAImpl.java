package com.ordercontrol.DAO.JPA;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ordercontrol.DAO.UsuarioDAO;
import com.ordercontrol.domain.Usuario;

@Repository
public class UsuarioDAOJPAImpl extends GenericDAOJPAImpl<Usuario, Integer> implements UsuarioDAO{

	@PersistenceContext
    private EntityManager em;
	
	public Usuario entrar(Usuario usuario) {
		Usuario u = null;
		
		try {
			Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.userName = ?1 AND u.password = ?2");
	        query.setParameter(1, usuario.getUserName());
	        query.setParameter(2, usuario.getPassword());        
	        u = (Usuario) query.getSingleResult();
        
		} finally {
            em.close();
        }
		return u;
	}

}

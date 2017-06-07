package com.ordercontrol.servicioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ordercontrol.DAO.UsuarioDAO;
import com.ordercontrol.domain.Usuario;
import com.ordercontrol.servicio.UsuarioServicio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Transactional(readOnly = true)
	public Usuario buscarPorClave(Integer idUsuario) {
		return usuarioDAO.buscarPorClave(idUsuario);
	}

	@Transactional(readOnly = true)
	public List<Usuario> buscarTodos() {		
		return usuarioDAO.buscarTodos();
	}

	@Transactional
	public boolean insertar(Usuario usuario) {		
		return usuarioDAO.insertar(usuario);
	}

	@Transactional
	public boolean salvar(Usuario usuario) {
		return usuarioDAO.salvar(usuario);
	}

	@Transactional
	public boolean borrar(Usuario usuario) {
		return usuarioDAO.borrar(usuario);
	}

	@Transactional(readOnly = true)
	public Usuario entrar(Usuario usuario) {		
		return usuarioDAO.entrar(usuario);
	}	
}

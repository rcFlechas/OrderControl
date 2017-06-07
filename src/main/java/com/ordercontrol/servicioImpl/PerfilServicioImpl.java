package com.ordercontrol.servicioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ordercontrol.DAO.PerfilDAO;
import com.ordercontrol.domain.Perfil;
import com.ordercontrol.servicio.PerfilServicio;

@Service
public class PerfilServicioImpl implements PerfilServicio{
	
	@Autowired
	private PerfilDAO perfilDAO;

	@Transactional(readOnly = true)
	public Perfil buscarPorClave(Integer idPerfil) {
		return perfilDAO.buscarPorClave(idPerfil);
	}

	@Transactional(readOnly = true)
	public List<Perfil> buscarTodos() {
		return perfilDAO.buscarTodos();
	}

	@Transactional
	public boolean insertar(Perfil perfil) {
		return perfilDAO.insertar(perfil);
	}

	@Transactional
	public boolean salvar(Perfil perfil) {
		return perfilDAO.salvar(perfil);
	}

	@Transactional
	public boolean borrar(Perfil perfil) {
		return perfilDAO.borrar(perfil);
	}
}

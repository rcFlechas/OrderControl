package com.ordercontrol.servicio;

import java.util.List;

import com.ordercontrol.domain.Perfil;

public interface PerfilServicio {
	public abstract Perfil buscarPorClave(Integer idPerfil);
    public abstract List<Perfil> buscarTodos();
    public abstract boolean insertar(Perfil perfil);
    public abstract boolean salvar(Perfil perfil);   
    public abstract boolean borrar(Perfil perfil);
}

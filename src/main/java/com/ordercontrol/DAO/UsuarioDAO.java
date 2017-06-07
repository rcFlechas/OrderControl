package com.ordercontrol.DAO;

import java.util.List;

import com.ordercontrol.domain.Usuario;

public interface UsuarioDAO {
	public abstract Usuario buscarPorClave(Integer idUsuario);
    public abstract List<Usuario> buscarTodos();
    public abstract boolean insertar(Usuario usuario);
    public abstract boolean salvar(Usuario usuario);    
    public abstract boolean borrar(Usuario usuario);
    public abstract Usuario entrar(Usuario usuario); 
}

package com.ordercontrol.DAO;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <T,Id extends Serializable>  {
	T buscarPorClave(Id id);
    List<T> buscarTodos();
    boolean insertar(T objeto);
    boolean salvar(T objeto);
    boolean borrar(T objeto);
}

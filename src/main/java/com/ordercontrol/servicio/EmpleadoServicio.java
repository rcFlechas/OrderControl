package com.ordercontrol.servicio;

import java.util.List;

import com.ordercontrol.domain.Empleado;

public interface EmpleadoServicio {
	public abstract Empleado buscarPorClave(Integer idEmpleado);
    public abstract List<Empleado> buscarTodos();
    public abstract boolean insertar(Empleado empleado);
    public abstract boolean salvar(Empleado empleado);   
    public abstract boolean borrar(Empleado empleado);   
}

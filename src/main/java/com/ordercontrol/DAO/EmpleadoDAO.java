package com.ordercontrol.DAO;

import java.util.List;
import com.ordercontrol.domain.Empleado;

public interface EmpleadoDAO {
	public abstract Empleado buscarPorClave(Integer idEmpleado);
    public abstract List<Empleado> buscarTodos();
    public abstract boolean insertar(Empleado empleado);
    public abstract boolean salvar(Empleado empleado);   
    public abstract boolean borrar(Empleado empleado);    
}

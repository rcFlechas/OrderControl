package com.ordercontrol.servicioImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ordercontrol.DAO.EmpleadoDAO;
import com.ordercontrol.domain.Empleado;
import com.ordercontrol.servicio.EmpleadoServicio;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio{

	@Autowired
	private EmpleadoDAO empleadoDAO;

	@Transactional(readOnly = true)
	public Empleado buscarPorClave(Integer idEmpleado) {		
		return empleadoDAO.buscarPorClave(idEmpleado);
	}

	@Transactional(readOnly = true)
	public List<Empleado> buscarTodos() {
		return empleadoDAO.buscarTodos();
	}

	@Transactional
	public boolean insertar(Empleado empleado) {
		return empleadoDAO.insertar(empleado);
	}

	@Transactional
	public boolean salvar(Empleado empleado) {
		return empleadoDAO.salvar(empleado);
	}

	@Transactional
	public boolean borrar(Empleado empleado) {
		return empleadoDAO.borrar(empleado);
	}
}

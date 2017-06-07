package com.ordercontrol.DAO.JPA;

import org.springframework.stereotype.Repository;

import com.ordercontrol.DAO.EmpleadoDAO;
import com.ordercontrol.domain.Empleado;
@Repository
public class EmpleadoDAOJPAImpl extends GenericDAOJPAImpl<Empleado, Integer> implements EmpleadoDAO{

}

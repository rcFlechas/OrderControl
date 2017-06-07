package com.ordercontrol.DAO.JPA;

import org.springframework.stereotype.Repository;

import com.ordercontrol.DAO.PerfilDAO;
import com.ordercontrol.domain.Perfil;
@Repository
public class PerfilDAOJPAImpl extends GenericDAOJPAImpl<Perfil, Integer> implements PerfilDAO{

}

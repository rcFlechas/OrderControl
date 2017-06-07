package com.ordercontrol.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ordercontrol.domain.Usuario;
import com.ordercontrol.servicioImpl.UsuarioServicioImpl;

@Controller
@RequestMapping(value="/buscar_todos_usuarios.oc")
@Service
public class BuscarTodosUsuariosControlador {
	
	@Autowired
	private UsuarioServicioImpl usuarioServicio;
	
	@RequestMapping(method=RequestMethod.GET)
	@Transactional(readOnly = true)
	public String buscarTodosUsuario(HttpServletRequest request){	
		
		List<Usuario> listaUsuarios = usuarioServicio.buscarTodos();
		if(listaUsuarios != null){
			request.setAttribute("listaUsuarios", listaUsuarios);
			return "todos_usuarios";
		}else{
			return "prueba";
		}
	}

}

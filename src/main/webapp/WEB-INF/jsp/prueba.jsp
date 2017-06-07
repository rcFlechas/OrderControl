<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<%@page import="com.ordercontrol.domain.Usuario"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PRUEBA</title>

<%
	  
	Usuario u = (Usuario) request.getAttribute("usuario");
%>
</head>
<body>
<a href="buscar_todos_usuarios.oc"> Buscar Todos Usuarios</a>
<a href="insertar_usuario.oc"> Insertar Usuario</a>
<a href="actualizar_usuario.oc"> Actualizar Usuario</a>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>USER NAME</th>
			<th>PASSWORD</th>
			<th>PERFIL</th>
			<th>EMPLEADO</th>
			<th>FECHA</th>
			<th>ACTIV0</th>
		</tr>		
		<tr>
				<td><%=u.getIdUsuario()%></td>
				<td><%=u.getUserName()%></td>
				<td><%=u.getPassword()%></td>
				<td><%=u.getPerfil().getNombrePerfil()%></td>
				<td><%=u.getEmpleado().getNombreEmpleado()%> - <%=u.getEmpleado().getApellidoEmpleado()%></td>
				<td><%=u.getFechaIngreso()%></td>
				<td><%=u.getActivo()%></td>
			
		</tr>	
	</table>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ordercontrol.domain.Usuario"%>
<%@page import="java.util.List"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos los usuarios</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>USER NAME</th>
			<th>PASSWORD</th>
			<th>PERFIL</th>
			<th>EMPLEADO</th>
			<th>FECHA</th>
			<th>ACTIVO</th>
		</tr>
		<%
		if(request.getAttribute("listaUsuarios") != null){
        	List<Usuario> listaUsuarios = (List<Usuario>)request.getAttribute("listaUsuarios");
        	
        	for(Usuario u : listaUsuarios){
        		%>
        		<tr>
        			<td><%=u.getIdUsuario()%></td>
					<td><%=u.getUserName()%></td>
					<td><%=u.getPassword()%></td>
					<td><%=u.getPerfil().getNombrePerfil()%></td>
					<td><%=u.getEmpleado().getNombreEmpleado()%> - <%=u.getEmpleado().getApellidoEmpleado()%></td>
					<td><%=u.getFechaIngreso()%></td>
					<td><%=u.getActivo()%></td>
        		</tr>
        		<%
        	}
        }       
		%>
	</table>
</body>
</html>
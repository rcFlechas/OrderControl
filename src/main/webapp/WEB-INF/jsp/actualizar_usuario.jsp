<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ordercontrol.domain.Usuario"%>
<%@page import="com.ordercontrol.domain.Empleado"%>    
<%@page import="com.ordercontrol.domain.Perfil"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Usuario  </title>
<%



	
%>
</head>
<body>
<h1>Actualizar</h1>

<%
if(request.getAttribute("usuario") != null){
	Usuario u = (Usuario) request.getAttribute("usuario");	
	
	%><p>USERBAME: <%=u.getUserName()%></p>
	<p>PASSWORD: <%=u.getPassword()%></p>
	<p>PERFIL: <%=u.getPerfil().getNombrePerfil()%></p>
	<p>EMPLEADO: <%=u.getEmpleado().getNombreEmpleado()%> <%=u.getEmpleado().getApellidoEmpleado()%></p>
	<p>ACTIVO: <%=u.getActivo()%></p>
	<%
}
%>

        <form action="actualizar_usuario.oc" method="post">
            <table>
                        
                
                        <tr><td>Id: <br /><br /><input type="text" name="txtId" /> </td></tr>
                        <tr><td>UserName: <br /><br /><input type="text" name="userName" value="" />  </td></tr>
                        <tr><td>Password: <br /><br /><input type="text" name="pass" value="" />  </td></tr>
                        <tr>
                            <td>
                                Perfil <br /><br /><select name="perfil" id="idPerfil" >
                                    <option value="SELECCIONE" selected>SELECCIONE</option>
                                    
                                    <%
                                    if(request.getAttribute("perfil") != null){
                                    	List<Perfil> listaPerfil = (List<Perfil>)request.getAttribute("perfil");
                                    	
                                    	for(Perfil p : listaPerfil){
                                    		%>
                                    		<option value="<%=p.getIdPerfil()%>"><%=p.getNombrePerfil()%></option>
                                    		<%
                                    	}
                                    }                                    
                                     %>                                  
                                                                           
                                                                      
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Empleado <br /><br /><select name="empleado" id="idEmpleado" >
                                    <option value="SELECCIONE" selected >SELECCIONE</option>
                                    <%
                                    if(request.getAttribute("empleado") != null){
                                    	List<Empleado> listaEmpleado = (List<Empleado>)request.getAttribute("empleado");
                                    	
                                    	for(Empleado e : listaEmpleado){
                                    		%><option value="<%=e.getIdEmpleado()%>"><%=e.getNombreEmpleado() %> <%=e.getApellidoEmpleado()%></option> <%
                                    	}
                                    }                                  
                                    %> 
                                </select>
                            </td>
                        </tr>
                        <tr><td>Activo: <br /><br /><input type="text" name="activo" value="" />  </td></tr>                        
			<tr><td colspan="2"><input type="submit" value="Enviar..." /></td></tr>
		</table>            
          
        </form>

</body>
</html>
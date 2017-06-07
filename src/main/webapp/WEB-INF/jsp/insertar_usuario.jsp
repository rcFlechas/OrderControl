<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insertar Usaurio</title>
</head>
<body>
	<form action="insertar_usuario.oc" method="post">
	<label>UserName</label><input type="text" name="userName" />
	<label>Password</label><input type="text" name="pass"/>
	<label>Perfil</label><input type="text" name="perfil"/>
	<label>Empleado</label><input type="text" name="empleado"/>
	<input type="submit" value="Enviar" />
	</form>
</body>
</html>
<%-- 
    Document   : index
    Created on : 19 mar 2025, 17:04:41
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 08</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Tabla de multiplicar</h1>
        <form class="tabla" method="post" action="tabla.jsp">
            Introduzca un número: <input type="number" name="numero">
            <input type="submit" value="Aceptar"> 
        </form>
    </body>
</html>

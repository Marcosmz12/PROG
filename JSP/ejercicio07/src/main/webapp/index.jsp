<%-- 
    Document   : index
    Created on : 13 mar 2025, 21:01:05
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 07</title>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Conversor de Monedas!!!</h1>
        <form class="dinero" method="post" action="conversor.jsp">
            cantidad</br> <input type="number" min="0" step="0.01" name="cantidad"></br></br>
            <input type="radio" name="cambio" value="eurosEnPesetas" checked="checked"> euros -> pesetas
            </br>
            <input type="radio" name="cambio" value="pesetasEnEuros"> pesetas -> euros </br></br>
            <input type="submit" value="Convertir">
        </form>
    </body>
</html>

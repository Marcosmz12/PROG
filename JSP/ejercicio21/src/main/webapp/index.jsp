<%-- 
    Document   : index
    Created on : 19 mar 2025, 17:51:20
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Máquina de Helados.</h1>
        <p>Seleccione los porcentajes para preparar un halado a su gusto</p>
        <form action="helado.jsp">
            <div class="contenedor">
                <div class="sabor">
                    <img src="Chocolate.jpg" alt="sabor-de-chocolate" width="200px"><br> 
                    Chocolate <input type="number" value="0" min="0" max="100" name="chocolate"> %
                </div>
                <div class="sabor">
                    <img src="fresas.jpg" alt="sabor-de-fresa" width="200px"><br> 
                    Fresa <input type="number" value="0" min="0" max="100" name="fresa"> %
                </div>
                <div class="sabor">
                    <img src="vainilla.jpg" alt="sabor-de-vainilla" width="235px"><br> 
                    Vainilla <input type="number" value="0" min="0" max="100" name="vainilla"> %
                </div>
            </div>
            <div class="contenedor">
                <input type="submit" value="Preparar Helado">
            </div>

        </form>

        <div class="error">
            <p>
                <%
                    if (session.getAttribute("error") != null) {
                        out.print(session.getAttribute("error"));
                        session.removeAttribute("error");
                    }
                %>
                <% session.removeAttribute("error");%>
            </p>
        </div>

    </body>
</html>

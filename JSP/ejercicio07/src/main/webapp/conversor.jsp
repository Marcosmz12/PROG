<%-- 
    Document   : conversor
    Created on : 19 mar 2025, 16:46:38
    Author     : nocturno
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 07</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="dinero">
            <h2>
                <%
                    Double c = Double.parseDouble(request.getParameter("cantidad"));
                    DecimalFormat formatoEuros = new DecimalFormat("0.00");
                    if (request.getParameter("cambio").equals("eurosEnPesetas")) {
                        out.print(formatoEuros.format(c) + " euros son " + Math.round(c * 166.386) + " pesetas");
                    } else {
                        out.print(Math.round(c) + " pesetas son " + formatoEuros.format(c / 166.386) + " euros.");
                    }
                %>
            </h2>
        </div>
    </body>
</html>

<%-- 
    Document   : cambia-colores.jsp
    Created on : 10 abr 2025, 20:37:55
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            Cookie cookieTexto = new Cookie("texto", request.getParameter("texto"));
            cookieTexto.setPath("/");
            cookieTexto.setMaxAge(365 * 60 * 60);
            response.addCookie(cookieTexto);
            Cookie cookieFondo = new Cookie("fondo", request.getParameter("fondo"));
            cookieFondo.setPath("/");
            cookieFondo.setMaxAge(365 * 60 * 60);
            response.addCookie(cookieFondo);
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>

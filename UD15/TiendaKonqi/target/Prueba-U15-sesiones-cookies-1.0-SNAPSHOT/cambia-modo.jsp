<%-- 
    Document   : cambia-modo.jsp
    Created on : 14 apr 2025, 18:29:06
    Author     : 1º DAM-T
--%>

<%
    // TODO: Establecemos en la sesión el atributo 'modo' con el valor del parámetro 'modo' de la petición HTTP recibida
    String nuevoModo = request.getParameter("modo");
    if (nuevoModo != null && !nuevoModo.isEmpty()) {
        session.setAttribute("modo", nuevoModo);
    }
    // Volvemos a index.jsp
    response.sendRedirect("index.jsp");
%>

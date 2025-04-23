<%-- 
    Document   : cambia-idioma.jsp
    Created on : 14 apr 2025, 18:29:06
    Author     : 1º DAM-T
--%>

<%
    // TODO: Establecemos en la sesión el atributo 'idioma' con el valor del parámetro 'idioma' de la petición HTTP recibida
    String nuevoIdioma = request.getParameter("idioma");
    if (nuevoIdioma != null && !nuevoIdioma.isEmpty()) {
        session.setAttribute("idioma", nuevoIdioma);
    }

    // Volvemos a index.jsp
    response.sendRedirect("index.jsp");
%>
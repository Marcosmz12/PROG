<%-- saludo3.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>¡Hola Caracola!</h1>
<% for (int i = 0; i < 10; i++) 
    if(i % 2 != 0)
    out.print(i + "<b><i> Esta línea se ha puesto en negrita y cursiva mediante Java.</i></b><br>");
    else 
    out.println("<br>");
    %>
</body>
</html>

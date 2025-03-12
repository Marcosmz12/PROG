<%-- tabla.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<h1>Ejemplo de tabla</h1>
<table border="4">
<tr>
    <td><b>Número</b></td><td>Cuadrado</td>
</tr>
<%
for(int i = 0; i < 12; i++) {
out.println("<tr>");
out.println("<td>" + i + "</td>");
out.println("<td>");
out.println(i * i);
out.println("</td></tr>");
}
%>
</table>
</body>
</html>
<%-- 
    Document   : compra.jsp
    Created on : 14 apr 2025, 18:29:06
    Author     : 1º DAM-T
--%>

<%@page import="tienda.Carrito"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%
    // TODO: Declara una variable entera e inicialízala con el valor (convertido a entero) del parámetro 'codigo' (sin tilde) de la petición HTTP
    int codigo = Integer.parseInt(request.getParameter("codigo"));
    // Declara una variable de la clase Cookie y guarda en ella el resultado de obtener la cookie 'carrito' 
    Cookie carritoCookie = dameCookie(request, "carrito");
    //Obtén una instancia de la clase ObjectMapper
    ObjectMapper objectMapper = new ObjectMapper();
    // Guarda en una variable el resultado de descodificar la cadena UTF-8 guardada en la cookie
    // Declara una variable de la clase Carrito y guarda en ella el resultado de deserializar la cadena anterior
    Carrito carrito = null;
    if (carritoCookie != null) {
        String carritoJson = URLDecoder.decode(carritoCookie.getValue(), "UTF-8");
        carrito = objectMapper.readValue(carritoJson, Carrito.class);
    } else {
        carrito = new Carrito(); // Creamos un carrito vacío si no existe la cookie
    }
    // Añade el producto con el código obtenido en la instancia de Carrito anterior
    carrito.meteProductoConCodigo(codigo);

    // TODO: Guardamos en una cadena con formato JSON el resultado de serializar el contenido del carrito actualizado
    String carritoActualizadoJson = objectMapper.writeValueAsString(carrito);
    // TODO: Codificamos en UTF-8 la cadena anterior
    String carritoCodificado = URLEncoder.encode(carritoActualizadoJson, "UTF-8");
    // TODO: Creamos una nueva cookie 'carrito' donde guardamos la cadena anterior
    carritoCookie = new Cookie("carrito", carritoCodificado);
    // TODO: Establecemos la visibilidad (path) y tiempo de vida de la cookie
    carritoCookie.setPath("/");
    carritoCookie.setMaxAge(24 * 60 * 60);

    // Pedimos al navegador que guarde la cookie
    response.addCookie(carritoCookie);
    // Volvemos a index.jsp
    response.sendRedirect("index.jsp");
%>

<!-- Función auxiliar -->
<%!
    public static Cookie dameCookie(HttpServletRequest request, String nombre) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(nombre)) {
                    return cookie;
                }
            }
        }
        return null;
    }
%>
<%-- 
    Document   : index.jsp
    Created on : 14 apr 2025, 18:29:06
    Author     : 1º DAM-T
--%>

<%@page import="tienda.Carrito"%>
<%@page import="tienda.ElementoDeCarrito"%>
<%@page import="tienda.Producto"%>
<%@page import="tienda.Catálogo"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    // Declarar una variable idioma e inicializarla (es / en)
    String idioma = "es";

    // Si desde la sesión no podemos obtener el atributo 'idioma', lo establecemos
    // En otro caso, recuperamos y guardamos su valor en la variable idioma.
    if (session.getAttribute("idioma") == null) {
        session.setAttribute("idioma", "en");
    } else {
        idioma = (String) session.getAttribute("idioma");
        if (!idioma.equals("es") && !idioma.equals("en")) {
            idioma = "en"; // Valor por defecto
        }
    }
    // Declarar una variable modo e inicializarla (claro / oscuro)
    String modo = "claro";
    // Si desde la sesión no podemos obtener el atributo 'modo', lo establecemos
    // En otro caso, recuperamos y guardamos su valor en la variable modo.
    if (session.getAttribute("modo") == null) {
        session.setAttribute("modo", modo);
    } else {
        modo = (String) session.getAttribute("modo");
        if (!modo.equals("claro") && !modo.equals("oscuro")) {
            modo = "claro"; // Valor por defecto
        }
    }
%>      

<!DOCTYPE html>
<html lang="<%= idioma.equals("es") ? "es" : "en"%>" data-theme="<%= modo.equals("claro") ? "claro" : "oscuro"%>">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title><%= idioma.equals("es") ? "Mi Tienda" : "My Shop"%></title>
        <!-- Bootstrap 5 -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Fuentes -->
        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;600&display=swap" rel="stylesheet">
        <!-- Estilos propios -->
        <link href="css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <%-- Conmutadores para idioma y modo claro/oscuro  --%>
        <div class="container d-flex justify-content-between align-items-center mb-3">
            <div class="language-switch">
                <a href="cambia-idioma.jsp?idioma=es"><img src="img/es.svg" width="30" height="20" alt="Español"></a>
                <a href="cambia-idioma.jsp?idioma=en"><img src="img/en.svg" width="30" height="20" alt="English"></a>
            </div>
            <div class="theme-toggle">
                <% if (modo.equals("claro")) {%>
                <a href="cambia-modo.jsp?modo=oscuro" class="text-decoration-none">
                    🌙 <span id="theme-label"><%=idioma.equals("es") ? "Modo oscuro" : "Dark mode"%></span>
                </a>
                <%  } else {%>
                <a href="cambia-modo.jsp?modo=claro" class="text-decoration-none">
                    🌞 <span id="theme-label"><%=idioma.equals("es") ? "Modo claro" : "Ligth mode"%></span>
                </a>
                <% }%>
            </div>
        </div>


        <div class="container">
            <h1 class="text-center">
                <%=idioma.equals("es") ? "Bienvenidos a Mi Tienda" : "Welcome to My Shop"%>
            </h1>

            <div class="row">
                <!-- Catálogo -->
                <div class="col-lg-9">
                    <div class="row g-4">
                        <!-- Recuperamos todos los elementos del catálogo -->
                        <%
                            //Obtén una instancia de la clase Catálogo
                            //Carga los datos
                            Catálogo catalogo = new Catálogo();
                            catalogo.cargaDatos();
                            // Para cada uno de los productos del catálogo, colócalos (cada uno en un bloque div como el siguiente...)
                            for (Producto producto : catalogo.getProductos()) {
                        %>                        
                        <!-- Colocamos los elementos del catálogo -->
                        <div class="col-md-4">
                            <div class="card h-100">
                                <img src="img/<%= producto.getImagen()%>" class="card-img-top img-fluid w-100" alt="Producto">
                                <div class="card-body">
                                    <h5 class="card-title"><%= producto.getNombre()%></h5>
                                    <p class="card-text text-muted"><strong><%= producto.getPrecio()%> €</strong></p>
                                    <a href="compra.jsp?codigo=<%= producto.getCodigo()%>" class="btn btn-primary w-100">
                                        <%= idioma.equals("es") ? "Añadir al carrito" : "Add to cart"%>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <% }%>
                    </div>
                </div>

                <!-- Recuperamos los elementos del carrito desde una cookie -->
                <%
                    // Declara una variable de la clase Cookie y guarda en ella el resultado de obtener la cookie 'carrito'
                    Cookie carritoCookie = dameCookie(request, "carrito");
                    // Obtén una instancia de la clase ObjectMapper
                    // Declara una variable de la clase Carrito (sin inicializar)
                    ObjectMapper objectMapper = new ObjectMapper();
                    Carrito carrito = null;

                    // Si no pudimos obtener la cookie 'carrito' 
                    // Inicializamos carrito con un nuevo carrito vacío
                    // Guardamos en una cadena con formato JSON el resultado de serializar el contenido del carrito vacío
                    // Codificamos en UTF-8 la cadena anterior
                    // Creamos una nueva cookie 'carrito' donde guardamos la cadena anterior
                    // Establecemos la visibilidad (path) y tiempo de vida de la cookie
                    // Pedimos al navegador que guarde la cookie
                    // Si pudimos obtener la cookie 'carrito'
                    // Guarda en una variable el resultado de descodificar la cadena UTF-8 guardada en la cookie
                    //Guarda en la variable de la clase Carrito el resultado de deserializar la cadena anterior
                    if (carritoCookie == null) {
                        carrito = new Carrito();
                        String carritoJson = objectMapper.writeValueAsString(carrito);
                        carritoCookie = new Cookie("carrito", URLEncoder.encode(carritoJson, "UTF-8"));
                        carritoCookie.setPath("/");
                        carritoCookie.setMaxAge(24 * 60 * 60);
                        response.addCookie(carritoCookie);
                    } else {
                        String carritoJson = URLDecoder.decode(carritoCookie.getValue(), "UTF-8");
                        carrito = objectMapper.readValue(carritoJson, Carrito.class);
                    }
                %>

                <!-- Colocamos el carrito y sus elemenos en el documento -->
                <div class="col-lg-3">
                    <div class="carrito">
                        <h5><img src="img/cart.svg" width="24" alt="Carrito"> 
                            <%= idioma.equals("es") ? "Mi carrito" : "My cart"%>
                        </h5>
                        <%
                            // Si la variable de la clase Carrito estuviera vacía (no tuviera elementos), escribimos un texto como el siguiente (bloque div):
                            if (carrito == null || carrito.getElementos().isEmpty()) {
                        %>
                        <div class="text-center text-muted py-4">
                            <p><%= idioma.equals("es") ? "El carrito esta vacio" : "Your cart is empty"%></p>
                        </div>
                        <%
                            // En otro caso (hay elementos en el carrito)
                            // Colócalos (bucle) cada uno en un bloque div como el siguiente...
                        } else {
                            for (ElementoDeCarrito elemento : carrito.getElementos()) {
                        %>
                        <div class="card mb-3">
                            <div class="d-flex justify-content-center align-items-center">
                                <img src="img/<%= elemento.getProducto().getImagen()%>" class="card-img-top img-fluid w-75" alt="Producto">
                            </div>
                            <div class="card-body">
                                <p class="card-title mb-1"><%= elemento.getProducto().getNombre()%></p>
                                <p class="mb-1"><%= elemento.getProducto().getPrecio()%> €</p>
                                <p class="mb-2"><%= elemento.getCantidad()%> <%= idioma.equals("es") ? "unidades" : "units"%></p>
                                <a href="elimina.jsp?codigo=<%= elemento.getProducto().getCodigo()%>" class="btn btn-sm btn-danger w-100">
                                    <%= idioma.equals("es") ? "eliminar" : "remove"%>
                                </a>
                            </div>
                        </div>
                        <%
                                    // TODO: Cierra el 'FOR'
                                }
                                // TODO: Cierra el 'IF'
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>

        <!-- Espacio al final -->            
        <div class="container"><br></div>

        <!-- JavaScript -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>

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
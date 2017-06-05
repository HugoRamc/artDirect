<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="logica.Pelicula"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>


<%-- 
    Document   : busqueda aqui se mostraran series y peliculas que se encuentren en la base de datos
    Created on : 29/05/2017, 09:44:36 PM
    Author     : tona
--%>
<%
String parametro = request.getParameter("q");
System.out.println("El parametro de busqueda es: " + parametro);
ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
Conexion con = new Conexion();
ResultSet rs = con.consulta("spBuscar", parametro);
while (rs.next()) {
        Pelicula pel = new Pelicula();
        pel.setId(rs.getInt("idFilme"));
        pel.setTitulo(rs.getString("titulo"));
        pel.setCalificacion(rs.getDouble("puntuacion"));
        pel.setAutor();
        pel.setTipo(rs.getInt("tipo"));
        pel.setCategorias();
        peliculas.add(pel);
    }
con.cerrar();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container">
            <div class="page-header">
                <h2>Resultados de la busqueda: <%=parametro%></h2>
            </div>
            <%if (peliculas.size() != 0) {%>
            <div class = "list-group">
                <%
                for (Pelicula peli : peliculas) {
                %>
                <a href ="/artDirect/Ver?q=<%=peli.getId()%>" class = "list-group-item">
                    <h4 class = "list-group-item-heading">
                        <%=peli.getTitulo()%><br>
                        <p><small>by <strong><%=peli.getAutor()%></strong></small></p>
                    </h4>
                    <span class = "badge"><%=peli.getCalificacion()%></span>
                    <p class = "list-group-item-text">
                        <% if (peli.getTipo().equals("Pelicula")) {%>
                        Tipo: <span class="label label-info"><%=peli.getTipo()%></span>
                        <% }else { %>
                        Tipo: <span class="label label-success"><%=peli.getTipo()%></span>
                        <%
                        }
                        %>
                        Categoria:
                        <%for (String categoria: peli.getCategorias()) {
                        %>
                        <span class="label label-primary"><%=categoria%></span>
                        <%
                        }
                        %>
                    </p>
                </a>
                <%}%>
            </div>
            <%} else {%>
            <h3>No se encontraron resultados =(</h3>
            <%}%>
        </div>
    </body>
</html>

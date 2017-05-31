<%@page import="logica.Pelicula"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%-- 
    Document   : serie lo mismo que catalogo pero solo series
    Created on : 29/05/2017, 09:43:33 PM
    Author     : tona
--%>
<%
    Conexion con = new Conexion();
    ResultSet rs = con.consulta("spGetAllPeliculas");
    if (rs == null){
        System.out.println("NULL");
    }
    while (rs.next()) {
        System.out.println(rs.getString("titulo"));
    }
    ArrayList<Pelicula> peliculas = new ArrayList<>();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Series</title>
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
                <h2>Series cheveres</h2>
            </div>
            <div class = "list-group">
                <%
                for (Pelicula pel : peliculas) {
                %>
                <a href = "#" class = "list-group-item">
                    <h4 class = "list-group-item-heading">
                        <%=pel.titulo%><br>
                        <p><small>by <strong><%=pel.autor%></strong></small></p>
                    </h4>
                    <span class = "badge"><%=pel.calificacion%></span>
                    <p class = "list-group-item-text">
                        Tipo: <span class="label label-success"><%=pel.tipo%></span>
                        Categoria: 
                        <% for (String valor : pel.categorias) {
                            System.out.println(valor);
                        %>
                            <span class="label label-primary"><%=valor%></span>
                        <%
                        }%>
                    </p>
                </a>
                <%}%>
            </div>
        </div>
    </body>
</html>

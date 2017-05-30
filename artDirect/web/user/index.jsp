<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%-- 
    Document   : index para el usuario premium y artista donde se muestran peliculas/series
    Created on : 29/05/2017, 08:46:13 PM
    Author     : tona
--%>
<%
    // A esta pagina se deberia de mandar al usuario premium despues de iniciar sesion, y al artista si ya fue aprovado por el admin
    // Aqui declarar las variables de sesion para poder mostrar el menu correcto de navbarUsers y redirigir a otra pagina de ser necesario
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>artDirect</title>
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
                <h2>Peliculas y Series</h2>
            </div>
            <div class = "list-group">

                <a href = "#" class = "list-group-item">
                    <h4 class = "list-group-item-heading">
                        Pelicula generica
                        <p><small>by <strong>nombreArtistico</strong></small></p>
                    </h4>
                    <span class = "badge">9.5</span>
                    <p class = "list-group-item-text">
                        Tipo: <span class="label label-info">Pelicula</span>  Categoria: <span class="label label-primary">Ciencia Ficción</span>
                    </p>
                </a>

                <a href = "#" class = "list-group-item">
                    <h4 class = "list-group-item-heading">
                        Serie Generica<br>
                        <p><small>by <strong>nombreArtistico</strong></small></p>
                    </h4>
                    <span class = "badge">5.2</span>
                    <p class = "list-group-item-text">
                        Tipo: <span class="label label-success">Serie</span>  Categoria: <span class="label label-primary">Drama</span>
                    </p>
                </a>
            </div>
        </div>
    </body>
</html>

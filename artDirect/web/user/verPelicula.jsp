<%@page import="logica.Pelicula"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%-- 
    Document   : verPelicula lo mismo que verSerie pero en este no se mostrar la lista de capitulos
    Created on : 29/05/2017, 10:58:51 PM
    Author     : tona
--%>
<%
System.out.println("El id aqui es: " + session.getAttribute("idContenido"));
int idPelicula = (Integer)session.getAttribute("idContenido");
String email = "mail5@gmail.com"; // eseto se deberia de obtener de las variables de sesión
Conexion con = new Conexion();
ResultSet rs = con.consulta("spGetPelicula", idPelicula);
Pelicula pelicula = new Pelicula();
while (rs.next()) {
        pelicula.setId(rs.getInt("idFilme"));
        pelicula.setTitulo(rs.getString("titulo"));
        pelicula.setCalificacion(rs.getDouble("puntuacion"));
        //pelicula.setAutor(rs.getString("nombreArtistico"));
        pelicula.setTipo(rs.getInt("tipo"));
        pelicula.setCategorias();
    }
rs = con.consulta("spCheckFavorite", idPelicula, email);
if (rs.next()) {
    if (rs.getInt("favorito")!=0) {
        System.out.println("Favorito");
        pelicula.setEsFavorito(true);
    } else {
        System.out.println("NO favorito");
        pelicula.setEsFavorito(false);
    }
}
%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <h2>
                    <%=pelicula.getTitulo()%>
                    <p><small>by <strong>Nana</strong></small></p>
                </h2>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <div class="embed-responsive embed-responsive-16by9">
                        <video class="embed-responsive-item" controls="true">
                            <source src="http://techslides.com/demos/sample-videos/small.mp4" type="video/mp4">
                        </video>
                    </div>
                </div>
                <div class="col-md-4">
                    <h3>Calificación: <span class="label label-default"><%=pelicula.getCalificacion()%></span></h3>
                    <!--Cambiar por favorito y darle color rojo alv con btn-danger-->
                    <% if (pelicula.getEsFavorito()) { %>
                    <button type="button" class="btn btn-danger" id="btn-fav">
                        <span class="glyphicon glyphicon-heart" aria-hidden="true"></span> Quitar de Favoritos
                    </button>
                    <% } else {%>
                    <button type="button" class="btn btn-default" id="btn-fav">
                        <span class="glyphicon glyphicon-heart" aria-hidden="true"></span> Agregar a Favoritos
                    </button>
                    <%}%>
                    <p>
                    <div class="form-inline">
                        <input type="number" class="form-control" name="puntuacion" id="puntuacion" min-value="0" max-value="10" required/>
                        <input type="button" class="btn btn-primary" value="Puntuar" id="btn-calificar">
                    </div>
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>

<%@page import="logica.Pelicula"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%-- 
    Document   : favoritos (su nombre lo dice)
    Created on : 29/05/2017, 09:43:57 PM
    Author     : tona
--%>
<%
    // A esta pagina se deberia de mandar al usuario premium despues de iniciar sesion, y al artista si ya fue aprovado por el admin
    // Aqui declarar las variables de sesion para poder mostrar el menu correcto de navbarUsers y redirigir a otra pagina de ser necesario
    Conexion con = new Conexion();
    String email = "mail5@gmail.com"; // eseto se deberia de obtener de las variables de sesión
    ResultSet rs = con.consulta("spGetFavorites", email);
    /*
select f.idFilme, f.titulo, f.puntuacion, cine.nombreArtistico, f.tipo 
from tblfilme f 
inner join tbldirectores d on d.idFilme=f.idFilme
inner join tblcineastas cine on cine.idCineasta=d.idCineasta;
    */
    if (rs == null){
        System.out.println("NULL");
    }
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    while (rs.next()) {
        Pelicula pel = new Pelicula();
        pel.setId(rs.getInt("idFilme"));
        pel.setTitulo(rs.getString("titulo"));
        pel.setCalificacion(rs.getDouble("puntuacion"));
        //pel.setAutor(rs.getString("nombreArtistico"));
        pel.setTipo(rs.getInt("tipo"));
        pel.setCategorias();
        peliculas.add(pel);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis Favoritos</title>
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
                <h2>Mis Favoritos</h2>
            </div>
            <div class = "list-group">
                <%
                for (Pelicula peli : peliculas) {
                %>
                <a href = "#" class = "list-group-item">
                    <h4 class = "list-group-item-heading">
                        <%=peli.titulo%><br>
                        <p><small>by <strong><%=peli.autor%></strong></small></p>
                    </h4>
                    <span class = "badge"><%=peli.calificacion%></span>
                    <p class = "list-group-item-text">
                        <% if (peli.tipo.equals("Pelicula")) {%>
                        Tipo: <span class="label label-info"><%=peli.tipo%></span>
                        <% }else { %>
                        Tipo: <span class="label label-success"><%=peli.tipo%></span>
                        <%
                        }
                        %>
                        Categoria:
                        <%for (String categoria: peli.getCategorias()) {
                            System.out.println(categoria);
                        %>
                        <span class="label label-primary"><%=categoria%></span>
                        <%
                        }
                        %>
                    </p>
                </a>
                <%}%>
            </div>
        </div>
    </body>
</html>

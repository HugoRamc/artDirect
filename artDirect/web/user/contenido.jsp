<%@page import="java.util.ArrayList"%>
<%@page import="logica.Pelicula"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%@page session="true"%>
<%-- 
    Document   : index para el usuario premium y artista donde se muestran peliculas/series
    Created on : 29/05/2017, 08:46:13 PM
    Author     : tona
--%>
<%
    //validacion de las sesiones
    try
    {
        Object dat = request.getSession().getAttribute("correoUsu");
        Object tipo = request.getSession().getAttribute("tipoUsuario");
        System.out.println(tipo);
         if(dat==null || !tipo.toString().equals("cineasta")){
           response.sendRedirect("../index.jsp");
        }
    }catch(Exception ex){
        response.sendRedirect("../index.jsp");
    }
    
    Conexion con = new Conexion();
    ResultSet rs = con.consulta("spGetAllArtista", (String)request.getSession().getAttribute("correoUsu"));

    if (rs == null){
        System.out.println("NULL");
    }
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
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
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>artDirect</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <script src="../js/jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/agregarFilme.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
        <link rel="stylesheet" href="../css/altaFilme.css"/>
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container">
            <div class="page-header">
                <div class="row">
                    <div class="col-xs-8">
                        <h2>Mis Peliculas y Series</h2>
                    </div>
                    <div class="col-xs-4">
                        <form method="post" action="agregarFilme.jsp">
                            <button class="btn btn-success btnAgregar">Agregar</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class = "list-group">
                <%
                for (Pelicula peli : peliculas) {
                    int id = peli.getId();
                    String nom = peli.getTitulo();
                %>
                <a href ="/Ver?q=<%=peli.getId()%>" class = "list-group-item">
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
                    <div class="opciones-artista">
                    <%
                        if(peli.getTipo().equals("Serie")){
                            
                    %>
                    <form action="agregarEpisodio.jsp" style="display: inline-block">
                        <input type="hidden" name="idSerie" value="<%=id%>">
                        <input type="hidden" name="nombreSerie" value="<%=nom%>">
                        <input type="submit" name="aCapitulos" value="Agregar capítulos" class="btn btn-primary">
                    </form>
                    
                    <%
                        }
                    %>
                    <form action="/artDirect/EliminarFilme" style="display: inline-block">
                        <input type="hidden" name="idSerie" value="<%=id%>">
                        <button name="eliminarFilme" class="btn btn-default btnBorrar">Eliminar</button>
                    </form>
                    </div>
                </a>
                        
                <%}%>
            </div>
        </div>
    </body>
</html>

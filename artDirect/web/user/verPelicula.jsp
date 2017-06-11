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
String email = request.getSession().getAttribute("correoUsu").toString();
Conexion con = new Conexion();
ServletContext context = request.getSession().getServletContext();
ResultSet rs = con.consulta("spGetPelicula", idPelicula);
Pelicula pelicula = new Pelicula();
while (rs.next()) {
        pelicula.setId(rs.getInt("idFilme"));
        pelicula.setTitulo(rs.getString("titulo"));
        pelicula.setCalificacion(rs.getDouble("puntuacion"));
        pelicula.setAutor();
        pelicula.setTipo(rs.getInt("tipo"));
        pelicula.setCategorias();
        pelicula.setUrl("../videos/" + rs.getString("ruta"));
        System.out.println("../videos/" + rs.getString("ruta"));
        pelicula.setPuntuacionUsuario(email);
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
con.cerrar();
%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=pelicula.getTitulo()%></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <script src="../js/jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container">
            <div class="page-header">
                <input type="text" value="<%=pelicula.getId()%>" id="peli-id" hidden>
                <h2>
                    <%=pelicula.getTitulo()%>
                    <p><small>by <strong><%=pelicula.getAutor()%></strong></small></p>
                </h2>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <div class="embed-responsive embed-responsive-16by9">
                        <video class="embed-responsive-item" controls>
                            <source src="<%=pelicula.getUrl()%>" type="video/avi">
                            <source src="<%=pelicula.getUrl()%>" type="video/mp4">
                            <source src="<%=pelicula.getUrl()%>" type="video/ogg">
                        </video>
                    </div>
                </div>
                <div class="col-md-4">
                    <h3>Calificación: <span class="label label-default" id="puntaje"><%=pelicula.getCalificacion()%></span></h3>
                    <!--Cambiar por favorito y darle color rojo alv con btn-danger-->
                    <% if (pelicula.getEsFavorito()) { %>
                    <input type="button" class="btn btn-danger" id="btn-fav" value="Quitar de Favoritos">
                    <% } else {%>
                    <input type="button" class="btn btn-default" id="btn-fav" value="Agregar a Favoritos">
                    <%}%>
                    <p>
                    <div class="form-inline">
                        <input type="number" class="form-control" name="puntuacion" id="puntuacion" min-value="0" max-value="10" required value="<%=pelicula.getPuntuacionUsuario()%>"/>
                        <input type="button" class="btn btn-primary" value="Puntuar" id="btn-calificar">
                    </div>
                    </p>
                </div>
            </div>
        </div>
        <br>
        <script>
      $("#btn-fav").on('click', function (e) {
          e.preventDefault();
          console.log("Hola");
          
          $.ajax({
              url: "/artDirect/Favorito",
              type: "POST",
              data: {"film": $('#peli-id').val()},
              success: function (json) {
                  console.log("Es favorito: " + json.favorito);
                  if (json.favorito){
                      $("#btn-fav").val("Quitar de Favoritos");
                      $("#btn-fav").addClass("btn-danger");
                        $("#btn-fav").removeClass("btn-default");
                  }else{
                      $("#btn-fav").val("Agregar a Favoritos");
                      $("#btn-fav").addClass("btn-default");
                    $("#btn-fav").removeClass("btn-danger");
                  }
              },
              error: function (xhr, errmsg, err) {
                  console.log("ERROR: " + err);
                  console.log("ERROR MESSAGE: " + errmsg);
                  console.log(xhr.status + ': ' + xhr.responseText)
              }
          });
      });
      $("#btn-calificar").on('click', function (e) {
          e.preventDefault();
          $.ajax({
              url: "/artDirect/Calificar",
              type: "POST",
              data: {
                  "film": $('#peli-id').val(),
                  "calificacion": $('#puntuacion').val().split(".")[0]
              },
              success: function (json) {
                  console.log("It works?: " + json.ok);
                  $('#puntaje').text(json.puntuacion);
                  $('#puntuacion').val(json.puntuacionUsuario);
              },
              error: function (xhr, errmsg, err) {
                  console.log("ERROR: " + err);
                  console.log("ERROR MESSAGE: " + errmsg);
                  console.log(xhr.status + ': ' + xhr.responseText)
              }
          });
      });
  </script>
    </body>
</html>

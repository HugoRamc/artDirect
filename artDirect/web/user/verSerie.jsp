<%@page import="logica.Serie"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%-- 
    Document   : verSerie en esta vista se mostrara la serie y su informacion ademas de que
    permitira calificar y agregar a favoritos y la lista de capitulos
    Created on : 29/05/2017, 10:59:01 PM
    Author     : tona
--%>
<%
System.out.println("El id aqui es: " + session.getAttribute("idContenido"));
int idSerie = (Integer)session.getAttribute("idContenido");
System.out.println("El email: " + session.getAttribute("correoUsu"));
String email = request.getSession().getAttribute("correoUsu").toString();
Conexion con = new Conexion();
ResultSet rs = con.consulta("spGetPelicula", idSerie);
Serie serie = new Serie();
while (rs.next()) {
        serie.setId(rs.getInt("idFilme"));
        serie.setTitulo(rs.getString("titulo"));
        serie.setCalificacion(rs.getDouble("puntuacion"));
        serie.setAutor();
        serie.setTipo(rs.getInt("tipo"));
        serie.setCategorias();
        //serie.setEpisodios();
        serie.setPuntuacionUsuario(email);
}
rs = con.consulta("spCheckFavorite", idSerie, email);
if (rs.next()) {
    if (rs.getInt("favorito")!=0) {
        System.out.println("Favorito");
        serie.setEsFavorito(true);
    } else {
        System.out.println("NO favorito");
        serie.setEsFavorito(false);
    }
}
con.cerrar();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                 <input type="text" value="<%=serie.getId()%>" id="serie-id" hidden>
                <h2>
                <%=serie.getTitulo()%>
                <p><small>by <strong><%=serie.getAutor()%></strong></small></p>
                </h2>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <div class="embed-responsive embed-responsive-16by9">
                        <video class="embed-responsive-item" controls="true" id="reproductor">
                            <source src="http://techslides.com/demos/sample-videos/small.mp4" type="video/mp4">
                        </video>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="col-md-12">
                        <div class="list-group">
                            <a class="list-group-item active">Lista de episodios</a>
                            <a class="list-group-item">Episodio 1</a>
                            <a class="list-group-item">Episodio 2</a>
                            <a class="list-group-item">Episodio 3</a>
                            <a class="list-group-item">Episodio 4</a>
                            <a class="list-group-item">Episodio 5</a>
                            <a class="list-group-item">Episodio 6</a>
                        </div>
                    </div> 
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <h3>Calificación: <span class="label label-default" id="puntaje"><%=serie.getCalificacion()%></span></h3>
                </div>
                <div class="col-md-4">
                    <h3>
                        <!--Cambiar por favorito y darle color rojo alv con btn-danger-->
                        <% if (serie.getEsFavorito()) { %>
                        <input type="button" class="btn btn-danger" id="btn-fav" value="Quitar de Favoritos">
                        <% } else {%>
                        <input type="button" class="btn btn-default" id="btn-fav" value="Agregar a Favoritos">
                        <%}%>
                    </h3>
                </div>

                <div class="col-md-4">
                    <h3 class="form-inline">
                        <input type="number" class="form-control" name="puntuacion" id="puntuacion" min-value="0" max-value="10" value="<%=serie.getPuntuacionUsuario()%>"/>
                        <input type="button" class="btn btn-primary" value="Puntuar" id="btn-calificar" required>
                    </h3>
                </div>
            </div>
        </div>
                <script>
      $("#btn-fav").on('click', function (e) {
          e.preventDefault();
          console.log("Hola");
          
          $.ajax({
              url: "/artDirect/Favorito",
              type: "POST",
              data: {"film": $('#serie-id').val()},
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
                  "film": $('#serie-id').val(),
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

<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%-- 
    Document   : verSerie en esta vista se mostrara la serie y su informacion ademas de que
    permitira calificar y agregar a favoritos y la lista de capitulos
    Created on : 29/05/2017, 10:59:01 PM
    Author     : tona
--%>

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
                Nombre de la Serie
                <p><small>by <strong>Señor elegante</strong></small></p>
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
                    <h3>Calificación: <span class="label label-default">7.8</span></h3>
                </div>
                <div class="col-md-4">
                    <h3>
                        <!--Cambiar por favorito y darle color rojo alv con btn-danger-->
                        <button type="button" class="btn btn-default">
                            <span class="glyphicon glyphicon-heart" aria-hidden="true"></span> Agregar a Favoritos
                        </button>
                    </h3>
                </div>

                <div class="col-md-4">
                    <h3 class="form-inline">
                        <input type="number" class="form-control" name="puntuacion" id="puntuacion" min-value="0" max-value="10"/>
                        <input type="button" class="btn btn-primary" value="Puntuar" required>
                    </h3>
                </div>
            </div>
        </div>
    </body>
</html>

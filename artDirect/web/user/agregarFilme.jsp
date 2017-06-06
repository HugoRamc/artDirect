<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
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
        <script src="../js/agregarFilme.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
        <link rel="stylesheet" href="../css/altaFilme.css"/>
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container agregarFilme-contenedor">
            <div class="row">
                <div class="col-xs-3"></div>
                <div class="col-xs-6">
                    <div class="contenedor-filme">
                        <form class="formularioAgregar" action="/artDirect/agregarFilmeServlet" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for="name" class="control-label">Nombre de la película</label>
                                <input type="text" class="form-control" name="txtNombre" id="name"  placeholder="Nombre del filme" required/>
                            </div>
                            <div class="form-group">
                                <label for="desc" class="control-label">Descripción</label>
                                <textarea class="form-control desc" id="desc" name="desc"></textarea>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-xs-6 centrado">
                                        <input type="radio" class="opcion peli" name="tipo" id="peli" value="0" checked> <label for="peli">Película</label>
                                    </div>
                                    <div class="col-xs-6 centrado">
                                        <input type="radio" class="opcion serie" name="tipo" id="serie" value="1"> <label for="serie">Serie</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group puroCartelDeSantaALV">
                                <input type="file" name="archivo" class="agregarNuevo" required>
                            </div>
                            <div class="form-group">
                                <input type="submit" name="agregarNuevo" value="Agregar" class="btn btn-default agregarNuevo">
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-xs-3"></div>
            </div>
        </div>
    </body>
</html>

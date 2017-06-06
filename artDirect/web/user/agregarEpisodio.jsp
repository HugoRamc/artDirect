<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String agregarNuevo = request.getParameter("agregarNuevo");
    HttpSession sesion = request.getSession();
    String correo = (String)sesion.getAttribute("correoUsu");
    boolean nuevo = false;
    int idF = 0;
    String nombre;
            
    if(agregarNuevo != null){
        nuevo = true;
        
        nombre = request.getParameter("txtNombre");
        String desc = request.getParameter("desc");
        Conexion conectar = new Conexion();
        
        ResultSet s = conectar.consulta("spCrearFilme", correo, nombre, desc, 1);
        if(s.next()){
            idF = s.getInt("mensaje");
        }
        
        conectar.cerrar();
    }
    else{
        idF = Integer.parseInt(request.getParameter("idSerie"));
        nombre = request.getParameter("nombreSerie");
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
                    <div class="titulo-agregar">Agregar episodio a la serie: <%=nombre%></div>
                    <div class="contenedor-filme">
                        <form action="/artDirect/agregarEpisodioServlet" method="post" enctype="multipart/form-data">
                            <input type="hidden" value="<%=idF%>" name="idFilmeSerie">
                            <input type="hidden" value="<%=nombre%>" name="nombreSerie">
                            <div class="form-group">
                                <label for="name" class="control-label">Nombre del episodio</label>
                                <input type="text" class="form-control" name="nombreEpisodio" id="name"  placeholder="Nombre del episodio" required/>
                            </div>
                            <div class="form-group">
                                <label for="desc" class="control-label">Descripción</label>
                                <textarea class="form-control desc" id="desc" name="desc2"></textarea>
                            </div>
                            <div class="form-group puroCartelDeSantaALV">
                                <input type="file" name="archivoEpisodio" class="agregarNuevo" required>
                            </div>
                            <div class="form-group">
                                <input type="submit" name="agregarNuevoEpisodio" value="Agregar" class="btn btn-default agregarNuevo">
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-xs-3"></div>
            </div>
        </div>
    </body>
</html>

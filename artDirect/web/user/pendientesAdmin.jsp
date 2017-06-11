<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>artDirect</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <script src="../jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/agregarFilme.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
        <link rel="stylesheet" href="../css/admin.css"/>
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container">
            <div class="page-header">
                <h2>Solicitudes de artistas pendientes</h2>
            </div>
            <%
                Conexion conectar = new Conexion();
                ResultSet rs = conectar.consulta("spGetArtistasPendientes");
            %>
            <div class = "list-group">
                <%
                    String nombre = "";
                    String nombreA = "";
                    String idUsr = "";
                    while(rs.next()){
                        nombre = rs.getString("nombre");
                        nombreA = rs.getString("nombreArtistico");
                        idUsr = rs.getString("idUsuario");
                %>
                        
                <div class = "list-group-item">
                    <form action="/artDirect/AceptarRechazarArtista">
                        <input type="hidden" name="artistaAR" value="<%=idUsr%>">
                        <div class="row">
                            <div class="col-xs-7">
                                <div class="row">
                                    <div class="col-xs-4"><strong>Nombre</strong><br><%=nombre%></div>
                                    <div class="col-xs-4"><strong>Correo</strong><br><%=idUsr%></div>
                                    <div class="col-xs-4"><strong>Nombre atístico</strong><br><%=nombreA%></div>
                                </div>
                            </div>
                            <div class="col-xs-5 botonesAdmin">
                                <button class="btn btn-primary botonSini" name="aceptarArtista">Aceptar</button>
                                <button class="btn btn-default botonSini" name="rechazarArtista">Rechazar</button>
                            </div>
                        </div>
                    </form>
                </div>
                        
                <%
                    }
                %>
            </div>
            
        </div>
    </body>
</html>

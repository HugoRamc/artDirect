<%@page import="logica.Pelicula"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try
    {
        Object dat = request.getSession().getAttribute("correoUsu");
        Object tipo = request.getSession().getAttribute("tipoUsuario");
        //out.print(tipo);
         if(dat==null){
           response.sendRedirect("../index.jsp");
        }
         if(!tipo.equals("administrador")){
             response.sendRedirect("../index.jsp");
         }
    }catch(Exception ex){
        response.sendRedirect("../index.jsp");
    }
    
    Conexion con = new Conexion();
    ResultSet rs = con.consulta("spGetAllFilmes");
    
    if (rs == null){
        System.out.println("NULL");
    }
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    ArrayList<String> idUsuarios = new ArrayList<String>();
    while (rs.next()) {
        Pelicula pel = new Pelicula();
        pel.setId(rs.getInt("idFilme"));
        pel.setTitulo(rs.getString("titulo"));
        pel.setCalificacion(rs.getDouble("puntuacion"));
        pel.setAutor();
        pel.setTipo(rs.getInt("tipo"));
        pel.setCategorias();
        peliculas.add(pel);
        idUsuarios.add(rs.getString("idUsuario"));
    }

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
        <link rel="stylesheet" href="../css/altaFilme.css"/>
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container">
            <div class="page-header">
                <h2>Peliculas y Series</h2>
            </div>
            <div class = "list-group">
                <%
                    int contador = 0;
                for (Pelicula peli : peliculas) {
                    int id = peli.getId();
                    String idUs = idUsuarios.get(contador);
                    contador++;
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
                        <form action="/artDirect/EliminarFilme" style="display: inline-block">
                            <input type="hidden" name="idSerie" value="<%=id%>">
                            <input type="hidden" name="idUs" value="<%=idUs%>">
                            <input type="hidden" name="idUs">
                            <button name="eliminarFilme" class="btn btn-default btnBorrar">Eliminar</button>
                        </form>
                    </div>
                </a>
                <%}%>
            </div>
        </div>
    </body>
</html>

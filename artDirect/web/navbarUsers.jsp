<!-- Esta barra sera para todos los usuarios (normal, premium, artista y admin)-->
<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%@page session="true"%>
<%// Esto debe de ser remplazado por una variable de sesion
    //verificar las variables de sesion
    //String tipo = "hola";
        //Object tipo;
        Object tipo = request.getSession().getAttribute("tipoUsuario");
        //out.print(tip);
        //tipo = request.getParameter("tipoUsuario");
        if((tipo!=null)){
            System.out.println(tipo.toString());
           //response.sendRedirect("../index.jsp");
%>


<nav class="navbar navbar-inverse navbar-custom">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><img src="../images/logo2.png"class="nav-bar-image"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <%
                    
                %>
                <li>
                    <a href="indexU.jsp">Inicio</a>
                </li>
                <li>
                    <a href="peliculas.jsp">Peliculas</a>
                </li>
                <li>
                    <a href="series.jsp">Series</a>
                </li>
                <li>
                    <a href="favoritos.jsp">Favoritos</a>
                </li>
                <li>
                    <a href="perfil.jsp">Perfil</a>
                </li>
                
                
                <%//si el usuario es cineasta
                    if(tipo!=null)
                    if(tipo.toString().equals("cineasta")){
                    %>
                <li>
                    <a href="contenido.jsp">Mi contenido</a>
                </li>
                <%
                    }
                    if(tipo!=null)
                    if(tipo.toString().equals("estandar")){
                    //imprimir parte del usuario estándar
                    %>
                <!--<li>
                    <a href="#">Mis Obras</a>
                </li>-->
                <%
                    }
                    if(tipo!=null)
                    if(tipo.toString().equals("premium")){
                    //imprimir la opcion del usuario premium
                    %>
                <!--<li>
                    <a href="#">Mis Obras</a>
                </li>-->
                <%
                    }
                %>

                
            </ul>
               
                <form class="navbar-form navbar-left" role="search" action="busqueda.jsp" >
                    <div class="input-group">
                        <input type="search" class="form-control" placeholder="Search" name="q">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </div>
                </form>
                <form action="/artDirect/redirige" method="post" class="navbar-form navbar-right">
                    <button type="submit" class="btn btn-default" aria-label="">
                        Salir
                        <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>
                    </button>
                    <input type="hidden" name="salir" value="1"/>
                </form>             
                <%
                }
                %>
            
        </div>
    </div>   
</nav>
                <style>
                </style>
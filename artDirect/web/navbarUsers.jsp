<!-- Esta barra sera para todos los usuarios (normal, premium, artista y admin)-->
<%String tipo="artista"; // Esto debe de ser remplazado por una variable de sesion%>
<nav class="navbar navbar-inverse navbar-custom">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="."><img src="../images/logo2.png"class="nav-bar-image"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <% if (tipo == "premium" || tipo=="artista"){
                    System.out.println("PREMIUM");
                %>
                <li>
                    <a href="index.jsp">Inicio</a>
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
                <%
                if (tipo == "artista") {
                    System.out.println("ARTISTA");
                %>
                <li>
                    <a href="#">Mis Obras</a>
                </li>
                <%
                }
                %>
                <li>
                    <a href="#">Perfil</a>
                </li>
                <%
                } else if (tipo == "normal") {
                    System.out.println("NORMAL");
                %>
                <li>
                    <a href="#">Perfil</a>
                </li>
                <%
                } else if (tipo == "admin") {
                    System.out.println("ADMIN");
                %>
                <li>
                    <a href="#">Usuarios</a>
                </li>
                <li>
                    <a href="#">Contenido</a>
                </li>
                <%
                }
                %>
            </ul>
            <div class="col-sm-3 col-md-3 navbar-right">
                <form class="navbar-form" role="search">
                    <div class="input-group">
                        <input type="search" class="form-control" placeholder="Search" name="q">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>   
</nav>

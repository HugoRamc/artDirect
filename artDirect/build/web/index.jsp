<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>artDirect</title>
    <link rel="icon" href="images/logo1.png">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/barra.css">
</head>
<body>
    <nav class="navbar navbar-inverse navbar-custom">
        <div class="container-fluid">
            <div class="navbar-header">
            <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
                <a class="navbar-brand" href="."><img src="images/logo2.png"class="nav-bar-image"></a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li>
                    <a href="index.jsp" >Inicio</a>
                </li>
                <li>
                    <a href="#">Peliculas</a></li>
                <li>
                    <a href="indexUsuario.jsp">Series</a></li>
                <li>
                    <a href="#">Contacto</a></li>
                <li>
                    <a href="#" data-toggle="modal" data-target="#myModal">Iniciar Sesión</a></li>
                <li><a href="alta.jsp">Registrarse</a></li>
            </ul>
        </div>
        </div>   
    </nav>
    <section>
        <section id="fotoInicio">
            <h1>artDirect</h1> <br>
            <h2>*inserte frase con doble sentido</h2>
        </section>
        <section class="row">
            <div class="">
                ¿Que es artDirect?
            </div>
        </section>
    </section>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">x</span></button>
                    <h4 class="modal-title" id="lineModalLabel">Iniciar Sesión</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="form-group">
                            <label for="txtNom">Correo electrónico</label>
                            <input type="email" class="form-control" id="txtNom">
                        </div>
                        <div class="form-group">
                            <label for="txtPass">Contraseña</label>
                            <input type="password" class="form-control" id="txtPass">
                        </div>
                            <input type="submit" class="btn btn-info" value="Iniciar Sesión">
                            <input type="button" class="btn btn-danger" data-dismiss="modal" value="Cerrar">
                        
                    </form>
                </div>
                <div class="modal-footer">
                    
                </div>
            </div>
        </div>
    </div>
    <footer>
        <section class="row2">
            <h1>Nuestro Equipo:</h1>
            <div class="imagen">
                <div class="centra">
                    <img src="images/jesus.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Jesus Magadán
            </div>
            <div class="imagen">
                <div class="centra">
                    <img src="images/hugo.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Hugo Ramírez <br>
                <a href="https://www.twitter.com/Hugoramc" target="_blank">@Hugoramc</a>
            </div>
            <div class="imagen">
                <div class="centra">
                    <img src="images/angel.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Ángel Soto
            </div>
            <div class="imagen">
                <div class="centra">
                    <img src="images/sebastian.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Sebastian Saldaña
            </div>
        </section>
        <section class="row3">
            <div class="imagen">
                <div class="centra">
                    <img src="images/carmen.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Carmen García
            </div>
            <div class="imagen">
                <div class="centra">
                    <img src="images/ian.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Ian Mendoza <br>
                <a href="https://www.twitter.com/Hugoramc" target="_blank"></a>
            </div>
            <div class="imagen">
                <div class="centra">
                    <img src="images/tona.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Tonatihu Barrera
            </div>
        </section>
    </footer>
</body>
</html>

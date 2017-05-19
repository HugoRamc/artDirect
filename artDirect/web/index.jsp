<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link rel="stylesheet" href="css/index.css">
        <script type="text/javascript" src="js/index.js"></script>
    </head>
    <body>
        <header>
            <div class="">
                <img src="images/logo.png" alt="">
            </div>
            <div class="">
                <nav>
                    <ul>
                        <li class="btn1"><a href="#" >Bienvenido</a></li>
                        <li class="btn2"><a href="#" >Mi Cuenta</a></li>
                        <li class="btn1"><a href="#" >Peliculas</a></li>
                        <li class="btn2"><a href="#" >Series</a></li>
                        <li class="btn1"><a href="#" >Contacto</a></li>
                        <li class="btn2"><input id="btnInicio" type="button" value="Iniciar Sesión" onclick="openModal()"/></li>
                        <li class="btn1"><a href="#">Registrarse</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <section>

            <section>
                <img src="images/palomitas.jpg" alt="">
            </section>
            <section class="row">
                <div class="">
                    as
                </div>
                <div class="">
                    asd
                </div>
                <div class="">
                    asda
                </div>
                <div class="">
                    asdas
                </div>
            </section>
        </section>
        <div id="myModal" class="modal">
            <div class="modal-content">
                <div class="modal-header">
                    Iniciar Sesión
                    <span class="close" id="close" onclick="closeModal()">&times;</span>
                </div>
                <div class="modal-text">
                    Nombre de Usuario o Correo electrónico <br>
                    <input type="text" id="txtCorreo" value=""><br>
                    Contraseña <br>
                    <input type="text" id="txtContra" value="">
                </div>
                <div class="modal-footer">

                </div>

            </div>
        </div>
        <footer>
            About Us:
            <section class="row">
                <div class="">
                    Jesus Magadán
                </div>
                <div class="">
                    Hugo Ramírez
                </div>
                <div class="">
                    Ángel Soto
                </div>
                <div class="">
                    Sebastian Saldaña
                </div>
            </section>

        </footer>
    </body>

</html>

<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>artDirect</title>
    <link rel="icon" href="images/logo1.png">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/barra.css">
</head>
<body>
    <%
        //traemos los atributos de sesion para validar si ya ha iniciado sesion
        Object dat = request.getSession().getAttribute("correoUsu");
        Object dat2 = request.getSession().getAttribute("tipoUsuario");
        if(dat!=null && dat2!=null){
            //out.print(dat.toString());
            if(dat2.toString().equals("administrador")){
                //si es usuario redirige al administrador
            }else{
                //si es usuario normal o cinesta redirecciona a la parte del usuario
                
                response.sendRedirect("user/indexU.jsp");
            }
                
            
            
        }
    
    %>
    <%@include file = "./navbar.jsp" %> <!--Para no poner la barra en cada html-->
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
    <footer>
        <!--<section class="row2">
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
                <!--<a href="https://www.twitter.com/Hugoramc" target="_blank">@Hugoramc</a>
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
        </section>-->
        <section class="row2">
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
            </div>
            <div class="imagen">
                <div class="centra">
                    <img src="images/tona.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Tonatihu Barrera
            </div>
             <div class="imagen">
                <div class="centra">
                    <img src="images/hugo.jpg" class="img-circle img-responsive tamFoto"/><br>
                </div>
                Hugo Ramírez <br>
                <!--<a href="https://www.twitter.com/Hugoramc" target="_blank">@Hugoramc</a>-->
            </div>
        </section>
    </footer>
</body>
</html>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Index</title>
        <link rel="icon" href="images/logo1.png">
        <link rel="stylesheet" href="css/index.css">
        <link rel="stylesheet" href="css/barra.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <body>
        <header>      
                <nav class="navbar navbar-toggleable-md navbar-light">
                    
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <img src="images/logo2.png" alt="" class="logoIMG">

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                      <a class="nav-link navbar-brand" href="index.jsp" >Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link navbar-brand">Peliculas</a></li>
                    <li class="nav-item">
                        <a href="indexUsuario.jsp" class="nav-link navbar-brand">Series</a></li>
                    <li class="nav-item">
                        <a href="#" class="nav-link navbar-brand">Contacto</a></li>
                    <li class="nav-item">
                        <a id="btnInicio" href="#" data-toggle="modal" data-target="#myModal" class="nav-link navbar-brand">Iniciar Sesión</a></li>
                    <li class="nav-item"><a href="alta.jsp" class="nav-link navbar-brand">Registrarse</a></li>
                  </ul>
                </div>
              </nav>
            
            
        </header>
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
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
              <h4 class="modal-title" id="myModalLabel">Iniciar Sesión</h4>
            </div>
            <div class="modal-body">
                <form>
                    <fieldset>
                        Nombre de Usuario o correo electrónico <br>
                        <input type="text" id="txtNom">
                    </fieldset>
                    <fieldset>
                        Contraseña <br>
                        <input type="text" id="txtPass">
                    </fieldset>
                    
                    
                    
                    
                </form>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn" data-dismiss="modal">Cerrar</button>
              <button type="button" class="btn">Iniciar Sesión</button>
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
        <br><br><br><br><br><br><br><br><br>
    </body>

</html>

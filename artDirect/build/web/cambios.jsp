<html> 
<head> 
<title>Cambios del Cinefilo</title> 
<meta charset="utf-8">
<link rel="icon" href="images/logo1.png">
<link rel="stylesheet" href="css/alta.css">
<script src="js/alta.js"></script>
<link rel="stylesheet" href="css/barra.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head> 
<body class="dos">
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
<form action="" method="POST" name="alta" required>
    
    <h1>Cambio de datos del cinéfilo</h1>
	<table class="uno" align="center" required>
		
		<tr>
			<td id="fila1">Nuevo  Nombre  <input type="text" class="form-control" name="txt" id="txt" required> <hr></td>

		</tr>
		<tr>
			<td>Ingresa tus Nuevos Apellidos  <input type="text" class="form-control" name="txt2" id="txt2" required> <hr> </td>

		</tr>

		<tr>
			<td>Cambiar Fecha de Nacimiento<input type="date" class="form-control" name="txt3" id="txt3" required><hr></td>

		</tr>

		<tr>
			<td>Cambiar de Pais  <select name="txt4" id="txt4" class="form-control" required><option name="Canada">Canada</option>
											<option name="EspaÃ±a">España</option>
											<option name="Mexico">Mexico</option>
											<option name="Francia">Francia</option>
                            </select><br>

															<hr></td>

		</tr>


		<tr>
			<td>Ingresa tu Nuevo Nick   <input type="text" name="txt5" class="form-control" id="txt5" required> <hr> </td>

		</tr>

		<tr>
			<td>Ingresa una nueva Contraseña  <input type="password" class="form-control" name="clave1" id="clave1"  size="20" > <hr> </td>

		</tr>


		<tr>
                    <td>Confirmar Contraseña <input type="password" class="form-control" name="clave2"  id="clave2" size="20" ><br></td>

		
		</tr>
		<tr>
		<td id="abajo"><input name="Submit" class="btn btn-primary btn-lg" class="form-control" id="btn" type="submit" value="Enviar" onclick="return validar()"/> </td>
		</tr>


	</table>
<br> 
</form>






</body> 
</html>
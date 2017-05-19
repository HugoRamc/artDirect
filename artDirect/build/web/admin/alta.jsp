<html> 
<head> 
    <title>Alta del Cinefilo</title> 
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/alta.css">
    <script src="../js/alta.js"></script>
</head> 
<body class="dos">
<form action="" method="POST" name="alta" required>
	<table class="uno" align="center" required>
		<tr>
		<td >Alta de un usuario</td>
		</tr>
		<tr>
			<td >Bienvenido</td>

		</tr>
		<tr>
			<td>Ingresa tu Nombre  <input type="text" name="txt" id="txt" required> <hr></td>

		</tr>
		<tr>
			<td>Ingresa tus Apellidos  <input type="text" name="txt1" id="txt2" required> <hr> </td>

		</tr>

		<tr>
			<td>Fecha de Nacimiento<input type="date" name="txt3" id="txt3" required><hr></td>

		</tr>

		<tr>
			<td>Pais  <select name="txt4" id="txt4"  required><option name="Canada">Canada</option>
											<option name="España">España</option>
											<option name="Mexico">Mexico</option>
											<option name="Francia">Francia</option>

															<hr></td>

		</tr>


		<tr>
			<td>Ingresa tus Nick   <input type="text" name="txt5" id="txt5" required> <hr> </td>

		</tr>

		<tr>
			<td>Ingresa tu Contraseña  <input type="password" name="clave1" id="clave1" size="20" > <hr> </td>

		</tr>


		<tr>
			<td>Confirmar Contraseña <input type="password" name="clave2" id="clave2" size="20" > <hr> </td>

		
		</tr>
		<tr>
		<td>Enviar Registro  <input name="Submit" class="btn" id="btn" type="submit" value="Enviar" onclick="return validar()"/> </td>
		</tr>

	<tr>
		
		<td><input type="button"  class="btn" id="btn2" value="Comprobar si son iguales" onClick="comprobarClave()"></td>
	</tr>

	</table>
<br> 
</form>






</body> 
</html>
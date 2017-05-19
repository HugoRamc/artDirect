<html> 
<head> 
<title>Cambios del Cinefilo</title> 
<meta charset="utf-8">
<style type="text/css">
			
			.uno{

				font-family: Arial;
				font-size: 18px; 
				text-align: center;
				color: #FFFFFF;
				background: #727579;

				-webkit-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);
-moz-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);
box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);
border-radius: 12px 12px 12px 12px;
-moz-border-radius: 12px 12px 12px 12px;
-webkit-border-radius: 12px 12px 12px 12px;
border: 0px solid #000000;

			}
			.dos{
				font-family: Arial;
				font-size: 13 px;
				background: #2675D5;
				text-align: center;


			}
			.btn {
			   background: #b4ddb4; /* Old browsers */
background: -moz-linear-gradient(top, #b4ddb4 0%, #83c783 17%, #52b152 33%, #008a00 67%, #005700 83%, #002400 100%); /* FF3.6-15 */
background: -webkit-linear-gradient(top, #b4ddb4 0%,#83c783 17%,#52b152 33%,#008a00 67%,#005700 83%,#002400 100%); /* Chrome10-25,Safari5.1-6 */
background: linear-gradient(to bottom, #b4ddb4 0%,#83c783 17%,#52b152 33%,#008a00 67%,#005700 83%,#002400 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b4ddb4', endColorstr='#002400',GradientType=0 ); /* IE6-9 */
					font-size: 22px;
					color:white;
              .btn:hover {
	            box-shadow: 0px 4px 4px rgba(34,62,66,.5);
	          -webkit-transition: box-shadow 1s ease;
	        transition: box-shadow 1s ease;
          }
		</style>
<script> 
function comprobarClave(){ 
   	clave1 = document.alta.clave1.value 
   	clave2 = document.alta.clave2.value 

   	if (clave1 == clave2) 
      	alert("Las dos claves son iguales") 
   	else 
      	alert("Las dos claves son distintas Verificar") 
} 
</script> 
<script language="javascript" type="text/javascript">
function validar(){
 var texto = document.getElementById("textoEjemplo");
if (texto.length == 0){
alert("Datos imcompletos");
return false;
}
else return true;
}
</script>
</head> 



<body class="dos">
<form action="" method="POST" name="alta" required>
	<table class="uno" align="center" required>
		<tr>
		<td >Cambio de datos del Cinefilo</td>
		</tr>
		<tr>
			<td >Bienvenido de Nuevo</td>

		</tr>
		<tr>
			<td>Nuevo  Nombre  <input type="text" name="txt" id="txt" required> <hr></td>

		</tr>
		<tr>
			<td>Ingresa tus Nuevos Apellidos  <input type="text" name="txt2" id="txt2" required> <hr> </td>

		</tr>

		<tr>
			<td>Cambiar Fecha de Nacimiento<input type="date" name="txt3" id="txt3" required><hr></td>

		</tr>

		<tr>
			<td>Cambiar de Pais  <select name="txt4" id="txt4" required><option name="Canada">Canada</option>
											<option name="España">España</option>
											<option name="Mexico">Mexico</option>
											<option name="Francia">Francia</option>

															<hr></td>

		</tr>


		<tr>
			<td>Ingresa tu Nuevo Nick   <input type="text" name="txt5" id="txt5" required> <hr> </td>

		</tr>

		<tr>
			<td>Ingresa una nueva Contraseña  <input type="password" name="clave1" id="clave1"  size="20" > <hr> </td>

		</tr>


		<tr>
			<td>Confirmar Contraseña <input type="password" name="clave2"  id="clave2" size="20" > <hr> </td>

		
		</tr>
		<tr>
		<td>Enviar Cambios  <input name="Submit" class="btn" id="btn" type="submit" value="Enviar" onclick="return validar()"/> </td>
		</tr>

	<tr>
		
		<td><input type="button"  class="btn"  id="btn2" value="Comprobar si son iguales" onClick="comprobarClave()"></td>
	</tr>

	</table>
<br> 
</form>






</body> 
</html>
<%-- 
    Document   : registrarse
    Created on : 11/05/2017, 07:35:48 PM
    Author     : tevod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/registrarse.css">
    </head>
        <body background="images/2.jpg">

        <table align="center">
        <tr>
        <td><p class="estilo1">Registrate Cinefilo</p><hr>
        <p class="estilo3">Nombre <input type="text" name="Nombre">
        <p class="estilo3">Apellidos <input type="text" name="Apellidos">
        <p class="estilo3">Avatar <input type="email" name="email" required/>
        <p class="estilo3">Avatar <input type="text" name="Avatar">
        <p class="estilo3">Tipo de Usuario<select name="tipo">

        <option>Cinefilo</option>

        <option>Cineasta</option>

        <option>Administrador</option>

        </select>
        <p class="estilo3">Password<input type="password" name="password" required/>
        <p class="estilo3">Confirmar Password<input type="password" name="password" required/>


        <p class="estilo3"><input type=button onclick="pregunta()"  class="boton1" value="Enviar Registro">






</table>
<script language="JavaScript"> 
function pregunta(){ 
    if (confirm('¿Estas seguro de enviar este formulario?')){ 
       document.tuformulario.submit() 
    } 
} 
</script>

    </body>
</html>

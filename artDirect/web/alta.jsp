<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<!DOCTYPE html>
<html> 
<head> 
    <title>Alta del Cinefilo</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="icon" href="images/logo1.png">
    <link rel="stylesheet" href="css/alta.css">
    <link rel="stylesheet" href="css/barra.css">
    <script src="js/alta.js"></script>
</head> 
<body class="dos">
    <%@include file = "./navbar.jsp" %> <!--Para no repetir codigo-->
    <div class="container">
        <div class="row main">
            <div class="panel-heading">
               <div class="panel-title text-center">
                    <h1 class="title">Registro</h1>
                    <hr />
                </div>
            </div> 
            <div class="main-login main-center">
                <form class="form-horizontal" method="post" action="#">
                    <div class="form-group">
                        <label for="name" class="control-label">Nombre</label>
                        <input type="text" class="form-control" name="name" id="name"  placeholder="Nombre y Apellidos" required/>
                    </div>

                    <div class="form-group">
                        <label for="email" class="control-label">Correo Electronico</label>
                        <input type="text" class="form-control" name="email" id="email"  placeholder="Ingresa un email valido" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="password" class="control-label">Contraseña</label>
                        <input type="password" class="form-control" name="password" id="password"  placeholder="Constraseña" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="tarjeta" class="control-label">Tarjeta de credito</label>
                        <input type="text" class="form-control" name="tarjeta" id="tarjeta" maxlength="19" placeholder="XXXX XXXX XXXX XXXX" required/>
                    </div>
                    <div class="form-group">
                        <div class="form-group row">
                            <label for="cvv" class="col-md-1 control-label">CVV</label>
                            <div class="col-md-3">
                                <input type="text" class="form-control" name="cvv" id="cvv"  placeholder="CVV" required/>
                            </div>
                            <label for="mes" class="col-md-1 control-label">Mes</label>
                            <div class="col-md-3">
                                <select class="form-control" name="mes" id="mes" required>
                                    <option value="01">01</option>
                                    <option value="02">02</option>
                                    <option value="03">03</option>
                                    <option value="04">04</option>
                                    <option value="05">05</option>
                                    <option value="06">06</option>
                                    <option value="07">07</option>
                                    <option value="08">08</option>
                                    <option value="09">09</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </div>
                            <label for="year" class="col-md-1 control-label">Año</label>
                            <div class="col-md-3">
                                <select class="form-control" name="year" id="year" required>
                                    <%
                                    for (int i=17; i<36; i++){
                                    %>
                                    <option value="<%=i%>"><%=i%></option>
                                    <%
                                    }
                                    %>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="checkbox">
                            <label><input type="checkbox" name="tipo" value="1">¿Deseas registrarte como cineasta?</label>
                        </div>
                    </div>
                    
                    <div class="form-group ">
                        <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="Registrarse" required>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body> 
</html>
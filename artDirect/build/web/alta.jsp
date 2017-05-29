<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<!DOCTYPE html>
<html> 
<head> 
    <title>Alta del Cinefilo</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
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
                        <input type="text" class="form-control" name="name" id="name"  placeholder="Nombre y Apellidos"/>
                    </div>

                    <div class="form-group">
                        <label for="email" class="control-label">Correo Electronico</label>
                        <input type="text" class="form-control" name="email" id="email"  placeholder="Ingresa un email valido"/>
                    </div>
                    
                    <div class="form-group">
                        <label for="password" class="control-label">Contraseña</label>
                        <input type="password" class="form-control" name="password" id="password"  placeholder="Constraseña"/>
                    </div>
                    
                    <div class="form-group">
                        <label for="tarjeta" class="control-label">Tarjeta de credito</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <input type="text" class="form-control" name="tarjeta" id="tarjeta"  placeholder="Ingresa una tarjeta de credito"/>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="cvv" class="cols-sm-2 control-label">CVV</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <input type="text" class="form-control" name="cvv" id="cvv"  placeholder="CVV"/>
                            </div>
                        </div>
                        <label for="mes" class="cols-sm-2 control-label">Mes</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <input type="text" class="form-control" name="mes" id="mes"  placeholder="XX"/>
                            </div>
                        </div>
                    
                        <label for="year" class="cols-sm-2 control-label">Año</label>
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <input type="text" class="form-control" name="year" id="year"  placeholder="XXXX"/>
                            </div>
                        </div>
                    </div>
                    <div class="form-group ">
                        <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="Registrarse">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body> 
</html>
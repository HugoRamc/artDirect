<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page session="true"%>
<%
    //validacion de las sesiones
        Object dat = request.getSession().getAttribute("correoUsu");
        Object tip = request.getSession().getAttribute("tipoUsuario");
        //out.print(tipo);
        if(dat==null || tip==null){
           response.sendRedirect("../index.jsp");
        }
             
             String nombre,contra,tarjeta,cvv,mes="",year="";
             Conexion con = new Conexion();
             ResultSet s = con.consulta("spDatosUsuario", dat);
                     
             while(s.next()){
                nombre = s.getString("nombre");
                contra = s.getString("pass");
                tarjeta = s.getString("numTarjeta");
                cvv = s.getString("codSeguridad");
                mes = s.getString("fechaVenc").split("-")[1];
                year = s.getString("fechaVenc").split("-")[0];
                
                
             }
             out.print("El mes de la tarjeta   "+mes+" <br>");
                out.print("El año de la tarjeta   "+year+" <br>");
              
         %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>artDirect</title>
        <link rel="icon" href="../images/logo1.png">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <script src="../js/jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
            <link rel="stylesheet" href="../css/alta.css">
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
        <div class="container">
        <div class="row main">
            <div class="panel-heading">
               <div class="panel-title text-center">
                    <h1 class="title">Mis Datos</h1>
                    <hr />
                </div>
            </div> 
            <div class="main-login main-center">
               <!--Dar de alta al usuario-->
                <form class="form-horizontal" method="post" action="alta.jsp">
                    <div class="form-group">
                        <label for="name" class="control-label">Nombre</label>
                        <input type="text" class="form-control" name="txtNombre" id="name" value="<%%>"  placeholder="Nombre y Apellidos" required/>
                    </div>

                    <div class="form-group">
                        <label for="email" class="control-label">Correo Electronico</label>
                        <input type="text" class="form-control" name="txtEmail" id="email"  placeholder="Ingresa un email valido" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="password" class="control-label">Contraseña</label>
                        <input type="password" class="form-control" name="txtPassword" id="password"  placeholder="Constraseña" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="tarjeta" class="control-label">Tarjeta de credito</label>
                        <input type="text" class="form-control" name="txtTarjeta" id="tarjeta" maxlength="19" placeholder="XXXX XXXX XXXX XXXX" required/>
                    </div>
                    <div class="form-group">
                        <div class="form-group row">
                            <label for="cvv" class="col-md-1 control-label">CVV</label>
                            <div class="col-md-3">
                                <input type="text" class="form-control" name="txtcvv" id="cvv"  placeholder="CVV" required/>
                            </div>
                            <label for="mes" class="col-md-1 control-label">Mes</label>
                            <div class="col-md-3">
                                <select class="form-control" name="txtmes" id="mes" required>
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
                                <select class="form-control" name="txtyear" id="year" required>
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
                    <!--<div class="form-group">
                        <div class="checkbox">
                            <label><input type="checkbox" name="tipo" value="1">¿Deseas registrarte como cineasta?</label>
                        </div>
                    </div>-->
                    
                    <div class="form-group ">
                        <p>
                            <input type="submit" class="btn btn-primary btn-lg btn-block login-button" value="Cambiar Datos" name="submit" required>
                            <input type="submit" class="btn btn-danger btn-lg btn-block login-button" value="Eliminar Usuario" name="submit" required>
                            
                        </p>
                    </div>
                </form>
            </div>
        </div>
    </div>

       
        
    </body>
</html>

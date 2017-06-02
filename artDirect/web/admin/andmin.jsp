
<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Escom | Administrador ARTDIRECT| IPN</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"><style type="text/css">
</style></head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Administrador ARTDIRECT</a>
        </div>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Bienvenido <% %></a></li>
            <li><a href="login.html">salir</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Control de Usuarios</small></h1>
          </div>
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li class="active"></li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4">
            <div class="list-group">
              <a class="list-group-item active main-color-bg">
                 Repositorios
              </a>
              <a class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Administradores </a>
              <a class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Invitado </a>
              <a class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Nuevo </a>
            </div>

            <div class="list-group">
              <a class="list-group-item active main-color-bg">
                 Dar de alta
              </a>

              <form id="login list-group-item" action="altas" method="POST" class="well">
                <div class="form-group">
                  <label>Tipo</label>
                  <input type="text" name="Tipo" class="form-control" placeholder="(Admin)(Invitado)(Otro)">
                </div>
                <div class="form-group">
                  <label>Nombre(s)</label>
                  <input type="text" name="Nombre" class="form-control" placeholder="Tu nombre">
                </div>
                <div class="form-group">
                  <label>Apellidos</label>
                  <input type="text" name="Apellidos" class="form-control" placeholder="APELLIDO">
                </div>
                <div class="form-group">
                  <label>Id</label>
                  <input type="text" name="Id" class="form-control" placeholder="NUMERO ID">
                </div>
                  <div class="form-group">
                    <label>Email</label>
                    <input type="text" name="Email" class="form-control" placeholder="coreo.tuyo@gmail.com">
                  </div>
                  <div class="form-group">
                    <label>Contraseña</label>
                    <input type="password" name="Contrasena" class="form-control" placeholder="CONTRAE�A">
                  </div>
                  <button type="submit" name="enviar" class="btn btn-default btn-block">Dar de alta</button>
                </form>
            </div>
          </div>
		  
          <div class="col-md-8">
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Users</h3>
              </div>
              <div class="panel-body">
                <div class="row">
                      <div class="col-md-12">
                          <input class="form-control" type="text" placeholder="Filter Users...">
                      </div>
                </div>
                <br>
                <table class="table table-striped table-hover">
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Password</th>
                       
                        <th></th>
                      </tr>
                    <%
                        Conexion con = new Conexion();
                        ResultSet s = con.consulta("spMuestraUsuarios");
                        
                        while(s.next()){
                    %>
                      
                      <tr>
                        <td><%out.print(s.getString("nombre"));      %></td>
                        <td><%out.print(s.getString("idUsuario"));      %></td>
                        <td><%out.print(s.getString("pass"));      %></td>
                        <td><a class="btn btn-default" href="edit.html">Edit</a> <a class="btn btn-danger" href="#">Delete</a></td>
                      </tr>
                      
                      <%
                      }
                      %>
                      
                    </table>
					 <form id="login list-group-item" action="altas" method="POST" class="well">
                <div class="form-group">
                  <label>INGRESA TARJETA DE PAGO(16 NUM)</label>
                  <input type="text" name="Tipo" class="form-control" placeholder="1234123412341234">
                </div>
                <div class="form-group">
                  <label>BANCO</label>
                  <input type="text" name="Nombre" class="form-control" placeholder="BANCO">
                </div>
                <div class="form-group">
                  <label>CVV</label>
                  <input type="text" name="Apellidos" class="form-control" placeholder="CVV('123')">
                </div>
				<div class="form-group">
                  <label>VIGENCIA</label>
                  <input type="text" name="Apellidos" class="form-control" placeholder="MM/AA">
                </div>
              </div>
              </div>

          </div>
        </div>
      </div>
	  
	  
    </section>

    <footer id="footer">
      </footer>
  <script>
     CKEDITOR.replace( 'editor1' );
 </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>


<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Escom | Administrador ARTDIRECT| IPN</title>
    <link href="../css/style.css" rel="stylesheet">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"><style type="text/css">
</style></head>
  <body>
      <%@include file = "navBaradmin.jsp" %>

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
          <li class="active">**BIENVENIDO ADMINISTRADOR**</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-4">
<!--            <div class="list-group">
              <a class="list-group-item active main-color-bg">
                 Repositorios
              </a>
              <a class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Administradores </a>
              <a class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Invitado </a>
              <a class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Nuevo </a>
            </div>-->

            
          </div>
		  
          <div class="container-fluid">
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">USUARIOS</h3>
              </div>
              <div class="panel-body">
<!--                <div class="row">
                      <div class="col-md-12">
                          <input class="form-control" type="text" placeholder="Filter Users...">
                      </div>
                </div>-->
                <br>
                <table class="table table-striped table-hover">
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Password</th>
                        <th>Verificado</th>
                        <th>Avatar</th>
                        <th>Tipo de Usuario</th>
                        <th></th>
                      </tr>
                    <%
                        Conexion con = new Conexion();
                        ResultSet s = con.consulta("spMuestraUsuarios");
                        
                        while(s.next()){
                    %>
                       <script language="javascript">
function confirmDel()
{
  var agree=confirm("¿Realmente desea eliminarlo? ");
  if (agree) return true ;
  else
  //Y aquí pon cualquier cosa que quieras que salga si le diste al boton de cancelar
    alert('No se ha podido eliminar el registro')
  return false;
}


</script>

                      <tr>
                        <td><%out.print(s.getString("nombre"));      %></td>
                        <td><%out.print(s.getString("idUsuario"));      %></td>
                        <td><%out.print(s.getString("pass"));      %></td>
                        <td> <%out.print(s.getString("verificado"));      %></td>
                        <td> <%out.print(s.getString("tipousuario"));      %></td>
                        <td><a class="btn btn-default" href="cambios.jsp">Edit</a> <a class="btn btn-danger" onclick="confirmDel();" href="andmin.jsp">Delete</a></td>
                      </tr>
                      
                      <%
                      }
                      %>
                      
                    </table>
					
                
                
                
				
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

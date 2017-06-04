package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Conexion;

public final class andmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin/navBaradmin.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Escom | Administrador ARTDIRECT| IPN</title>\r\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/barra.css\">\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><style type=\"text/css\">\r\n");
      out.write("</style></head>\r\n");
      out.write("  <body>\r\n");
      out.write("      ");
      out.write("<nav class=\"navbar navbar-inverse navbar-custom\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button class=\"navbar-toggle collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"../index.jsp\"><img src=\"../images/logo2.png\"class=\"nav-bar-image\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Iniciar Sesión</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"../alta.jsp\">Registrarse</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>   \r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">x</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"lineModalLabel\">Iniciar Sesión</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"redirige.jsp\" method=\"post\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"login-email\">Correo electrónico</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"login-email\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"login-pass\">Contraseña</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"login-pass\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-info\" name=\"login-submit\" value=\"Iniciar Sesión\">\r\n");
      out.write("                    <input type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\" value=\"Cerrar\">\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-10\">\r\n");
      out.write("            <h1><span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span> Control de Usuarios</small></h1>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"breadcrumb\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("          <li class=\"active\">**BIENVENIDO ADMINISTRADOR**</li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-4\">\r\n");
      out.write("<!--            <div class=\"list-group\">\r\n");
      out.write("              <a class=\"list-group-item active main-color-bg\">\r\n");
      out.write("                 Repositorios\r\n");
      out.write("              </a>\r\n");
      out.write("              <a class=\"list-group-item\"><span class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></span> Administradores </a>\r\n");
      out.write("              <a class=\"list-group-item\"><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> Invitado </a>\r\n");
      out.write("              <a class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Nuevo </a>\r\n");
      out.write("            </div>-->\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("          <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("              <div class=\"panel-heading main-color-bg\">\r\n");
      out.write("                <h3 class=\"panel-title\">USUARIOS</h3>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"panel-body\">\r\n");
      out.write("<!--                <div class=\"row\">\r\n");
      out.write("                      <div class=\"col-md-12\">\r\n");
      out.write("                          <input class=\"form-control\" type=\"text\" placeholder=\"Filter Users...\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                </div>-->\r\n");
      out.write("                <br>\r\n");
      out.write("                <table class=\"table table-striped table-hover\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Name</th>\r\n");
      out.write("                        <th>Email</th>\r\n");
      out.write("                        <th>Password</th>\r\n");
      out.write("                        <th>Verificado</th>\r\n");
      out.write("                        <th>Avatar</th>\r\n");
      out.write("                        <th>Tipo de Usuario</th>\r\n");
      out.write("                        <th></th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    ");

                        Conexion con = new Conexion();
                        ResultSet s = con.consulta("spMuestraUsuarios");
                        
                        while(s.next()){
                    
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>");
out.print(s.getString("nombre"));      
      out.write("</td>\r\n");
      out.write("                        <td>");
out.print(s.getString("idUsuario"));      
      out.write("</td>\r\n");
      out.write("                        <td>");
out.print(s.getString("pass"));      
      out.write("</td>\r\n");
      out.write("                        <td> ");
out.print(s.getString("verificado"));      
      out.write("</td>\r\n");
      out.write("                        <td> ");
out.print(s.getString("avatar"));      
      out.write("</td>\r\n");
      out.write("                        <td> ");
out.print(s.getString("tipousuario"));      
      out.write("</td>\r\n");
      out.write("                        <td><a class=\"btn btn-default\" href=\"cambios.jsp\">Edit</a> <a class=\"btn btn-danger\" href=\"#\">Delete</a></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      \r\n");
      out.write("                      <script language=\"Javascript\">\r\n");
      out.write("function preguntar(){\r\n");
      out.write("   eliminar=confirm(\"¿Deseas eliminar este registro?\");\r\n");
      out.write("   if (eliminar)\r\n");
      out.write("   //Redireccionamos si das a aceptar\r\n");
      out.write("     window.location.href = \"delete.php?kdigo=valor\"; //página web a la que te redirecciona si confirmas la eliminación\r\n");
      out.write("else\r\n");
      out.write("  //Y aquí pon cualquier cosa que quieras que salga si le diste al boton de cancelar\r\n");
      out.write("    alert('No se ha podido eliminar el registro...')\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("                      \r\n");
      out.write("                    </table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("              </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("      </footer>\r\n");
      out.write("  <script>\r\n");
      out.write("     CKEDITOR.replace( 'editor1' );\r\n");
      out.write(" </script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

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
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><style type=\"text/css\">\r\n");
      out.write("</style></head>\r\n");
      out.write("  <body>\r\n");
      out.write("      ");
      out.write("<nav class=\"navbar navbar-inverse navbar-custom\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button class=\"navbar-toggle collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\".\"><img src=\"images/logo2.png\"class=\"nav-bar-image\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Iniciar Sesión</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"alta.jsp\">Registrarse</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>   \n");
      out.write("</nav>\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">x</span></button>\n");
      out.write("                <h4 class=\"modal-title\" id=\"lineModalLabel\">Iniciar Sesión</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form action=\"redirige.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"login-email\">Correo electrónico</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"login-email\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"login-pass\">Contraseña</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"login-pass\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-info\" name=\"login-submit\" value=\"Iniciar Sesión\">\n");
      out.write("                    <input type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\" value=\"Cerrar\">\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
      out.write("          <li class=\"active\"></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-4\">\r\n");
      out.write("            <div class=\"list-group\">\r\n");
      out.write("              <a class=\"list-group-item active main-color-bg\">\r\n");
      out.write("                 Repositorios\r\n");
      out.write("              </a>\r\n");
      out.write("              <a class=\"list-group-item\"><span class=\"glyphicon glyphicon-list-alt\" aria-hidden=\"true\"></span> Administradores </a>\r\n");
      out.write("              <a class=\"list-group-item\"><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> Invitado </a>\r\n");
      out.write("              <a class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Nuevo </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"list-group\">\r\n");
      out.write("              <a class=\"list-group-item active main-color-bg\">\r\n");
      out.write("                 Dar de alta\r\n");
      out.write("              </a>\r\n");
      out.write("\r\n");
      out.write("              <form id=\"login list-group-item\" action=\"altas\" method=\"POST\" class=\"well\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Tipo</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Tipo\" class=\"form-control\" placeholder=\"(Admin)(Invitado)(Otro)\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Nombre(s)</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Nombre\" class=\"form-control\" placeholder=\"Tu nombre\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Apellidos</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Apellidos\" class=\"form-control\" placeholder=\"APELLIDO\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Id</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Id\" class=\"form-control\" placeholder=\"NUMERO ID\">\r\n");
      out.write("                </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>Email</label>\r\n");
      out.write("                    <input type=\"text\" name=\"Email\" class=\"form-control\" placeholder=\"coreo.tuyo@gmail.com\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>ContraseÃ±a</label>\r\n");
      out.write("                    <input type=\"password\" name=\"Contrasena\" class=\"form-control\" placeholder=\"CONTRAEï¿½A\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <button type=\"submit\" name=\"enviar\" class=\"btn btn-default btn-block\">Dar de alta</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("          <div class=\"col-md-8\">\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("              <div class=\"panel-heading main-color-bg\">\r\n");
      out.write("                <h3 class=\"panel-title\">Users</h3>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"panel-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                      <div class=\"col-md-12\">\r\n");
      out.write("                          <input class=\"form-control\" type=\"text\" placeholder=\"Filter Users...\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <table class=\"table table-striped table-hover\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Name</th>\r\n");
      out.write("                        <th>Email</th>\r\n");
      out.write("                        <th>Password</th>\r\n");
      out.write("                       \r\n");
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
      out.write("                        <td><a class=\"btn btn-default\" href=\"edit.html\">Edit</a> <a class=\"btn btn-danger\" href=\"#\">Delete</a></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      \r\n");
      out.write("                      ");

                      }
                      
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("                    </table>\r\n");
      out.write("\t\t\t\t\t <form id=\"login list-group-item\" action=\"altas\" method=\"POST\" class=\"well\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>INGRESA TARJETA DE PAGO(16 NUM)</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Tipo\" class=\"form-control\" placeholder=\"1234123412341234\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>BANCO</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Nombre\" class=\"form-control\" placeholder=\"BANCO\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>CVV</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Apellidos\" class=\"form-control\" placeholder=\"CVV('123')\">\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                  <label>VIGENCIA</label>\r\n");
      out.write("                  <input type=\"text\" name=\"Apellidos\" class=\"form-control\" placeholder=\"MM/AA\">\r\n");
      out.write("                </div>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Index</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/logo1.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/barra.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" integrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <body>\n");
      out.write("        <header>      \n");
      out.write("                <nav class=\"navbar navbar-toggleable-md navbar-light\">\n");
      out.write("                    \n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <img src=\"images/logo2.png\" alt=\"\" class=\"logoIMG\">\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                  <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link navbar-brand\" href=\"index.jsp\" >Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link navbar-brand\">Peliculas</a></li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"indexUsuario.jsp\" class=\"nav-link navbar-brand\">Series</a></li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link navbar-brand\">Contacto</a></li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a id=\"btnInicio\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"nav-link navbar-brand\">Iniciar Sesión</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"alta.jsp\" class=\"nav-link navbar-brand\">Registrarse</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </nav>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <section id=\"fotoInicio\">\n");
      out.write("                \n");
      out.write("                <h1>artDirect</h1> <br>\n");
      out.write("                <h2>*inserte frase con doble sentido</h2>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"row\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    ¿Que es artDirect?\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("              <h4 class=\"modal-title\" id=\"myModalLabel\">Iniciar Sesión</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form>\n");
      out.write("                    <fieldset>\n");
      out.write("                        Nombre de Usuario o correo electrónico <br>\n");
      out.write("                        <input type=\"text\" id=\"txtNom\">\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        Contraseña <br>\n");
      out.write("                        <input type=\"text\" id=\"txtPass\">\n");
      out.write("                    </fieldset>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("              <button type=\"button\" class=\"btn\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("              <button type=\"button\" class=\"btn\">Iniciar Sesión</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("            <section class=\"row2\">\n");
      out.write("                <h1>Nuestro Equipo:</h1>\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                        <img src=\"images/jesus.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Jesus Magadán\n");
      out.write("                </div>\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                    <img src=\"images/hugo.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Hugo Ramírez <br>\n");
      out.write("                    <a href=\"https://www.twitter.com/Hugoramc\" target=\"_blank\">@Hugoramc</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                    <img src=\"images/angel.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Ángel Soto\n");
      out.write("                </div>\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                    <img src=\"images/sebastian.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Sebastian Saldaña\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"row3\">\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                        <img src=\"images/carmen.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Carmen García\n");
      out.write("                </div>\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                    <img src=\"images/ian.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Ian Mendoza <br>\n");
      out.write("                    <a href=\"https://www.twitter.com/Hugoramc\" target=\"_blank\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <div class=\"centra\">\n");
      out.write("                    <img src=\"images/tona.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                    Tonatihu Barrera\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alta_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html> \r\n");
      out.write("<head> \r\n");
      out.write("<title>Alta del Cinefilo</title> \r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"icon\" href=\"images/logo1.png\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/alta.css\">\r\n");
      out.write("<script src=\"js/alta.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/barra.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" integrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"dos\">\r\n");
      out.write("      <header>      \r\n");
      out.write("                <nav class=\"navbar navbar-toggleable-md navbar-light\">\r\n");
      out.write("                    \r\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <img src=\"images/logo2.png\" alt=\"\" class=\"logoIMG\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                  <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link navbar-brand\" href=\"index.jsp\" >Inicio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link navbar-brand\">Peliculas</a></li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"indexUsuario.jsp\" class=\"nav-link navbar-brand\">Series</a></li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link navbar-brand\">Contacto</a></li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a id=\"btnInicio\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"nav-link navbar-brand\">Iniciar Sesión</a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a href=\"alta.jsp\" class=\"nav-link navbar-brand\">Registrarse</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </nav>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("      </header><form action=\"\" method=\"POST\" name=\"alta\" required>\r\n");
      out.write("           \r\n");
      out.write("          <h1>Join artDirect&COPY;</h1>\r\n");
      out.write("          \r\n");
      out.write("\t<table class=\"uno\" align=\"center\" required>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >Bienvenido</td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ingresa tu Nombre  <input type=\"text\" name=\"txt\" id=\"txt\" required> <hr></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ingresa tus Apellidos  <input type=\"text\" name=\"txt1\" id=\"txt2\" required> <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Fecha de Nacimiento<input type=\"date\" name=\"txt3\" id=\"txt3\" required><hr></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Pais  <select name=\"txt4\" id=\"txt4\"  required><option name=\"Canada\">Canada</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option name=\"EspaÃ±a\">EspaÃ±a</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option name=\"Mexico\">Mexico</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option name=\"Francia\">Francia</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<hr></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ingresa tus Nick   <input type=\"text\" name=\"txt5\" id=\"txt5\" required> <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ingresa tu ContraseÃ±a  <input type=\"password\" name=\"clave1\" id=\"clave1\" size=\"20\" > <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Confirmar ContraseÃ±a <input type=\"password\" name=\"clave2\" id=\"clave2\" size=\"20\" > <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Enviar Registro  <input name=\"Submit\" class=\"btn\" id=\"btn\" type=\"submit\" value=\"Enviar\" onclick=\"return validar()\"/> </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<td><input type=\"button\"  class=\"btn\" id=\"btn2\" value=\"Comprobar si son iguales\" onClick=\"comprobarClave()\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("<br> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body> \r\n");
      out.write("</html>");
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

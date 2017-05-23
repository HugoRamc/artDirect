package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cambios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Cambios del Cinefilo</title> \r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.uno{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfont-family: Arial;\r\n");
      out.write("\t\t\t\tfont-size: 18px; \r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tcolor: #FFFFFF;\r\n");
      out.write("\t\t\t\tbackground: #727579;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t-webkit-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);\r\n");
      out.write("-moz-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);\r\n");
      out.write("box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);\r\n");
      out.write("border-radius: 12px 12px 12px 12px;\r\n");
      out.write("-moz-border-radius: 12px 12px 12px 12px;\r\n");
      out.write("-webkit-border-radius: 12px 12px 12px 12px;\r\n");
      out.write("border: 0px solid #000000;\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.dos{\r\n");
      out.write("\t\t\t\tfont-family: Arial;\r\n");
      out.write("\t\t\t\tfont-size: 13 px;\r\n");
      out.write("\t\t\t\tbackground: #2675D5;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.btn {\r\n");
      out.write("\t\t\t   background: #b4ddb4; /* Old browsers */\r\n");
      out.write("background: -moz-linear-gradient(top, #b4ddb4 0%, #83c783 17%, #52b152 33%, #008a00 67%, #005700 83%, #002400 100%); /* FF3.6-15 */\r\n");
      out.write("background: -webkit-linear-gradient(top, #b4ddb4 0%,#83c783 17%,#52b152 33%,#008a00 67%,#005700 83%,#002400 100%); /* Chrome10-25,Safari5.1-6 */\r\n");
      out.write("background: linear-gradient(to bottom, #b4ddb4 0%,#83c783 17%,#52b152 33%,#008a00 67%,#005700 83%,#002400 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */\r\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b4ddb4', endColorstr='#002400',GradientType=0 ); /* IE6-9 */\r\n");
      out.write("\t\t\t\t\tfont-size: 22px;\r\n");
      out.write("\t\t\t\t\tcolor:white;\r\n");
      out.write("              .btn:hover {\r\n");
      out.write("\t            box-shadow: 0px 4px 4px rgba(34,62,66,.5);\r\n");
      out.write("\t          -webkit-transition: box-shadow 1s ease;\r\n");
      out.write("\t        transition: box-shadow 1s ease;\r\n");
      out.write("          }\r\n");
      out.write("\t\t</style>\r\n");
      out.write("<script> \r\n");
      out.write("function comprobarClave(){ \r\n");
      out.write("   \tclave1 = document.alta.clave1.value \r\n");
      out.write("   \tclave2 = document.alta.clave2.value \r\n");
      out.write("\r\n");
      out.write("   \tif (clave1 == clave2) \r\n");
      out.write("      \talert(\"Las dos claves son iguales\") \r\n");
      out.write("   \telse \r\n");
      out.write("      \talert(\"Las dos claves son distintas Verificar\") \r\n");
      out.write("} \r\n");
      out.write("</script> \r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function validar(){\r\n");
      out.write(" var texto = document.getElementById(\"textoEjemplo\");\r\n");
      out.write("if (texto.length == 0){\r\n");
      out.write("alert(\"Datos imcompletos\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("else return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"dos\">\r\n");
      out.write("<form action=\"\" method=\"POST\" name=\"alta\" required>\r\n");
      out.write("\t<table class=\"uno\" align=\"center\" required>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td >Cambio de datos del Cinefilo</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >Bienvenido de Nuevo</td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Nuevo  Nombre  <input type=\"text\" name=\"txt\" id=\"txt\" required> <hr></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ingresa tus Nuevos Apellidos  <input type=\"text\" name=\"txt2\" id=\"txt2\" required> <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Cambiar Fecha de Nacimiento<input type=\"date\" name=\"txt3\" id=\"txt3\" required><hr></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Cambiar de Pais  <select name=\"txt4\" id=\"txt4\" required><option name=\"Canada\">Canada</option>\r\n");
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
      out.write("\t\t\t<td>Ingresa tu Nuevo Nick   <input type=\"text\" name=\"txt5\" id=\"txt5\" required> <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Ingresa una nueva ContraseÃ±a  <input type=\"password\" name=\"clave1\" id=\"clave1\"  size=\"20\" > <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Confirmar ContraseÃ±a <input type=\"password\" name=\"clave2\"  id=\"clave2\" size=\"20\" > <hr> </td>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Enviar Cambios  <input name=\"Submit\" class=\"btn\" id=\"btn\" type=\"submit\" value=\"Enviar\" onclick=\"return validar()\"/> </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<td><input type=\"button\"  class=\"btn\"  id=\"btn2\" value=\"Comprobar si son iguales\" onClick=\"comprobarClave()\"></td>\r\n");
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

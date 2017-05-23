package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Catálogo</title>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/indexUsuario.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/indexUsuario.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Contenedor -->\n");
      out.write("    <div id=\"contenedor\">\n");
      out.write("\t<!-- Header -->\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<h1 id=\"logo\"><a href=\"#\">artDirect</a></h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Navegacion -->\n");
      out.write("\t\t<div id=\"navegacion\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t    <li><a class=\"active\" href=\"#\">INICIO</a></li>\n");
      out.write("\t\t\t    <li><a href=\"#\">MI CUENTA</a></li>\n");
      out.write("\t\t\t    <li><a href=\"#\">PELICULAS</a></li>\n");
      out.write("\t\t\t    <li><a href=\"#\">CONTACTO</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- fin Navegacion -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Sub-menu -->\n");
      out.write("\t\t<div id=\"sub-navegacion\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t    <li><a href=\"#\">MOSTRAR TODAS</a></li>\n");
      out.write("\t\t\t    <li><a href=\"#\">MÃS VISTAS</a></li>\n");
      out.write("\t\t\t    <li><a href=\"#\">MÃS NUEVAS</a></li>\n");
      out.write("\t\t\t    <li><a href=\"#\">MEJOR CALIFICADAS</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div id=\"busqueda\">\n");
      out.write("\t\t\t\t<form action=\"home_submit\" method=\"get\" accept-charset=\"utf-8\">\n");
      out.write("\t\t\t\t\t<label for=\"campo-busqueda\">BÃSQUEDA</label>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"campo busqueda\" value=\"Ingresa tu bÃºsqueda\" id=\"campo-busqueda\" title=\"Ingresa tu bÃºsqueda\" class=\"blink campo-busqueda\"  />\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"BUSCAR\" class=\"boton-busqueda\" />\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- fin Sub-Menu -->\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- fin Header -->\n");
      out.write("\t\n");
      out.write("\t<!-- Principal -->\n");
      out.write("\t<div id=\"principal\">\n");
      out.write("\t\t<!-- Contenido -->\n");
      out.write("\t\t<div id=\"contenido\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Caja -->\n");
      out.write("\t\t\t<div class=\"caja\">\n");
      out.write("\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t<h2>MÃS VISTAS</h2>\n");
      out.write("\t\t\t\t\t<p class=\"texto-derecha\"><a href=\"#\">Ver todas</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Movie -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">X-MAN</span></span><img src=\"images/indexUsuario/pelicula1.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">SPIDER MAN 2</span></span><img src=\"images/indexUsuario/pelicula2.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">SPIDER MAN 3</span></span><img src=\"images/indexUsuario/pelicula3.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">VALKYRIE</span></span><img src=\"images/indexUsuario/pelicula4.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">GLADIATOR</span></span><img src=\"images/indexUsuario/pelicula5.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"ultima pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">ICE AGE</span></span><img src=\"images/indexUsuario/pelicula6.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- fin Caja -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Caja -->\n");
      out.write("\t\t\t<div class=\"caja\">\n");
      out.write("\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t<h2>MÃS NUEVAS</h2>\n");
      out.write("\t\t\t\t\t<p class=\"texto-derecha\"><a href=\"#\">Ver todas</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">TRANSFORMERS</span></span><img src=\"images/indexUsuario/pelicula7.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">MAGNETO</span></span><img src=\"images/indexUsuario/pelicula8.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">KUNG FU PANDA</span></span><img src=\"images/indexUsuario/pelicula9.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">EAGLE EYE</span></span><img src=\"images/indexUsuario/pelicula10.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">NARNIA</span></span><img src=\"images/indexUsuario/pelicula11.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"ultima pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">ANGELS &amp; DEMONS</span></span><img src=\"images/indexUsuario/pelicula12.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- fin Caja -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Caja -->\n");
      out.write("\t\t\t<div class=\"caja\">\n");
      out.write("\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t<h2>MEJOR CALIFICADAS</h2>\n");
      out.write("\t\t\t\t\t<p class=\"texto-derecha\"><a href=\"#\">Ver todas</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">HOUSE</span></span><img src=\"images/indexUsuario/pelicula13.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">VACANCY</span></span><img src=\"images/indexUsuario/pelicula14.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">MIRRORS</span></span><img src=\"images/indexUsuario/pelicula15.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">THE KINGDOM</span></span><img src=\"images/indexUsuario/pelicula16.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"pelicula\">\n");
      out.write("\t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">MOTIVES</span></span><img src=\"images/indexUsuario/pelicula17.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Pelicula -->\n");
      out.write(" \t\t\t\t<div class=\"ultima pelicula\">\n");
      out.write(" \t\t\t\t\t<div class=\"pelicula-imagen\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"play\"><span class=\"nombre\">THE PRESTIGE</span></span><img src=\"images/indexUsuario/pelicula18.jpg\" alt=\"pelicula\" /></a>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- fin Pelicula -->\n");
      out.write("\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- fin Caja -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- fin Contenido -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- fin Principal -->\n");
      out.write("\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"#\">INICIO</a> |\n");
      out.write("\t\t\t<a href=\"#\">MI CUENTA</a> |\n");
      out.write("\t\t\t<a href=\"#\">PELICULAS</a> |\n");
      out.write("\t\t\t<a href=\"#\">MÃS VISTAS </a> |\n");
      out.write("\t\t\t<a href=\"#\">MÃS NUEVAS</a> |\n");
      out.write("\t\t\t<a href=\"#\">MEJOR CALIFICADAS</a> |\n");
      out.write("\t\t\t<a href=\"#\">CONTACTO</a>\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p> &copy; 2017 ESCOM IPN. Derechos Reservados</p>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- fin Footer -->\n");
      out.write("    </div>\n");
      out.write("    <!-- termina Contenedor -->\n");
      out.write("</body>\n");
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

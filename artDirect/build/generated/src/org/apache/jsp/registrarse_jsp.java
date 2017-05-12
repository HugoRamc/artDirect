package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/registrarse.css\">\n");
      out.write("    </head>\n");
      out.write("        <body background=\"images/2.jpg\">\n");
      out.write("\n");
      out.write("        <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("        <td><p class=\"estilo1\">Registrate Cinefilo</p><hr>\n");
      out.write("        <p class=\"estilo3\">Nombre <input type=\"text\" name=\"Nombre\">\n");
      out.write("        <p class=\"estilo3\">Apellidos <input type=\"text\" name=\"Apellidos\">\n");
      out.write("        <p class=\"estilo3\">Avatar <input type=\"email\" name=\"email\" required/>\n");
      out.write("        <p class=\"estilo3\">Avatar <input type=\"text\" name=\"Avatar\">\n");
      out.write("        <p class=\"estilo3\">Tipo de Usuario<select name=\"tipo\">\n");
      out.write("\n");
      out.write("        <option>Cinefilo</option>\n");
      out.write("\n");
      out.write("        <option>Cineasta</option>\n");
      out.write("\n");
      out.write("        <option>Administrador</option>\n");
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <p class=\"estilo3\">Password<input type=\"password\" name=\"password\" required/>\n");
      out.write("        <p class=\"estilo3\">Confirmar Password<input type=\"password\" name=\"password\" required/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p class=\"estilo3\"><input type=button onclick=\"pregunta()\"  class=\"boton1\" value=\"Enviar Registro\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<script language=\"JavaScript\"> \n");
      out.write("function pregunta(){ \n");
      out.write("    if (confirm('¿Estas seguro de enviar este formulario?')){ \n");
      out.write("       document.tuformulario.submit() \n");
      out.write("    } \n");
      out.write("} \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

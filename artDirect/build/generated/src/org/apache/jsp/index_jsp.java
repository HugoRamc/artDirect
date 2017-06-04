package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.JasperException;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./navbar.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>artDirect</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"images/logo1.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/barra.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        //traemos los atributos de sesion para validar si ya ha iniciado sesion
        Object dat = request.getSession().getAttribute("correoUsu");
        Object dat2 = request.getSession().getAttribute("tipoUsuario");
        if(dat!=null && dat2!=null){
            //out.print(dat.toString());
            if(dat2.toString().equals("administrador")){
                //si es usuario redirige al administrador
            }else{
                //si es usuario normal o cinesta redirecciona a la parte del usuario
                
                response.sendRedirect("user/indexU.jsp");
            }
                
            
            
        }
    
    
      out.write("\r\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-inverse navbar-custom\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button class=\"navbar-toggle collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\".\"><img src=\"images/logo2.png\"class=\"nav-bar-image\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Iniciar Sesión</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"alta.jsp\">Registrarse</a>\r\n");
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
      out.write(" <!--Para no poner la barra en cada html-->\r\n");
      out.write("    <section>\r\n");
      out.write("        <section id=\"fotoInicio\">\r\n");
      out.write("            <h1>artDirect</h1> <br>\r\n");
      out.write("            <h2>*inserte frase con doble sentido</h2>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"row\">\r\n");
      out.write("            <div class=\"\">\r\n");
      out.write("                ¿Que es artDirect?\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <section class=\"row2\">\r\n");
      out.write("            <h1>Nuestro Equipo:</h1>\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/jesus.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Jesus Magadán\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/hugo.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Hugo Ramírez <br>\r\n");
      out.write("                <!--<a href=\"https://www.twitter.com/Hugoramc\" target=\"_blank\">@Hugoramc</a>-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/angel.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Ángel Soto\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/sebastian.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Sebastian Saldaña\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"row3\">\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/carmen.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Carmen García\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/ian.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Ian Mendoza <br>\r\n");
      out.write("                <a href=\"https://www.twitter.com/Hugoramc\" target=\"_blank\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imagen\">\r\n");
      out.write("                <div class=\"centra\">\r\n");
      out.write("                    <img src=\"images/tona.jpg\" class=\"img-circle img-responsive tamFoto\"/><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                Tonatihu Barrera\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
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

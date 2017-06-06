package servlet;

import db.Conexion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "agregarFilmeServlet", urlPatterns = {"/upload"})
@MultipartConfig

public class agregarEpisodioServlet extends HttpServlet {
    
    private final static Logger LOGGER = Logger.getLogger(agregarFilmeServlet.class.getCanonicalName());

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter writer = response.getWriter()) {
            
            HttpSession sesion = request.getSession();
            
            String nombreEpisodio = request.getParameter("nombreEpisodio");
            String desc = request.getParameter("desc2");
            String nombreSerie = request.getParameter("nombreSerie");
            int idF = Integer.parseInt(request.getParameter("idFilmeSerie"));
            
            final String path = request.getRealPath("/") + "videos";
            final Part part = request.getPart("archivoEpisodio");
            final String nombreArchivo = quitarPuntos(nombreEpisodio) + getFileName(part);
            
            
            Conexion conectar = new Conexion();
            ResultSet rs = conectar.consulta("spConsultaValidezRuta", nombreArchivo);
            
            if(rs.next()){
                int temp = rs.getInt("mensaje");
                if(temp != 0){
                    response.sendRedirect("user/agregarFilme.jsp");
                }
            }
            
            OutputStream out = null;
            InputStream filecontent = null;
            
            try{
                out = new FileOutputStream(new File(path + File.separator + nombreArchivo));
                filecontent = part.getInputStream();
                
                int read = 0;
                final byte[] bytes = new byte[1024];
                
                while ((read = filecontent.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                
                writer.println("New file " + nombreArchivo + " created at " + path);
                LOGGER.log(Level.INFO, "File{0}being uploaded to {1}", 
                    new Object[]{nombreArchivo, path});

                conectar.consulta("spInsertarCapituloSerie", idF, nombreArchivo, desc, nombreEpisodio);
                conectar.cerrar();
                sesion.setAttribute("exitoSerie", "exito");
                response.sendRedirect("user/agregarEpisodio.jsp?idSerie="+idF+"&nombreSerie="+nombreSerie);
            }
            catch (FileNotFoundException fne) {
                writer.println("You either did not specify a file to upload or are "
                        + "trying to upload a file to a protected or nonexistent "
                        + "location.");
                writer.println("<br/> ERROR: " + fne.getMessage());

                LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}", 
                        new Object[]{fne.getMessage()});
            } 
            finally {
                if (out != null) {
                    out.close();
                }
                if (filecontent != null) {
                    filecontent.close();
                }
                if (writer != null) {
                    writer.close();
                }
            }
            
        }
    }
    
    private String quitarPuntos(String algo){
        String bueno = "";
        for(int i = 0; i < algo.length(); ++i){
            char temp = algo.charAt(i);
            if(temp != '.'){
                bueno += temp;
            }
        }
        return bueno;
    }
    
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(agregarEpisodioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(agregarEpisodioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

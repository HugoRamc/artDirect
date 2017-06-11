package servlet;

import db.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AceptarRechazarArtista extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String idA = request.getParameter("artistaAR");
            String aceptar = request.getParameter("aceptarArtista");
            String rechazar = request.getParameter("rechazarArtista");
            
            Conexion conectar = new Conexion();
            
            if(aceptar != null){
                conectar.consulta("spAceptarArtistas", idA, 1);
                conectar.cerrar();
                response.sendRedirect("user/pendientesAdmin.jsp");
            }
            else if(rechazar != null){
                conectar.consulta("spAceptarArtistas", idA, 0);
                conectar.cerrar();
                response.sendRedirect("user/pendientesAdmin.jsp");
            }
            else{
                conectar.cerrar();
                response.sendRedirect("user/indexU.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(AceptarRechazarArtista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(AceptarRechazarArtista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

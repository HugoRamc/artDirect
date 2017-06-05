/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import db.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tona
 */
@WebServlet(name = "Calificar", urlPatterns = {"/Calificar"})
public class Calificar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int peli = Integer.parseInt(request.getParameter("film"));
            int calificacion = Integer.parseInt(request.getParameter("calificacion")); 
            Conexion con = new Conexion();
            ResultSet rs = con.consulta("spPuntua", "mail5@gmail.com", peli, calificacion);
            if(rs.first()) {
                System.out.println("Calificacion usuario: "+ rs.getString("resultado"));
            }
            
            rs = con.consulta("spGetScoresFromFilm", peli);
            int numero = 0;
            double nuevaPuntuacion = 0;
            while (rs.next()) {
                nuevaPuntuacion += rs.getDouble("puntuacion");
                numero++;
            }
            System.out.println("El numero de calificaciones es: " + numero);
            nuevaPuntuacion = nuevaPuntuacion/numero;
            nuevaPuntuacion = (double)Math.round(nuevaPuntuacion *10d)/10d;
            con.consulta("spUpdateScore", peli, nuevaPuntuacion);
            out.print("{\"puntuacion\":"+nuevaPuntuacion+", \"puntuacionUsuario\":"+calificacion+", \"ok\":true}");
            con.cerrar();
        }
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
            Logger.getLogger(Calificar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Calificar.class.getName()).log(Level.SEVERE, null, ex);
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

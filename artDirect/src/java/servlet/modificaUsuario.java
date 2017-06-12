/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import db.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tevod
 */
@WebServlet(name = "modificaUsuario", urlPatterns = {"/modificaUsuario"})
public class modificaUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Conexion con = new Conexion();
            ResultSet s;
            String operacion = request.getParameter("submit");
            String mail = request.getSession().getAttribute("correoUsu").toString();
            
                
            if(operacion.equals("Cambiar Datos")){//si la operacion es modificar usuario
                
                String nombre,contra,contra2,tarjeta,cvv,mes,anio;
            
                nombre = request.getParameter("txtNombre");
                contra = request.getParameter("txtPassword");
                contra2 = request.getParameter("txtPassword2");
                tarjeta = request.getParameter("txtTarjeta");
                cvv = request.getParameter("txtcvv");
                mes = request.getParameter("txtmes");
                anio = request.getParameter("txtyear");


                if(contra.equals(contra2)){
                    int i=0;
                    try{
                        s = con.consulta("spCambiarDatosDeUsuario", mail,contra,nombre,tarjeta,cvv,(anio+"-"+mes+"-01"));
                    
                        while(s.next()){
                            /*if(s.getString("resultado").equals("Datos modificados exitosamente")){
                                response.sendRedirect("indexU.jsp");
                            }else{
                                response.sendRedirect("../index.jsp");
                            }*/
                            out.print("<br>"+s.getString("resultado") + "<br>");
                            
                        }
                    }catch(Exception ex){
                        out.print(ex.toString());
                    }
                    
                }else
                {
                    out.print("las contraseñas no coinciden");
                }
                
            }else if(operacion.equals("Eliminar Usuario")){//si la operacion es eliminar al usuario
                
                s = con.consulta("spEliminaUsuario", mail);
               
                while(s.next()){
                    request.getSession().invalidate();
                    out.print("<br>"+s.getString("resultado") + "<br>");
                
                }
                
                
            }else{
                out.print("opcion no valida");
            }
            
           
            
            out.print("<br><a href='/artDirect/index.jsp'>Regresar</a>");
            
            
            
        }catch(Exception ex){
            out.print(ex.toString());
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
        processRequest(request, response);
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
        processRequest(request, response);
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

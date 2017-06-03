<%-- 
    Document   : redirige
    Created on : 31/05/2017, 11:07:55 PM
    Author     : tevod
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            // Es mejor si esta parte se mueve a un servlet ya que no se utiliza HTML
            ResultSet s;
            String mail = request.getParameter("login-email");
            String pass = request.getParameter("login-pass");
            
            Conexion conect = new Conexion();
            s = conect.consulta("spSesiones", mail,pass);
            
            while(s.next()){
                if(s.getString("resultado").equals("1")){
                    
                   request.getSession().setAttribute("correoUsu", mail);
                   response.sendRedirect("user/index.jsp");
                    
                }else{
                    session.invalidate();
                    response.sendRedirect("index.jsp");
                }
                
                
                    
                
            }
            
        
        %>
        
    </body>
</html>

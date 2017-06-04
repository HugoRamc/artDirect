<%@page contentType="text/html" pageEncoding="UTF-8" import="org.apache.jasper.JasperException"%>
<%@page session="true"%>
<%
    //validacion de las sesiones
    try
    {
        Object dat = request.getSession().getAttribute("correoUsu");
        Object tipo = request.getSession().getAttribute("tipoUsuario");
        //out.print(tipo);
         if(dat==null || tipo==null){
           response.sendRedirect("../index.jsp");
        }
    }catch(Exception ex){
        response.sendRedirect("../index.jsp");
    }
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>artDirect</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../css/barra.css">
    </head>
    <body>
        <%@include file="../navbarUsers.jsp" %>
    </body>
</html>

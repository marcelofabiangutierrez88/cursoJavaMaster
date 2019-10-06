<%-- 
    Document   : procesaFormulario
    Created on : 05/10/2019, 22:37:18
    Author     : marce
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de procesar el Formulario:</h1>
        Usuario:<%=request.getParameter("usuario") %>
        <br>
        Password: <%=request.getParameter("password") %>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>

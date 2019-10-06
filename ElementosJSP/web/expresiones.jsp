<%-- 
    Document   : expresiones
    Created on : 05/10/2019, 22:36:52
    Author     : marce
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP de Expresiones</title>
    </head>
    <body>
        <h1>Jsp de Expresiones</h1>
        Concatenacion: <%="Saludos" + "JSP"%>
        <br>
        Operacion Matematica: <%=2*3/2 %>
        <br>
        Session ID: <%=session.getId() %>
        <br>
        <br>
        <a href="index.html"> Regresar al Inicio </a> 
    </body>
</html>

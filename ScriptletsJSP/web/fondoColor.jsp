<%-- 
    Document   : fondoColor
    Created on : 05/10/2019, 22:58:54
    Author     : marce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fondo = request.getParameter("colorFondo");
    // si no es valido el color ponemos color por default
    if (fondo == null||fondo.trim().equals("")){
        fondo = "white";
    }   
%>

<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP cambio de Color de Fondo</title>
</html>
<body bgcolor ="<%=fondo%>">
    <h1>Fondo de color aplicado: <%= fondo%></h1>
    <br>
    <a href="index.html">Regresar al index </a>
</body>
</html>
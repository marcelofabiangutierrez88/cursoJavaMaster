<%-- 

    Document   : index
    Created on : 05/10/2019, 20:49:19
    Author     : marce
--%>
 
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo con Jsp</title>
    </head>
    <body>
        <h1>Ejercicio hola mundo con jsp</h1>
        <!--Impresion de cadenas con diferentes tecnologias -->
        <ul>
            <li>Hola mundo con HTML
            <li><% out.print("Hola mundo con scriptlets");%>
            <li> ${"Hola mundo con Expression Lenguage (EL)"} 
            <li> <c:out value = "Hola mundo con JSTL" />
        </ul>
        <!--Valores desde el lado del servidor -->
        <ul>
            <li> Hola: <%= new java.util.Date()%>
            <%=request.getContextPath()%>
            <li>Valor del parametro x :
                <%=request.getParameter("x")%>
        </ul>
    </body>
</html>

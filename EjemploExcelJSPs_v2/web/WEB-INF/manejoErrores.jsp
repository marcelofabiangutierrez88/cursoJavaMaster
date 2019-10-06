<%-- 
    Document   : manejoErrores
    Created on : 06/10/2019, 18:59:15
    Author     : marce
--%>
<%@page isErrorPage ="true" %>
<%@ page import="java.io.*"  %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de Errores</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/recursos/funciones.js">
        </scritp>
    </head>
    <body>
        <h1>Manejo Errores</h1>
        <br>
        <br>
        Ocurrio un Error:
        <%= exception.getMessage()%>
        <br>
        <br>
        <a href="<%=request.getContextPath()%>/index.html"> Regresar al inicion </a>
        <br>
        <a href="#" onclick="cambio('mensaje1')">
        Ver Detalles... </a>
        <div id="mensaje1" style="position:relative;visibility: hidden">
        <PRE>
            <% exception.printStackTrace(new PrintWriter(out)); %>
        </PRE>
        </div>
    </body>
</html>

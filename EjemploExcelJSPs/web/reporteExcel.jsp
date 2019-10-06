<%-- 
    Document   : reporteExcel
    Created on : 06/10/2019, 18:21:30
    Author     : marce
--%>
<%@page import="utileria.Conversiones, java.util.Date"%>
<%@page contentType="aplication/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline; filaname="+nombreArchivo);  
 %>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha Inicio</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
            <tr>
                <td>2. Programacion con Java</td>
                <td>Pondremos en practica conceptos de la programacion
                orientada a objetos</td>
                <td><%= Conversiones.format(new Date ()) %></td>
            </tr>
        </table>
    </body>
</html>

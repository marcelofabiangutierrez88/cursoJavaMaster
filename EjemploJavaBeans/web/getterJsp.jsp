
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee valores del JavaBeans</title>
    </head>
    <body>
        <h1>JSP que lee valores del JavaBeans</h1>
        <!--declaramos el javabean a utilizar
        si ya existe im beam en la sesion llamado "rectangulo".
        regresa el mismo objeto y no crea uno nuevo-->
        <jsp:useBean id="rectangulo"
                     class="beans.Rectangulo" scope="session"/>
            
        <!--Recuperando los valores y los desplegamos-->    
        <br>
        Valor base : <jsp:getProperty name="rectangulo" property="base"/>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="area"/>
        <br>
        <br>
        <a href="index.jsp"> Regresar al Inicio </a>
        
    </body>
</html>

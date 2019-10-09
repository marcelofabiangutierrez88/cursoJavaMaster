<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso a JavaBeans</title>
    </head>
    <body>
        <h1>Acceso a JavaBeans</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" />
        
        <!--asignamos los alores del formulario al javabean-->
        <jsp:setProperty name="rectangulo" property="*" />
        <br>
        Valor Base: ${rectangulo.base}
        <br>
        Valor Altura: ${rectangulo.altura}
        <br>
        Calculo Area: ${rectangulo.base * rectangulo.altura}
        <br>
        <br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>

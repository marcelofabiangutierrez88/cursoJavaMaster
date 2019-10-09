
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo JavaBeans</title>
    </head>
    <body>
        <h1>Ejemplo Java Beans</h1>
        <!--JSP para modificar valores del javabeans-->
        <a href="setterJsp.jsp">Modificar valores del JavaBean</a>
        <br>
        <!--JSP para ller valores del javabeans-->
        <a href="getterJsp.jsp">Leer valores del JavaBeans</a>
        <br>
        <br>

        <!--JSP para recuperar parametros de un formulario-->
        <!--Formulario 1-->

        Formulario 1 :
        <br>
        <form name="form1" action="setteräramJsp.jsp">
            Base: <input type="text" name="baseParam">
            <br>
            Altura: <input type="text" name="alturaParam">
            <input type="submit" value="Enviar">
        </form>

        <br>

        Formulario 2:
        <br>
        <form name="form2" action="setterAllParamJsp.jsp">
            Base: <input type="text" name="base" >
            <br>
            Altura: <input type="text" name="altura">
            <input type="submit" value="Enviar">  
        </form>
    </body>
</html>

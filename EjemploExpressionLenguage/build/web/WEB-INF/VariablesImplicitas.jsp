<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El y Variables Implicitas</title>
    </head>
    <body>
        <h1>El y Variables Implicitas</h1>
        
        <ul>
            <li>Nombre Aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${ header["User-Agent"]}</li>
            <li>Id Session: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
        </ul>
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
       
    </body>
</html>

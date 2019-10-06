<%-- 
    Document   : scriptlets
    Created on : 05/10/2019, 22:59:20
    Author     : marce
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con ScriptletsPage</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <!--Scriptlet para enviar informacion al navegador -->
        <%
            out.print("Saludos desde un Scriptlet");
            
         %>
         <br>
         <!--Scriptlet para manipular objetos implicitos-->
         <%
             String nombreAplicacion = request.getContextPath();
             out.print("nombreAplicacion: "+nombreAplicacion);
         %>
         <!--Scriptlet con codigo condicionado -->
         <%
           if (session!=null && session.isNew()){  
         %>
         La sesion SI es nueva.
         <%
             }else if (session!=null){
         %>
         La sesion NO es nueva.
         <%
             }
         %>
    </body>
</html>

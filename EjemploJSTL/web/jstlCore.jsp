<!--Importamos la libreria core JSTL-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        
        <!--Manipulacion de Variables-->
        <c:set var ="nombre" value="Marcelo" />
        Variable Nombre: <c:out value="${nombre}" />
        
        <br>
        <br>
        Variable con codigo HTML:
        <c:out value="<h1>Hola</h1>" escapeXml="true" />
        <br>
        <br>
        
       <!--codigo condicionado, similar al switch -->
       <c:if test="${param.opcion != null}" >
           <c:choose>
               <c:when test="${param.opcion==1}">
                   <br>
                   Opcion 1 Proporcionada
                   <br>
                </c:when>
                   <c:when test="${param.opcion==2}">
                       <br>
                       Opcion 2 Proporcionada
                       <br>
                </c:when>
                <c:otherwise>
                    <br>
                    Opcion proporcionada desconocida: ${param.opcion}
                    <br>
                </c:otherwise>
           </c:choose>
       </c:if>
                    
   <!--Iteracion de un arreglo-->
   <%
       // uso de scriptlet
       //creamos el arreglo con un scriplet (no es buena practica)
       String [] nombres = {"claudia", "pedro","carlos","dante"};
       //compartiendo el arreglo de nombres en el alcance(scope) de request
       request.setAttribute("nombres", nombres);
    %>
    <br>
    Lista de nombres en el arreglo:
    <br>
    <ul>
        <c:forEach varStatus="status" var="persona" items="${nombres}">
            <li>${status.count} - Nombre: ${persona}</li>
        </c:forEach>
    </ul>
    <br>
    <a href="index.jsp">Regresar al Inicio</a>
    
    </body>
</html>

<%-- 
    Document   : index
    Created on : 05/10/2019, 23:53:32
    Author     : marce
--%>
<%!
    //declaramos una variable con su metodo get
    private String usuario = "Marcelo";

    public String getUsuario(){
    return this.usuario;
}
// declaramos un contador de visitas
    private int contadorDeVisitas=1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones</title>
    </head>
    <body>
        <h1>Uso de Declaraciones</h1>
        Usuario por medio del atributo:<%= this.usuario%>
        <br>
        Usuario por medio del metodo get: <%= this.getUsuario()%>
        <br>
        Contador de Visitas: <%=this.contadorDeVisitas++%>
    </body>
</html>

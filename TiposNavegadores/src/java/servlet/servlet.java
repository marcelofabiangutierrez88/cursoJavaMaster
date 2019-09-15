
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Enumeration;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException ,IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            //creando variables para procesar el titulo y el msj de la web
            String titulo = null, mensaje = null;
            //detectando el tipo de navegador que hizo la peticion
            String tipoNavegador = request.getHeader("User-Agent");
            System.out.println("Tipo de navegador: "+tipoNavegador);
            //verifando tipo de navegador y personalizando respuesta
            if (tipoNavegador !=null && tipoNavegador.contains("Trident")){
                titulo = "Navegador Internet Explorer";
                mensaje = "Estas navegando con Internet Explorer"; 
            } else if (tipoNavegador !=null && tipoNavegador.contains("Firefox")){
                titulo = "Navegador Mozilla Firefox";
                mensaje = "Estas navegando con Mozilla Firefox";
            }else if (tipoNavegador !=null && tipoNavegador.contains("Chrome")){
                titulo = "Navegador Google Chrome";
                mensaje ="Estas navegando con Google Chrome";
            }
            out.println("<html>");
            out.print("<head>");
            out.print("<title>"+ titulo +"</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Tipo Navegador </h1>");
            out.print("<br>");
            out.print(mensaje);
            out.print("</body>");
            out.print("</html>");
            
        }
        
    }
}
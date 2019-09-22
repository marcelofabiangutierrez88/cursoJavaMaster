
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            // suponemos que el usuario visita por primera vez nuestro sitio
            boolean nuevoUsuario = true;
            // obteniendo las cookies
            Cookie[] cookies = request.getCookies();
            //buscamos si ya existe la cookie creada con anterioridad
            //llamada visitanteRecurrente
            
            if(cookies !=null){
                for (Cookie c:cookies){
                    if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                        //en caso de que exista una cookie indicando que ya existe
                        //un usuario registrado con anterioridad ponemos la bandera en false y salimos del ciclo
                        nuevoUsuario=false;
                        break;
                }
                }//fin del for
                
            }//fin del if
            // revisando si el usuario es un nuevo visitante
            String mensaje = null;
            if(nuevoUsuario){
                //en caso de ser un nuevo usuario creamos el obj cookies
                Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
                //agregamos esta cookie en la respuesta
                response.addCookie(visitanteCookie);
                mensaje ="Gracias por visitar nuestro por primera vez sitio Web";
                
            }else {
                mensaje="Gracias por visitar nuevamente nuestro sitio web";
                //escribiendo la salida
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("Mensaje: "+mensaje);
            }
            
    }

    
}

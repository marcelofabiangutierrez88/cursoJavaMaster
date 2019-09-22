
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 

/**
 *
 * @author marcelo
 */
@WebServlet(name = "ContadorVisitasServlet", urlPatterns = {"/ContadorVisitasServlet"})
public class ContadorVisitasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            // declarando la variable contador
            int contador = 0;
            
            // si existe, obtenemos el contador de visitas actual
            Cookie[] cookies= request.getCookies();
            if(cookies!=null){
                for (Cookie c : cookies){
                    if(c.getName().equals("contadorVisitas")){
                        try{
                            //obteniendo el valor del contador de visitas actual
                            contador = Integer.parseInt(c.getValue());
                        } catch (NumberFormatException e){
                            // en caso de error reiniciando el contador de visitas
                            contador = 0;
                        }
                    }
                }//fin del for
            }//fin del if
            // incrementamos el valor del contador
            // y lo agregamos a la cookie de respuesta
            contador++;
            Cookie c = new Cookie ("contadorVisitas", Integer.toString(contador));
            // la cookie se almacena en el navegador solo por una hora.
            c.setMaxAge(3600);
            response.addCookie(c);
            
            
            // mandando mensaje al navegador
            PrintWriter out = response.getWriter();
            out.println("Contador de visitas  de cada cliente: "+contador);
    }

}

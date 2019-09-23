
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        // pedimos el atributo y verificamos si existe
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        // si es igual a nulo quiere decir que es la primera
        if (contadorVisitas==null){
            contadorVisitas = new Integer(1);
            titulo = "Bienvenido por primera vez";
        } else {
            //si es distinto de nulo quiere decir que no es la primera vez
            titulo ="Bienvenido nuevamente...";
            contadorVisitas ++;
            
        }
        // en cualquier caso agregamos el valor del contador a la  sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        // se muestran los valores en el cliente
        PrintWriter out = response.getWriter();
        out.println("Titulo: "+ titulo);
        out.println("<br>");
        out.println("Nro de accesos al sitio: "+contadorVisitas);
        out.println("<br>");
        out.println("ID de la sesion: "+ sesion.getId());
        


      
    }

    

}

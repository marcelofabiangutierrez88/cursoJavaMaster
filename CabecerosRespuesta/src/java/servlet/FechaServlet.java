
package servlet;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "FechaServlet", urlPatterns = {"/FechaServlet"})
public class FechaServlet extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            response.setContentType("text/html;charset=UTF-8");
            response.setHeader("refresh", "1"); //ensegundos
            Date fecha = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("'Hora Actualizada:' HH:mm:ss ");
            String fechaConFormato = formateador.format(fecha);
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Server Fecha Actualizada </title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1> Fecha Actualizada: " +fechaConFormato +"</h1>");
            out.print("</head>");
            out.print("</html>");
            
        }
    }

    

}

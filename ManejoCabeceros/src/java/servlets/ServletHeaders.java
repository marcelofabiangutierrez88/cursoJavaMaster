package servlets;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 *
 * @author marcelo
 */
@WebServlet(name = "ServletHeaders", urlPatterns = {"/ServletHeaders"})
public class ServletHeaders extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            //procesando los headers relacionados con la info de la peticion
            String metodoHttp= request.getMethod();
            String uri = request.getRequestURI();
            
            out.println("<html>");
            out.println("<body>");
            out.println("<title>Header HTTP</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Header HTTP</h1>");
            out.println("Metodo HTTP: "+metodoHttp);
            out.println("<br>");
            out.println("URI seleccionado: " +uri);
            out.println("<br>");
            //procesando cabeceros que son parte de la peticion
            out.println("<br>");
            out.println("Host :"+request.getHeader("Host"));
            out.println("<br>");
            out.println("Navegador: "+request.getHeader("User-agent"));
            //procesando todos los cabeceros
            //varian segun el navegador utilizado
            out.println("<br>");
            out.println("<br>");
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                String nombreCabecero=(String)cabeceros.nextElement();
                out.println("<b>"+ nombreCabecero + "</b>" );
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
    }finally{
            out.close();
        }
   
    
    }

  
 
}
package controller;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Rectangulo;

/**
 *
 * @author marcelo
 */

@WebServlet (name="ServletControlador", urlPatterns ={"/ServletControlador"})
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        //1- En este caso no hay necesidad de procesar  parametros
        
        //2-creando los javabeans
        Rectangulo rec = new Rectangulo (3,6);
        //3 agregamos las variables en cierto alcance
        request.setAttribute("mensaje", "Saludos desde el servlet");
        
        HttpSession session = request.getSession();
        session.setAttribute("rectangulo", rec);
        
        //4 redireccionamos
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        // se propagan los objetos request y response
        //ṕara que puedan ser utilizados por el JSP seleccionado
        rd.forward(request, response);
        //ya no se necesita haer mas despues del redireccionamiento,
        //ya que el flujo continua por el JSP
        
    }
   
   
    
}

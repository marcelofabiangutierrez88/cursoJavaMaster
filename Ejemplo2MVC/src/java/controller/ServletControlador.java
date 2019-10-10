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
        
        //procesando peticion
        //1-procesando los parametros
        String accion = request.getParameter("accion");
        
        //2 creamos los javabeans a compartir
        Rectangulo recRequest = new Rectangulo (1,2);
        Rectangulo recSession = new Rectangulo (3,4);
        Rectangulo recApplication = new Rectangulo (5,6);
        
        
        if ("agregaVariables".equals(accion)){
            //3 compartiendo las variables en el alcance seleccionado
            
            //alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //alcance session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", recSession);
            
            //alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication", recApplication);
            
            //agregando el mensaje
            request.setAttribute("mensaje","las variables fueron agregadas");
            
            //4 redireccionando el JSP seleccionado
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            
            
        }else if ("listarVariables".equals(accion)){
            //4 unicamente redireccionamos ya qe no agregamos variables
            // y se desplegaran solamente las que sigan disponibles
            //segun el alcance de cada variable
            request.getRequestDispatcher("/WEB-INF/alcanceVariables.jsp").forward(request, response);
            
        } else
            //5 redireccionamos a la pagina de inicion agregamos un mensaje
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            // response.sendRedirect("index.jsp");
        
    }
   
   
    
}


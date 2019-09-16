
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "FormularioServlet", urlPatterns = {"/FormularioServlet"})
public class FormularioServlet extends HttpServlet {


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out=response.getWriter();
       
       //simulando valoresa
       String usuarioCorrecto ="Marcelo";
       String passwordCorrecto="1234";
       
       String pUsuario = request.getParameter("usuario");
       String pPassword = request.getParameter("password");
       
       if(usuarioCorrecto.equals(pUsuario) && passwordCorrecto.equals(pPassword)){
           out.print("<h1>");
           out.print("Datos Correctos");
           out.print("<br>Usuario: "+pUsuario);
           out.print("<br>Password: "+pPassword);
           out.print("</h1>");
          
       }else {
           // respondemos al navegador con un codigo de estado de No Autorizado
           response.sendError(response.SC_UNAUTHORIZED,"Las credenciales no son correctas");
           
       }
       out.close();
    }

   

}

package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("Metodo doGet no soportado en Servlet");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws  IOException {
        // leemos los parametros del formulario
        // por default el formulario es de tipo Get
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        System.out.println("Usuario: " + usuario);
        System.out.println("Password: "+ password);
        
        PrintWriter out=res.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro de usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro de contraseña es: "+password);
        out.print("</body>");
        out.print("</html>");
        out.close();
                
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

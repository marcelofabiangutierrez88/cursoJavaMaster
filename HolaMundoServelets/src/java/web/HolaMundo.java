package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcelo
 */
@WebServlet(name = "HolaMundo", urlPatterns = {"/HolaMundo"})
public class HolaMundo extends HttpServlet {
@Override  
protected void doGet (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    response.setContentType("text:/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()){
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet HolaMundo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet HolaMundo at " + request.getContextPath() + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
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

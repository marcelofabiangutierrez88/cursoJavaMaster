
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "GeneracionExcelServlet", urlPatterns = {"/GeneracionExcelServlet"})
public class GeneracionExcelServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()){
            // especificando el tipo de documento de respuesta MIME
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment; filename=excelEjemplo.xls");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-control", "no-store");
            response.setDateHeader("Expires", 1);
            out.print("\tValores");
            out.print("\t1");
            out.print("\t2");
            out.print("Total\t=SUMA(B2:B3)");
    }

  

    }  

}

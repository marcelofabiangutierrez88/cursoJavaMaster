
package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "RedireccionamientoServlet", urlPatterns = {"/RedireccionamientoServlet"})
public class RedireccionamientoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //utilizando redireccionamiento
        String url = null;
        String mensaje = null;
        String tipoNavegador=request.getHeader("User-Agent");
        System.out.println("tipoNavegador: "+tipoNavegador);
        if(tipoNavegador!=null && tipoNavegador.contains("Trident")){
            url = "http://www.microsoft.com";
            mensaje = "Estas usando Internet Explorer";
        }else if(tipoNavegador!=null && tipoNavegador.contains("Firefox")){
            mensaje = "Estas usando mozilla firefox";
            url = "http://www.firefox.com ";
        }else if (tipoNavegador!=null && tipoNavegador.contains("Chrome")){
            mensaje="Estas usuando Google Chrome";
            url="http://www.google.com";
        }
        //redireccionando a la url seleccionada
        response.sendRedirect(url);
    }

}
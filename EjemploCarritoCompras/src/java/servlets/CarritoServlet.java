package servlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 *
 * @author marcelo
 */
@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=utf-8");
            //procesndo el nuevo articulo
            String nuevoArticulo = request.getParameter("articulo");
            
            // creamos o recuperamos el objeto httpsession
            HttpSession sesion = request.getSession();
            
            //recuperamos la lista de articulos previos
            // si es que existen en la sesion
            List<String> articulos = (List<String>) sesion.getAttribute("articulo");
            //verificando si la lista exixte
            if (articulos==null){
                //si no existe inicializamos la lista
                //y se agrega a la sesion
                articulos = new ArrayList<>();
                sesion.setAttribute("articulos", articulos);
                
            }
            // ya tenemos la lista de articulos lista para trabajar
            // agregando el nuevo articulo
            //y lo agregamos por paso a referencia a la lista de
            //articulos
            if (nuevoArticulo!=null && !nuevoArticulo.trim().equals("")){
                articulos.add(nuevoArticulo);
                
            }
            try(PrintWriter out = response.getWriter()){
                //mostramos articulos al cliente
                out.println("<h1>Lista de Articulos</h1>");
                out.println("<br>");
                // iteramos los articulos incluyendo el nuevo
                for (String articulo:articulos){
                    out.print("<LI>"+articulo+"</LI>");
                    
                }
                // se agrega un link para regresar al inicio
                out.println("<br>");
                out.println("<a href='/EjemploCarritoCompras'>Regresar</a>");
            }
    }

}
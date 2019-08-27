package utileria;
import java.io.*;

public class Archivos {
    public static void crearArchivos(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se creo correctamente \n ");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);  
            salida.println();
            salida.println("Fin Escritura");
            salida.close();
            System.out.println("Se escribio correctamente al archivo");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while(lectura!=null){
                System.out.println("Lectura: "+lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            String contenido = "Anexando informacion al arhivo";
            salida.println(salida);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se anexo informacion al archivo\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

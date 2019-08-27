package manejoarchivosexternos;
import static utileria.Archivos.*;

/**
 *
 * @author Marcelo
 */
public class ManejoArchivosExternos {
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\Marcelo\\Desktop\\Programacion\\Java\\ManejoArchivosExternos\\pruebajava.txt";
    
    public static void main(String[] args) {
    //crear archivo
    crearArchivos(NOMBRE_ARCHIVO);
    //escribir archivo
    escribirArchivo(NOMBRE_ARCHIVO);
    //leer archivo
    leerArchivo(NOMBRE_ARCHIVO);
    //anexando info al arhivo
    anexarArchivo(NOMBRE_ARCHIVO);
    //leer otra vez
    //leerArchivo(NOMBRE_ARCHIVO);
        
    }
    
}

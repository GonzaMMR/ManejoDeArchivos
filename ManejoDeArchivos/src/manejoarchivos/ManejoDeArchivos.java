/*
*   NUESTRA CLASE MANEJO DE ARCHIVOS, VA A CONTENER LOS SIGUIENTES PUNTOS:
       - Como crear un archivo
       - Guardar la informacion en un archivo
       - Eliminar la informacion de un archivo
       - Eliminar un archivo
 */
package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {
    
    public static void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try{
            PrintWriter salida = new PrintWriter(archivo); 
            salida.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
}

/*
*   NUESTRA CLASE MANEJO DE ARCHIVOS, VA A CONTENER LOS SIGUIENTES PUNTOS:
       - Como crear un archivo
       - Guardar la informacion en un archivo
       - Eliminar la informacion de un archivo
       - Eliminar un archivo
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public static void escribirArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {//se que el fichero esxiste
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el archivo!!");
        } catch (FileNotFoundException ex) {//el fichero no existe -> excp
            ex.printStackTrace(System.out);
        } finally {//Este bloque siempre se ejecuta
            salida.close();
        }
    }
    
    public static void agregarArchivo(String nombre, String contenido){//Este metodo agrega texto en el archivo
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {
             salida = new PrintWriter(new FileWriter(nombre, true));
             salida.println(contenido);
        } catch (IOException ex) {
            
        }finally{
            salida.close();
        }
    }
    
    public static void leerArchivo(String nombre){
        BufferedReader entrada = null;
        //declaramos el fichero
        File archivo = new File (nombre);
        try {
            //creamos el descriptor de lectura del fichero
             entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            //recorremos lectura hasta el fin del fichero
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivoPorPalabra(String nombre){
        File archivo = new File(nombre);
        try {
            Scanner entrada = new Scanner(archivo);
            int cont =0;
            //recorro el fichero hasta fin
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont = cont + 1;
            }
            System.out.println("Numero de palabras en mi fichero = "+cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

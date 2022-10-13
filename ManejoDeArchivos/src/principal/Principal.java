/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import manejoarchivos.ManejoDeArchivos;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
        ManejoDeArchivos.escribirArchivo("prueba2.txt", "Hola, el barca para europa league, como vende humo la XAVINETA!!");
        ManejoDeArchivos.agregarArchivo("prueba2.txt", "Benzema va a ganar el balon de oro y messi no se lo va a poder robar");
        //ManejoDeArchivos.leerArchivo("prueba2.txt");
        ManejoDeArchivos.leerArchivoPorPalabra("prueba2.txt");
        
    }
    
    
    
}

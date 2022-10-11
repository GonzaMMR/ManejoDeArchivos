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
    }
    
}

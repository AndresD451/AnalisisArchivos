/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizisarchivos;

import java.io.File;

/**
 *
 * @author user
 */
public class ValidadorRuta {
    
    private ValidadorRuta(){
        
    }
    
    
    public static boolean noVacia (String ruta){
        return ruta != null && !ruta.trim().isEmpty();
    }
    
    
    public static boolean existe (String ruta){
        return new File(ruta).exists();
    }
    
    public static boolean esDirectorio (String ruta){
        return new File(ruta).isDirectory();
    }
    
    public static void validar (String ruta) throws RutaInvalidaException{
        if (ruta == null || ruta.trim().isEmpty()){
            throw new RutaInvalidaException ("La ruta no puede estar vacía"); 
        }
        if (!new File(ruta).exists()){
            throw new RutaInvalidaException ("La ruta no existe en el sistema correspondiente");
        }
    
        if (!new File(ruta).isDirectory()){
            throw new RutaInvalidaException ("La ruta corresponde a un archivo, no a una carpeta");
        }
    
    
    }
    
}

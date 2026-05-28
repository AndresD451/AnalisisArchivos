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
public class Contador {
    
    
    public ResultadoConteo analizar(File directorioRaiz){
        ResultadoConteo resultado = new ResultadoConteo();
        recorrerDirectorio(directorioRaiz,resultado);
        return resultado;        
    }
    
    
    private void recorrerDirectorio (File directorio, ResultadoConteo resultado){
        File[] contenido = directorio.listFiles();
        if (contenido == null) 
            return;
        
        for (File elemento : contenido){
            if (elemento.isDirectory()){
                recorrerDirectorio (elemento,resultado);
            }
            else if (elemento.isFile()){
                clasificarArchivo(elemento, resultado);
            }
        }
        
    }
        private void clasificarArchivo (File archivo, ResultadoConteo resultado){
            String ext = obtenerExtension (archivo.getName());
            
            switch (ext.toLowerCase()){
                case "txt":
                    resultado.incrementarTxt();
                    break;
                case "java":
                    resultado.incrementarJava();
                    break;
                case "pdf":
                    resultado.incrementarPdf();
                    break;
                default:
                    resultado.incrementarOtros();
                    break;
            }
        }
        
        
        private String obtenerExtension (String nombreArchivo){
            int pos = nombreArchivo.lastIndexOf('.');
            if (pos < 0 || pos == nombreArchivo.length() - 1)
                return "";
            return nombreArchivo.substring(pos + 1 );
        }
        
        
    }
    


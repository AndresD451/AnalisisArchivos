/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizisarchivos;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class BuscadorArchivos {
    public List<String> buscar (File directorioRaiz, String textoBusqueda){
    List <String> resultados = new ArrayList<>();
    buscar(directorioRaiz, textoBusqueda.toLowerCase(), resultados);
    return resultados;
    }
    
    private void buscar (File directorio, String textoBusqueda, List<String> resultados){
        File[] contenido = directorio.listFiles();
        if (contenido == null) return;
        for (File elemento: contenido){
            if (elemento.isDirectory()){
                buscar(elemento,textoBusqueda,resultados);
            }
            else if (elemento.isFile()){
                if (elemento.getName().toLowerCase().contains(textoBusqueda)){
                    resultados.add(elemento.getAbsolutePath());
                }
            }
        }
    }
    
    
    
}

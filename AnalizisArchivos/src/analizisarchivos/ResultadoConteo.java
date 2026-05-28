/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizisarchivos;

/**
 *
 * @author user
 */
public class ResultadoConteo {
    private int totalTxt;
    private int totalJava;
    private int totalPdf;
    private int totalOtros;
    
    public ResultadoConteo(){
       totalTxt = 0;
       totalJava = 0;
       totalPdf = 0;
       totalOtros = 0;
    }

public void incrementarTxt (){
    totalTxt++;
}

public void incrementarJava() {
    totalJava++;
}
    
public void incrementarPdf(){
    totalPdf++;
}

public void incrementarOtros(){
    totalOtros++;
}

    public int getTotalTxt() {
        return totalTxt;
    }

    public int getTotalJava() {
        return totalJava;
    }

    public int getTotalPdf() {
        return totalPdf;
    }

    public int getTotalOtros() {
        return totalOtros;
    }



    
    




}

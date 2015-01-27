/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.cap1;

/**
 *
 * @author ricar_000
 */
public class AplicacionImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero creamos un objeto de tipo Imc
        
        Imc bobby=new Imc();  // referencia = instancia
        float resultado = bobby.calcular(1.83f, 81);
        System.out.println("Tu IMC es: "+resultado);
        
    }
    
}

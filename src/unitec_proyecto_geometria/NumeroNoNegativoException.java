/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec_proyecto_geometria;

public class NumeroNoNegativoException extends Exception {
    
    public NumeroNoNegativoException() {
        super("Lo siento pero no puedo aceptar valores negativos.");
    }
}
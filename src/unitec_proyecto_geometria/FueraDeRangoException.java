/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec_proyecto_geometria;

/**
 *
 * @author ricar_000
 */
public class FueraDeRangoException extends Exception {
    
    public FueraDeRangoException(){
        super("Error, valor fuera de rango");
    }
}

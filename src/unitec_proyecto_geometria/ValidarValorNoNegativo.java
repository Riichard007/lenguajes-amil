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
public class ValidarValorNoNegativo {
    
    //static - palabra reservada que se le puede asignar a atributos o a métodos
    public static void validar(float valor) throws NumeroNoNegativoException{
        if (valor<0) throw new NumeroNoNegativoException();
    }
    
}

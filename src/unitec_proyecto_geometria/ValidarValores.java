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
public class ValidarValores {
    
    public static void validarValorNoNegativo(float valor)throws NumeroNoNegativoException{
        if(valor<0)throw new NumeroNoNegativoException();
}
public static void validarRango(float valor)throws FueraDeRangoException{
        if(valor>20 ||valor<10) throw new FueraDeRangoException();
}
    
}

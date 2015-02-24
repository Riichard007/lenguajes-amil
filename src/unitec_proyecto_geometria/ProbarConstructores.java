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
public class ProbarConstructores {   
    
    public static void main(String args[]) throws NumeroNoNegativoException, FueraDeRangoException{
        float f=45;
        double d2=45.2; //f para que se mantenga flotante y (float) para que se convierta en double y se recorte
        int i2=300;
        
        Cuadrado c=new Cuadrado((float)d2);
    }
    
}

/*
        chiquito
        b
        s
        i
        l
        grandote
        */
        
        /*byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        b=(byte)s;
        b=(byte)i;
        b=(byte)l;
        s=(short)i;
        s=(short)l; //casting explícito
        s=b;        //casting implícito
        i=(int)b;
        i=s;
        i=(int)l;
        l=b;
        l=s;
        l=i;
        */
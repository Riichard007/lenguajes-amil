/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.amil;

/**
 *
 * @author ricar_000
 */
import java.io.*;

public class Arreglos1 {
    
    public void tuNombre(int x[]){
        
    }
    
    public static void main (String args[]){
        int x[]=new int[3];
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //x[3]=12;
        int []y=new int [3];
        int z[]={1,-200,45};
        //int w=new int[];  INCORRECTO: le faltan los corchetes de la variable
        //int j[3]=new int[]; INCORRECTO: el tamaño del arreglo está mal posicionado
        //int m[4]=new int[4]; INCORRECTO: el tamaño del arreglo no debe ponerse dos veces
        //int []n={1,2.5,3}; INCORRECTO: no puede llevar valores double si el arreglo es int
        
        int a=2;
        float b=0;
        System.out.println(a/b);
        
        //Iterar
        /*for(int i=0; i<4; i++){
            System.out.println(x[i]);
        }*/
                
        System.out.println("Si ocurre la excepción nunca me verás!!");
                
        //ciclo for mejorado  --> (:) es iterar
        /*for(int algo:x){
            System.out.println(algo);
        }*/
    }
    
}

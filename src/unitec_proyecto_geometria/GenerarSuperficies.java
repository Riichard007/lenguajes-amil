package unitec_proyecto_geometria;

import java.util.*;

public class GenerarSuperficies {
    public static ArrayList<Superficies> obtenerFiguras() throws Exception{
        ArrayList<Superficies> figuritas = new ArrayList<Superficies>();
        
          //primero creamos cuadrados
        Cuadrado cua1 = new Cuadrado(12);
        Cuadrado cua2 = new Cuadrado(14);
        Cuadrado cua3 = new Cuadrado(13);
        
        //ahora creamos rectángulos
        rectangulo rec1 = new rectangulo(7,6);
                
        //ahora creamos los triángulos
        Triangulo tri1 = new Triangulo(7,4);
        Triangulo tri2= new Triangulo(6,3);
               
        //ahora creamos los círculos
        Circulo cir1 = new Circulo(7);
        Circulo cir2 = new Circulo(4);
        
        //agregarlos al ArrayList
        figuritas.add(cua1);
        figuritas.add(cua2);
        figuritas.add(cua3);
        figuritas.add(rec1);
        figuritas.add(tri1);
        figuritas.add(tri2);
        figuritas.add(cir1);
        figuritas.add(cir2);
        
        return figuritas;
    }
}
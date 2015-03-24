package ProyectoFinal;

import java.util.*;

public class ModeloGaleria {
    public static ArrayList <Galeria> generarGaleria () {
        ArrayList <Galeria> arreglo = new ArrayList <Galeria> ();
        Galeria g1 = new Galeria ("Cancún","Reposando en la sombra de una palmera","/ProyectoFinal/uno.jpg");
        Galeria g2 = new Galeria ("Bosque","Admirando los fríos colores del bosque","/ProyectoFinal/dos.jpg");
        Galeria g3 = new Galeria ("Ribiera Maya","Admirando el agua cristalina","/ProyectoFinal/tres.jpg");
        Galeria g4 = new Galeria ("Bosque pantanoso","Admirando la belleza de la naturaleza","/ProyectoFinal/cuatro.jpg");
        
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        arreglo.add(g4);
        
        return arreglo;
    }
}

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
public class Cuadrado {
    private float lado;
    
    /**
     * Éste constructor tiene un argument ode tipo flotante
     * @param lado El parámetro que debes ingresar es el valor del lado de tu cuadrado
     */
    
    //Éste constructor inicializa el atributo lado - PREGUNTA DE EXAMEN
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    //Éste es el constructor por defecto
    public Cuadrado(){
        
    }
    
    float calcularArea(){
        float area=lado*lado;
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
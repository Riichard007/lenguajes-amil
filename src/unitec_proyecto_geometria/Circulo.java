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
public class Circulo implements Superficies {
    
    private float radio;

    public Circulo() {
        
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea() {
        float area = 3.1416f * (radio*radio);
        return area;
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}

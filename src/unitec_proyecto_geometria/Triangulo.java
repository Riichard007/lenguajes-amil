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
public class Triangulo implements Superficies {
    
    private float base;
    private float altura;

    public Triangulo() {
    
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularArea() {
        float area = ((base*altura)/2);
        return area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
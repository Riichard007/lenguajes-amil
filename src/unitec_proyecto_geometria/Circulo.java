package unitec_proyecto_geometria;

public class Circulo implements Superficies {
    
    private float radio;
    
    public Circulo() {
        
    }
    
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea() {
        System.out.print("El área del círculo es: ");
        return 3.1416f * (radio * radio);
    }
    
    public float getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
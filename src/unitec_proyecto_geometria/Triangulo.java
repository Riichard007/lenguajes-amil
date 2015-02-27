package unitec_proyecto_geometria;

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
        System.out.print("El área del triángulo es: ");
        return ((base*altura)/2);
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
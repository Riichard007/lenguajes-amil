package unitec_proyecto_geometria;

public class Cuadrado implements Superficies {
    private float lado;
    
    /**
     * Éste constructor tiene un argument ode tipo flotante
     * @param lado El parámetro que debes ingresar es el valor del lado de tu cuadrado
     */
    
    //Éste constructor inicializa el atributo lado - PREGUNTA DE EXAMEN
    public Cuadrado(float lado) throws NumeroNoNegativoException, FueraDeRangoException{
        ValidarValores.validarValorNoNegativo(lado);
        ValidarValores.validarRango(lado);
        this.lado = lado;
        
    }
    
    //Éste es el constructor por defecto
    public Cuadrado(){
        
    }
    
    
    public float calcularArea(){
        System.out.print("El área del cuadrado es: ");
        return lado*lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException, FueraDeRangoException {
        ValidarValores.validarValorNoNegativo(lado);
        ValidarValores.validarRango(lado);
        this.lado = lado;
    }
 }
package octavo.java.cap1;

public class Imc {
    
    private float estatura;
    private float peso;
    
    // métodos de tipo SET, se usan cuando los atributos declarados sean privados
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }
    
    public float calcular(){        
        return peso/(estatura*estatura);    
    }    
}

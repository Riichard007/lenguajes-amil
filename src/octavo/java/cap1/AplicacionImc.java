package octavo.java.cap1;

public class AplicacionImc {

    public static void main(String[] args) {
        // Primero creamos un objeto de tipo Imc
        
        Imc bobby=new Imc();  // referencia = instancia
        bobby.setEstatura(1.82f);
        bobby.setPeso(82);
        System.out.println("Tu IMC es: " + bobby.calcular());
        
    }
    
}

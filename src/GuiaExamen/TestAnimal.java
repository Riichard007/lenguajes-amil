package GuiaExamen;

public class TestAnimal {

    public static void main(String[] args) {
        for (Animal a:GenerarAnimales.generarAnimales ()){
            System.out.println (a.getNombre());
            System.out.println (a.getEdad());
        }
    
    }
    
}

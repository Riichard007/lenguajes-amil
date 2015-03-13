package Threads;

public class ProbarThreads {

    public static void main(String[] args) {

        System.out.println("Prueba de Threads");

        //Paso 1: Crearlo
        Facil t1 = new Facil();
        Facil t11 = new Facil ();
        Regular r1 = new Regular();
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Soy un Thread moderno");
            }
        }
        );
        Relojito relojito1 = new Relojito();
        //t1.setName("Juana");

        //Paso 2: Inicializarlo
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        relojito1.start();

    }
}

package Threads;

public class Facil extends Thread {
    
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Soy un thread inutil");
            String nombre = Thread.currentThread().getName();
            System.out.println("Me llamo " + nombre);
        } catch (InterruptedException e) {
            
        }
    }
}

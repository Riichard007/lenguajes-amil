package Threads;

import java.util.*;

public class Relojito extends Thread {

    public void run() {
        while (true) {
            try {
                Calendar cal = Calendar.getInstance();
                int hora = cal.get(Calendar.HOUR_OF_DAY);
                int minuto = cal.get(Calendar.MINUTE);
                int segundo = cal.get(Calendar.SECOND);
                System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

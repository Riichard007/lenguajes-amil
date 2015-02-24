/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.amil;

/**
 *
 * @author ricar_000
 */
public class TestArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulo r=new rectangulo();
        r.setLadomayor(5);
        r.setLadomenor(2);
        System.out.println("El área es: " + r.calcularArea());
    }    
}
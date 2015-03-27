package Enumeraciones;

public class ProbarEnumeraciones {

    public static void main(String[] args) {
        MaquinaBuena maquina = new MaquinaBuena();
        maquina.setEstado(EstadoDeMaquina.TRABAJANDO);
        System.out.println("El estado actual de la máquina es: " + maquina.getEstado());
    }    
}
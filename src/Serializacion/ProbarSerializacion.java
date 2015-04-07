package Serializacion;

public class ProbarSerializacion {

    public static void main(String[] args) {
        //Creamos un usuario
        Usuario u = new Usuario();
        u.setEmail("mbricardo@live.com.mx");
        u.setNombre("Ricardo");
        u.setSueldo(500000);
        
        //Lo guardamos
        PersistenciaUsuario pu = new PersistenciaUsuario();
        try {
            pu.guardar (u);
            System.out.println("Usuario guardado con éxito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }    
}
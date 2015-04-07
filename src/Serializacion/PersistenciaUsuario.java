package Serializacion;

import java.io.*;

public class PersistenciaUsuario {
    public void guardar (Usuario u) throws Exception {
        // Paso 1
        File file = new File ("D:\\Yolo.amil");
        
        //Paso 2
        FileOutputStream fos = new FileOutputStream(file);
        
        //Paso 3: Llenarlo con algo, ese algo en éste caso es un usuario
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u); //es el método que lo guarda físicamente
        oos.close(); //método para cerrar archivo       
    }
    
    public Usuario leer() throws Exception{
            File file = new File ("D:\\Yolo.amil");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Usuario u = new Usuario(); //constructor por defecto
            u = (Usuario) ois.readObject();
            
            return u;
            
        }
}
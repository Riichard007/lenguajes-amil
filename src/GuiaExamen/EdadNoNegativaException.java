package GuiaExamen;

public class EdadNoNegativaException extends Exception {
    
    public EdadNoNegativaException () {
        super ("No se aceptan edades negativas");
    }
    
}

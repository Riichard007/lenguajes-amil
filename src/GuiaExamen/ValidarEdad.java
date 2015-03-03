package GuiaExamen;

public class ValidarEdad {
    public static void validar (int edad) throws EdadNoNegativaException {
        if (edad < 0) throw new EdadNoNegativaException();
    }
}

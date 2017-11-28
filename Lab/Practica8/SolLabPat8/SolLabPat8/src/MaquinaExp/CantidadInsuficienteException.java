package MaquinaExp;

/**
 * Excepción que indica que un producto se ha agotado.
 * @author Salvador Oton
 */
public class CantidadInsuficienteException extends Exception {
    
    /**
     * Constructor.
     */    
    public CantidadInsuficienteException() {
        super("Producto agotado.");
    }

    /**
     * Constructor.
     * @param txt Texto a mostrar en el mensaje de la excepción.
     */    
    public CantidadInsuficienteException(String txt) {
        super("Producto agotado: " + txt);
    }
}

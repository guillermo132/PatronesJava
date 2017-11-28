package MaquinaExp;

/**
 * Excepción que indica que un producto no está disponible.
 * @author Salvador Oton
 */
public class ProductoInexistenteException extends Exception {
    
    /**
     * Constructor.
     */
    public ProductoInexistenteException() {
        super("Producto no disponible.");
    }

    /**
     * Constructor.
     * @param txt Texto a mostrar en el mensaje de la excepción.
     */
    public ProductoInexistenteException(String txt) {
        super("Producto no disponible: " + txt);
    }    
}

package MaquinaExp;

/**
 * Excepción que indica que no se ha introducido suficiente dinero.
 * @author Salvador Oton
 */
public class DineroInsuficienteException extends Exception {

    /**
     * Constructor.
     */
    public DineroInsuficienteException() {
        super("Dinero insuficiente.");
    }

    /**
     * Constructor.
     * @param txt Texto a mostrar en el mensaje de la excepción.
     */
    public DineroInsuficienteException(String txt) {
        super("Dinero insuficiente: " + txt);
    }
}

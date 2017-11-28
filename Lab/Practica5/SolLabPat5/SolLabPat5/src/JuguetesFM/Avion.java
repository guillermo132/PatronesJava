package JuguetesFM;

/**
 * Producto concreto. Clase que representa un avión, que es un tipo de juguete. 
 */
public class Avion extends Juguete {

    /**
     * Constructor.
     * @param nombre Nombre del juguete.
     */
    public Avion(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        System.out.println("Acción asociada al encendido del Avión " + nombre);
    }

    @Override
    public void apagar() {
        System.out.println("Acción asociada al apagado del Avión " + nombre);
    }
}

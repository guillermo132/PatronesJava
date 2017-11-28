package JuguetesFM;

/**
 * Producto concreto. Clase que representa un coche, que es un tipo de juguete.  
 */
public class Coche extends Juguete {

    /**
     * Constructor.
     * @param nombre Nombre del juguete.
     */
    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        System.out.println("Acción asociada al encendido del Coche " + nombre);
    }

    @Override
    public void apagar() {
        System.out.println("Acción asociada al apagado del Coche " + nombre);
    }
}

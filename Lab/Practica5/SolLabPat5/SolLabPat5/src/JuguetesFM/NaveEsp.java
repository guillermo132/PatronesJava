package JuguetesFM;

/**
 * Producto concreto. Clase que representa una nave espacial, que es un tipo de juguete.  
 */
public class NaveEsp extends Juguete {

    /**
     * Constructor.
     * @param nombre Nombre del juguete.
     */    
    public NaveEsp(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        System.out.println("Acción asociada al encendido de la Nave Espacial " + nombre);
    }

    @Override
    public void apagar() {
        System.out.println("Acción asociada al apagado de la Nave Espacial " + nombre);
    }
}

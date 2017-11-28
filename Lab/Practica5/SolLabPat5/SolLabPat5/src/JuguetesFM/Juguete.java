package JuguetesFM;

/**
 * Producto. Clase abstracta que representa un juguete. 
 */
public abstract class Juguete {

    /**
     * Nombre del juquete.
     */
    String nombre = "";

    /**
     * Constructor.
     * @param nombre Nombre del juquete.
     */
    public Juguete(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Enciente un juquete.
     */
    public abstract void encender();

    /**
     * Apaga un juguete.
     */
    public abstract void apagar();
}

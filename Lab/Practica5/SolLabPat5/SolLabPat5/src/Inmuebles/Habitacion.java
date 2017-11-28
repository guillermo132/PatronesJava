package Inmuebles;

/**
 * Clase que representa una habitación. 
 */
public class Habitacion {
    /**
     * Nombre de la habitación.
     */
    private String nombre;

    /**
     * Constructor
     * @param nombre Nombre de la habitación.
     */
    public Habitacion(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre de la habitación.
     * @return Nombre de la habitación.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la habitación.
     * @param nombre Nombre de la habitación.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

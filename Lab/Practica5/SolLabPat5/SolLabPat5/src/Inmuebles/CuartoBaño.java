package Inmuebles;

/**
 * Clase que representa un cuarto de baño. 
 */
public class CuartoBaño {
    /**
     * Nombre del cuarto de baño.
     */
    private String nombre;

    /**
     * Constructor.
     * @param nombre Nombre del cuarto de baño.
     */
    public CuartoBaño(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del cuarto de baño.
     * @return Nombre del cuarto de baño.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cuarto de baño.
     * @param nombre Nombre del cuarto de baño.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

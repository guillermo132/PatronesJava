package Componentes;

/**
 * Componente de ordenador.
 * @author Salvador Oton
 */
public class Componente {

    private String nombre; // Nombre del componente.
    private double precio; // Precio del componente.

    /**
     * Constructor.
     * @param n Nombre del componente.
     * @param p Precio del componente.
     */
    public Componente(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }

    /**
     * Devuelve el nombre del componente.
     * @return Nombre del componente.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del componente.
     * @param nuevo Nombre del componente.
     */
    public void setNombre(String nuevo) {
        this.nombre = nuevo;
    }

    /**
     * Devuelve el precio del componente.
     * @return Precio del componente.
     */
    public double getPrecio() {
        return this.precio;
    }

    /**
     * Establece el precio del componente.
     * @param nuevo Precio del componente.
     */
    public void setPrecio(double nuevo) {
        this.precio = nuevo;
    }

    /**
     * Devuelve la descripción del componente.
     * @return Descripción del componente.
     */
    @Override
    public String toString() {
        return " *** " + nombre + " tiene un precio de " + precio + " *** ";
    }
}

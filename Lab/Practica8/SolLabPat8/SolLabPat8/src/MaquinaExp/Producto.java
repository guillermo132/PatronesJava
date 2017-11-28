package MaquinaExp;

/**
 * Clase que representa un producto.
 * @author Salvador Oton
 */
public class Producto {

    private String id; // Identificador del producto.
    private String nombre; // Nombre del producto.
    private int cantidad; // Cantidad de producto.
    private double precio; // Precio del producto.

    /**
     * Constructor.
     * @param id Identificador del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad de producto.
     */
    public Producto(String id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el identificador del producto.
     * @return Identificador del producto.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del producto.
     * @param id Identificador del producto.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre del producto.
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre Nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad de producto.
     * @return Cantidad de producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de producto.
     * @param cantidad Cantidad de producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el precio del producto.
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * @param precio Precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la descripción del producto.
     * @return Descripción del producto.
     */
    @Override
    public String toString() {
        return "# Nombre: " + this.nombre + " - precio: " + this.precio + " - cantidad: " + this.cantidad + " #";
    }
}

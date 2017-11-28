package Inmuebles;

/**
 * Constructor abstracto para inmuebles. 
 */
public abstract class InmuebleBuilder {
    /**
     * Producto a contruir.
     */
    protected Inmueble inmueble;
    
    /**
     * Devuelve el producto construido.
     * @return Inmueble construido.
     */
    public Inmueble getInmueble() {
        return inmueble;
    }
    
    /**
     * Inicializa el producto a construir.
     */
    public void diseñoNuevoInmueble() {
        inmueble = new Inmueble();
    }
    
    /**
     * Métodos para la construcción del producto.
     */
    public abstract void estableceSuperficie();
    public abstract void diseñarHabitaciones();
    public abstract void diseñarSalon();
    public abstract void diseñarCuartosBaño();
    public abstract void diseñarTerraza();
        
}

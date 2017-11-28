package Inmuebles;

/**
 * Director: Construye un objeto complejo Inmueble usando la clase abstracta InmuebleBuilder. 
 */
public class Arquitecto {

    /**
     * Clase abstracta para construir el producto.
     */
    private InmuebleBuilder inmuebleBuilder;

    /**
     * Estable el constructor concreto.
     * @param ib Constructor concreto.
     */
    public void setInmuebleBuilder(InmuebleBuilder ib) {
        inmuebleBuilder = ib;
    }

    /**
     * Devuelve el producto complejo creado.
     * @return producto Inmueble.
     */
    public Inmueble getInmueble() {
        return inmuebleBuilder.getInmueble();
    }

    /**
     * Construye el producto Inmueble paso a paso.
     */
    public void diseñarInmueble() {
        inmuebleBuilder.diseñoNuevoInmueble();
        inmuebleBuilder.estableceSuperficie();
        inmuebleBuilder.diseñarHabitaciones();
        inmuebleBuilder.diseñarSalon();
        inmuebleBuilder.diseñarCuartosBaño();
        inmuebleBuilder.diseñarTerraza();
    }
}

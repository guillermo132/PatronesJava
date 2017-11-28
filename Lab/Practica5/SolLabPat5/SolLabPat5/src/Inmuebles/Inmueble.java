package Inmuebles;

import java.util.ArrayList;

/**
 * Producto. Clase que representa un inmueble. 
 */
public class Inmueble {
    /**
     * Superficie del inmueble. 
     */
    private double superficie;
    /**
     * Lista de habitaciones del inmueble.
     */
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    /**
     * Lista de baños del inmueble.
     */
    private ArrayList<CuartoBaño> baños = new ArrayList<>();

    /**
     * Constructor.
     */
    public Inmueble() {
    }

    /**
     * Devuelve la superficie del inmueble.
     * @return Superficie del inmueble. 
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Establece la superficie del inmueble.
     * @param superficie Superficie del inmueble. 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }    

    /**
     * Devuelve la lista de habitaciones del inmueble.
     * @return Lista de habitaciones del inmueble.
     */
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    /**
     * Añade una habitación al inmueble.
     * @param habitacion Habitación a añadir al inmueble.
     */
    public void setHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    /**
     * Devuelve la lista de baños del inmueble.
     * @return Lista de baños del inmueble.
     */
    public ArrayList<CuartoBaño> getBaños() {
        return baños;
    }

    /**
     * Añade un baño al inmueble.
     * @param baño Baño a añadir al inmueble.
     */
    public void setBaño(CuartoBaño baño) {
        this.baños.add(baño);
    }

    /**
     * Devuelve la descripción del inmueble.
     * @return Cadena con la descripción del inmueble.
     */
    @Override
    public String toString() {
        return "Inmueble{" + "superficie=" + superficie + ", habitaciones=" + habitaciones.size()+ ", ba\u00f1os=" + baños.size() + '}';
    }   
    
}

package Componentes;

import java.util.Observable;
import java.util.Observer;

/**
 * Mantiene una referencia a un objeto SujetoConcreto
 * Implementa la interfaz Observer y define los métodos
 * para responder a los mensajes recibidos del sujeto.
 * @author Salvador Oton
 */
public class ObservadorConcreto implements Observer {

    private String nombre;			// Nombre del observador.
    private double precioCompra;                // Precio al que queremos comprar un componente.
    private SujetoConcreto sujeto;		// Sujeto al que observamos.

    /**
     * Constructor.
     * @param nombre Nombre del observador.
     * @param precio Precio al que queremos comprar un componente.
     * @param sujeto Sujeto al que observamos.
     */
    public ObservadorConcreto(String nombre, double precio, SujetoConcreto sujeto) {
        this.nombre = nombre;
        this.precioCompra = precio;
        sujeto.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        sujeto = (SujetoConcreto) obs;
        double p = sujeto.getComponente().getPrecio();
        String res = "Actualizando con precio a: " + p + ", y precio de compra <= a: " + precioCompra;

        if (p <= precioCompra) {
            res += "\nEl observador " + nombre +
                    " ha comprado el componente: " + sujeto.getComponente().toString();
            sujeto.deleteObserver(this);
        } else {
            res += "\nEl observador " + nombre + " no compra el componente.";
        }
        System.out.println(res);
    }
}

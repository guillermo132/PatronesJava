package Componentes;

import java.util.Observer;

/**
 * Prueba patrón Observer java.
 * @author Salvador Oton
 */
public class PruebaPatron {

    public static void main(String args[]) {
        try {
            // Componente.
            Componente c1 = new Componente("CPU", 180);

            // Sujeto para monitorizar el componente.
            SujetoConcreto sujeto = new SujetoConcreto();
            sujeto.setComponente(c1);

            // Observadores.
            Observer o1 = new ObservadorConcreto("o1", 155, sujeto);
            Observer o2 = new ObservadorConcreto("o2", 170, sujeto);

            // Notificamos a los observadores para que actualicen.
            System.out.println("Notificamos...");
            sujeto.cambiaPrecio(165); // Cambiamos el precio.

            System.out.println("Notificamos...");
            sujeto.cambiaPrecio(150); // Cambiamos el precio.
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}

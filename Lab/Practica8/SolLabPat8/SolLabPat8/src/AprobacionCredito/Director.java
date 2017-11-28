package AprobacionCredito;

/**
 * Manejador concreto para la aprobación del crédito
 * @author Salvador Oton
 */
public class Director extends Aprobador {

    @Override
    public void solicitudPrestamo(double cantidad) {
        System.out.println("\tDirector");
        if (cantidad > 100000) {
            System.out.println("El Director gestiona el crédito");
        } else if (super.getSucesor() != null) {
            getSucesor().solicitudPrestamo(cantidad);
        }
    }
}

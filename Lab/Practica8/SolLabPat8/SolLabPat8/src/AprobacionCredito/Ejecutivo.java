package AprobacionCredito;

/**
 * Manejador concreto para la aprobación del crédito
 * @author Salvador Oton
 */
public class Ejecutivo extends Aprobador {

    @Override
    public void solicitudPrestamo(double cantidad) {
        System.out.println("\tEjecutivo");
        if (cantidad <= 10000) {
            System.out.println("El Ejecutivo gestiona el crédito");
        } else if (super.getSucesor() != null) {
            getSucesor().solicitudPrestamo(cantidad);
        }
    }
}

package AprobacionCredito;

/**
 * Manejador concreto para la aprobación del crédito
 * @author Salvador Oton
 */
public class LiderInmediatoEjecutivo extends Aprobador {

    @Override
    public void solicitudPrestamo(double cantidad) {
        System.out.println("\tLider inmediato del ejecutivo");
        if (cantidad > 10000 && cantidad <=50000) {
            System.out.println("El Lider inmediato del ejecutivo gestiona el crédito");
        } else if (super.getSucesor() != null) {
            getSucesor().solicitudPrestamo(cantidad);
        }
    }
}
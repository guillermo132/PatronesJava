package AprobacionCredito;

/**
 * Manejador concreto para la aprobación del crédito
 * @author Salvador Oton
 */
public class Gerente extends Aprobador {

    @Override
    public void solicitudPrestamo(double cantidad) {
        System.out.println("\tGerente");
        if (cantidad > 50000 && cantidad <=100000) {
            System.out.println("El Gerente gestiona el crédito");
        } else if (super.getSucesor() != null) {
            getSucesor().solicitudPrestamo(cantidad);
        }
    }
}

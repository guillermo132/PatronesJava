package AgenciaViajes;

/**
 * Clase PaqueteB, extiende de Viaje.
 * @author Salvador Oton
 */
public class PaqueteB extends Viaje{

    @Override
    public void hacerTrasladoIda() {
        System.out.println("Los turistas hacen el traslado de ida en tren.");
    }

    @Override
    public void hacerVisitasDia1() {
        System.out.println("Los turistas visitan la montaña.");
    }

    @Override
    public void hacerVisitasDia2() {
        System.out.println("Los turistas van a la playa.");
    }

    @Override
    public void hacerVisitasDia3() {
        System.out.println("Los turistas visitan el zoo.");
    }

    @Override
    public void hacerTrasladoVuelta() {
        System.out.println("Los turistas hacen el traslado de vuelta en tren.");
    }
}

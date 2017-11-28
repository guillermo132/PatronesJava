package AgenciaViajes;

/**
 * Clase PaqueteA, extiende de Viaje.
 * @author Salvador Oton
 */
public class PaqueteA extends Viaje{

    @Override
    public void hacerTrasladoIda() {
        System.out.println("Los turistas hacen el traslado de ida en avión.");
    }

    @Override
    public void hacerVisitasDia1() {
        System.out.println("Los turistas visitan el acuario.");
    }

    @Override
    public void hacerVisitasDia2() {
        System.out.println("Los turistas van a la playa.");
    }

    @Override
    public void hacerVisitasDia3() {
        System.out.println("Los turistas visitan a la montaña.");
    }

    @Override
    public void hacerTrasladoVuelta() {
        System.out.println("Los turistas hacen el traslado de vuelta en avión.");
    }
}

package AgenciaViajes;

/**
 * Clase abstracta Viaje.
 * @author Salvador Oton
 */
public abstract class Viaje {

    /**
     * Método Plantilla. Llama al método concreto de cada clase.
     */
    public final void hacerViaje() {
        hacerTrasladoIda();
        hacerVisitasDia1();
        hacerVisitasDia2();
        hacerVisitasDia3();
        hacerTrasladoVuelta();
    }

    // Métodos abstractos.
    public abstract void hacerTrasladoIda();

    public abstract void hacerVisitasDia1();

    public abstract void hacerVisitasDia2();

    public abstract void hacerVisitasDia3();

    public abstract void hacerTrasladoVuelta();
}

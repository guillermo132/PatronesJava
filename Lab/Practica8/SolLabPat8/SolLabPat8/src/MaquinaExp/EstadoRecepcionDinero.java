package MaquinaExp;

/**
 * Estado concreto: Implementa la interfaz Estado. 
 * Implementa el comportamiento específico de un estado.
 * @author Salvador Oton
 */
public class EstadoRecepcionDinero implements Estado {

    @Override
    public void ejecutar(MaquinaExpendedora maquinaExpendedora) {
        //añade dinero a la máquina expendedora
        maquinaExpendedora.actualizaDineroDisponible(maquinaExpendedora.getDineroIntroducido());
        System.out.println("Se ha inducido: " + maquinaExpendedora.getDineroIntroducido()
                + "€. Dinero disponible en la máquina: " + maquinaExpendedora.getDineroDisponible() + "€");
    }
}

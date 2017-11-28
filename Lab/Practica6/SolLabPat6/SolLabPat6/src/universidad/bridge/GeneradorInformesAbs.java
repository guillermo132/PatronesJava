package universidad.bridge;

import java.util.Collection;
import universidad.Personal;

/**
 * Abstracción: Define la interfaz de la abstracción y mantiene una referencia al objeto Implementador. 
 */
public class GeneradorInformesAbs {

    //Referencia al implementador concreto.
    private GeneradorInformesImp implementador;

    /**
     * Devuelve informe.
     * @param personal Colección de personal de la universidad.
     * @return Cadena con informe.
     */ 
    public String getInforme(Collection<Personal> personal) {
        return implementador.generaInforme(personal);
    }
    
    /**
     * Establece un implementador concreto.
     * @param implementador 
     */
    public void setImplementador(GeneradorInformesImp implementador){
        this.implementador=implementador;
    }
}

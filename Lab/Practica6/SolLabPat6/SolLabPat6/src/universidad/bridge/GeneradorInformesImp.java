package universidad.bridge;

import java.util.Collection;
import universidad.Personal;

/**
 * Implementador: define la interfaz de las clases de implementación. 
 */
public interface GeneradorInformesImp {
    public String generaInforme(Collection <Personal> personal);
}

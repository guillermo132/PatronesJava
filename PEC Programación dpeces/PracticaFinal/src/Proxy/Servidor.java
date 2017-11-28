
package Proxy;

import Clases.Candidato;
import java.io.IOException;

/**
 *
 * @author ivanparrillalopez
 */
public interface Servidor {
    public void imprimir(Candidato o) throws IOException;
}

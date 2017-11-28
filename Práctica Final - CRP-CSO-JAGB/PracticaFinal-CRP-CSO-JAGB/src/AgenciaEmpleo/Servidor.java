/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Servidor - Patrón Proxy 
 */
package AgenciaEmpleo;

import java.io.IOException;

/**
 * Sujeto: Define la interfaz común para el Proxy y el SujetoReal de forma que se pueda usar un Proxy donde se espere un SujetoReal. 
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public interface Servidor {

    /**
     * imprime la oferta en un fichero
     * @param o
     * @throws IOException
     */
    public void imprimir(Oferta o) throws IOException;
}

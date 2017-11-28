/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Copiable : Patron Prototype
 */
package AgenciaEmpleo;

/**
 * Interfaz Copiable para el patron prototype - Genera candidatos
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */

/**
 * Prototipo. Interfaz con el método de copia. 
 */
public interface Copiable {

    /**
     * Motodo de copia.
     * @return Objeto copiado.
     */
    public Object copia();
}

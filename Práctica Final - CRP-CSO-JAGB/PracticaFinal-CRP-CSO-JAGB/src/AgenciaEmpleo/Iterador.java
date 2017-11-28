/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Iterador : Patron Iterator
 */
package AgenciaEmpleo;

/**
 * Iterador: Interfaz en la que se definen los métodos de iteración. 
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public interface Iterador {

    /**
     * Devuelve el primer elemento de la lista.
     * @return Primer elemento de la lista.
     * @throws IndexOutOfBoundsException 
     */
    Object primero() throws IndexOutOfBoundsException;

    /**
     * Devuelve el siguiente elemento de la lista.
     * @return Siguiente elemento de la lista.
     * @throws IndexOutOfBoundsException 
     */
    Object siguiente() throws IndexOutOfBoundsException;

     /**
     * Devuelve el elemento anterior de la lista.
     * @return Elemento anterior de la lista.
     * @throws IndexOutOfBoundsException 
     */
    Object anterior() throws IndexOutOfBoundsException;
    /**
     * Devuelve true si hay más elementos en la lista y false en caso contrario.
     * @return true si hay más elementos en la lista, false en caso contrario.
     */
    boolean hayMas();

    /**
     * Devuelve true si hay elementos anteriores en la lista y false en caso contrario.
     * @return true si hay elemento anterior en la lista, false en caso contrario.
     */
    boolean hayAnterior();
    /**
     * Devuelve el elemento actual de la lista.
     * @return Primer elemento actual de la lista.
     * @throws IndexOutOfBoundsException 
     */
    Object elementoActual() throws IndexOutOfBoundsException;
}

/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Agregado: Patrón Iterator
 */
package AgenciaEmpleo;

/**
 * Agregado: Interfaz que define el método de fabricación para crear un iterador.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public interface Agregado {

    /**
     * Método de fabricación para crear un iterador.
     * @return Iterador concreto.
     */
    Iterador crearIterador();
}

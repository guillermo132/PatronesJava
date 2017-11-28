/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase AgregadoConcreto: Patrón Iterator
 */
package AgenciaEmpleo;


/**
 * AgregadoConcreto: Implementa la interfaz Agregado y crea los iteradores concretos según se necesiten.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class AgregadoConcreto implements Agregado {

    // Lista de elementos a recorrer.
    public Object[] elementos;

    /**
     * Constructor.
     * @param vec Lista de elementos a recorrer.
     */
    public AgregadoConcreto(Object[] vec) {
        elementos = vec;
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorConcreto(this);
    }
}

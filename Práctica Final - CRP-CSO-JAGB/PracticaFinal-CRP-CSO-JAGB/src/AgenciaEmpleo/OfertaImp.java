/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase OfertaImp - Patrón Bridge
 */
package AgenciaEmpleo;

/**
 * Implementador. Clase general para manejar las ofertas de empleo.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public abstract class OfertaImp {

    /**
     * Ordena las ofertas de empleo por el criterio indicado.
     * @param of 
     * @return Cadena con las ofertas ordenadas.
     */
    public abstract boolean ordena(Oferta of);
    
}

/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Estado : Patron State
 */
package AgenciaEmpleo;

import AgenciaSwing.BusquedaCandidatoParaOferta;

/**
 * Interfaz que define los métodos que dependen del estado del objeto.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public interface Estado {
    
    public void ejecutar(Oferta t,BusquedaCandidatoParaOferta ventana);
}

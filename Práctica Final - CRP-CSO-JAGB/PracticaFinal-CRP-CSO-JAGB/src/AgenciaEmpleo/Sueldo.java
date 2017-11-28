/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Sueldo - Patrón Adapter 
 */
package AgenciaEmpleo;

import java.io.IOException;

/**
 * Interfaz Sueldo utilizada para el patron Adapter
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public interface Sueldo{
    
    /**
     * Metodo para generar el sueldo neto
     */
    public String getSueldoNeto();
    
}

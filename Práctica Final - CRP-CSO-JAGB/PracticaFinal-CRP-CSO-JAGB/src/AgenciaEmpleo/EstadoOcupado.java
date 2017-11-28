/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase EstadoOcupado : Patron State
 */
package AgenciaEmpleo;

import AgenciaSwing.BusquedaCandidatoParaOferta;
import java.io.Serializable;

/**
 * Estado concreto: Implementa la interfaz Estado. 
 * Implementa el comportamiento específico de un estado.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class EstadoOcupado implements Estado, Serializable{

    /**
     * Método ejecutar: Cambia el estado de la oferta
     * @param t 
     * @param ventana
     */    
    @Override
    public void ejecutar(Oferta t,BusquedaCandidatoParaOferta ventana) {
        
        ventana.anularText();
        
        
    }
    
}

/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase OfertaImpCno - Patrón Bridge
 */
package AgenciaEmpleo;

import static AgenciaEmpleo.UtilSistema.candiCasan;
import static AgenciaEmpleo.UtilSistema.candidatos;

/**
 * Implementa la interfaz OfertasImp y define su implementación concreta.   
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class OfertaImpCno extends OfertaImp{

    @Override
    public boolean ordena(Oferta of) {
    for (int i = 0; i < candidatos.size(); i++) {//Numero de candidatos
            for (int j = 0; j < candidatos.get(i).getCno().size(); j++) {//Numero de ocupaciones de un candidato
                if (of.getOcupacion().equals(candidatos.get(i).getCno().get(j)) && (UtilSistema.compararDatos(candidatos.get(i), of))) {
                    if (!candiCasan.contains(candidatos.get(i))) {
                        candiCasan.add(candidatos.get(i));
                           of.setEstadoActual(new EstadoOcupado());//Si la ocupacion de la oferta es igual a la del candidato 
                           
                    }                                         //y el rango es verdadero se aÃ±ade el candidato a un array de candidatos que casan
                }
            }
        }
        //Si candidatos que casan esta vacio devuelve falso
        if (candiCasan.isEmpty()) {
            return false;

        } else {//Si hay alguna coincidencia es verdadero
            return true;
        }
    }
    
}

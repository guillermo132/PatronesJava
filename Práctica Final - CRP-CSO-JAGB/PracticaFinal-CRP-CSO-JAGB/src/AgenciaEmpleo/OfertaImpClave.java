/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase OfertaImpClave - Patrón Bridge
 */
package AgenciaEmpleo;

import static AgenciaEmpleo.UtilSistema.candiCasan;
import static AgenciaEmpleo.UtilSistema.candidatos;

/**
 * Implementa la interfaz OfertasImp y define su implementación concreta.   
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class OfertaImpClave extends OfertaImp{

    @Override
    public boolean ordena(Oferta of) {
        for (int i = 0; i < of.getClaves().length; i++) {//Numero de claves de la oferta
            for (int j = 0; j < candidatos.size(); j++) {//Numero de claves del candidato
                for (int k = 0; k < candidatos.get(j).getClaves().length; k++) {
                    if (of.getClaves()[i].equals(candidatos.get(j).getClaves()[k]) && (UtilSistema.compararDatos(candidatos.get(j), of))) {
                        if (!candiCasan.contains(candidatos.get(j))) {
                            candiCasan.add(candidatos.get(j));//Si las claves son iguales y el rango es verdadero 
                            of.setEstadoActual(new EstadoOcupado());
                                                          //Lo aÃ±ade a un array de candidatos que casan
                    }

                }

            }
        }
        }
        //Si el array esta vacio, claramente devuelve falso
        if (candiCasan.isEmpty()) {
            return false;
        } else {//Si no devuelve verdadero
            return true;
        }
    }
    
}

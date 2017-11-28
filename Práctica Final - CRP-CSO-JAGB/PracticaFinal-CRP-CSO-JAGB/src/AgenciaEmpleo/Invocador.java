/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Invocador : Patron Command
 */
package AgenciaEmpleo;

/**
 * Invocador: El que llama al método ejecutar del objeto Comando.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class Invocador {
    
    //Comando al que le pediremos que ejecute la petición.
    private Comando comando;

    /**
     * Establece el comando.
     * @param comando 
     */
    public void setComando(Comando comando) {
        this.comando = comando;
    }

    /**
     * Ejecuta el comando.
     * @param param 
     */
    public void ejecutaComando(Candidato param) {
        comando.ejecutar(param);
    }
    
    public void ejecutaComando(Oferta of){
    comando.ejecutar(of);
    }

    /**
     * Deshace el comando.
     */
    public void deshacerComando() {
        comando.deshacer();
    }

    /**
     * Rehace el comando.
     */
    public void rehacerComando() {
        comando.rehacer();
    }
}

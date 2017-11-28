/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase Comando : Patron Command
 */
package AgenciaEmpleo;

/**
 * Interfaz comando. Modela el comportamiento genérico de los comandos.
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public interface Comando {

    /**
     * Metodos get y set de Candidato y Oferta
     *
     * @return 
     */
    public void setCandidato(Candidato can);

    public void setOferta(Oferta t);
    
    public Candidato getCandidato();
    
    public Oferta getOferta();

    /**
     * Métodos del patrón Command
     *
     * @return 
     */
    public void ejecutar(Candidato can);

    public void ejecutar(Oferta of);
    
    public void deshacer();

    public void rehacer();
}

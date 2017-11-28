/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase ComandoModificar : Patron Command
 */
package AgenciaEmpleo;

/**
 * Implementa Comando
 * ComandoModificar: Modifica los datos de los candidatos y ofertas
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class ComandoModificar implements Comando{
    
    private Candidato candidato;
    private Candidato nuevo;           
    private Candidato antiguo;	

    @Override
    public void setCandidato(Candidato can) {
        this.candidato = can;
    }

    @Override
    public Candidato getCandidato() {
         return this.candidato;
    }

    /**
     * Modifica los datos del candidato
     * @param can Nuevo candidato 
     */ 
    @Override
    public void ejecutar(Candidato can) {
        UtilSistema.candidatos.remove(candidato);
        antiguo = candidato;
        nuevo = can;
        setCandidato(can);
        UtilSistema.candidatos.add(can);
            
    }

    /**
     * Recupera los datos del candidato antes del cambio
     */
    @Override
    public void deshacer() {
        setCandidato(antiguo);
        
    }

    /**
     * Recuperalos datos del candidato
     */
    @Override
    public void rehacer() {
        setCandidato(nuevo);
        
    }

    @Override
    public void setOferta(Oferta t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Oferta getOferta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutar(Oferta of) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

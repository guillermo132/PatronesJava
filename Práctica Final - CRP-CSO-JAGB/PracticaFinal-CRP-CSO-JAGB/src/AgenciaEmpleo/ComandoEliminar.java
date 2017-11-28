/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase ComandoEliminar : Patron Command
 */
package AgenciaEmpleo;

/**
 * Implementa Comando
 * ComandoEliminar: Elimina los candidatos y las ofertas
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class ComandoEliminar implements Comando{
    
    private Candidato candidato;
    private Candidato nuevo;           
    // Candidato antiguo
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
     * Elimina al candidato
     * @param can Nuevo candidato 
     */ 
    @Override
    public void ejecutar(Candidato can) {
     UtilSistema.candidatos.remove(can);
        antiguo = can;
        nuevo = can;
        setCandidato(can);
    }

    /**
     * Recupera el candidato
     */
    @Override
    public void deshacer() {
        setCandidato(antiguo);
    }

    /**
     * Recupera al candidato
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

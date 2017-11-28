/**Práctica Final Patrones de Software 2015/2016
 * Agencia de Busqueda de Empleo
 *Alumnos: Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 * Clase ComandoModificarOferta : Patron Command
 */
package AgenciaEmpleo;

/**
 * Implementa Comando
 * @author Cristina Sáez Ortega - Claudia Rodriguez Peinado - Jose Andrés Guerra Bermejo
 */
public class ComandoModificarOferta implements Comando{
    
    private Oferta oferta;
    private Oferta nuevo;            
    private Oferta antiguo;	


    @Override
    public Oferta getOferta() {
        return this.oferta;
    }

    @Override
    public void setOferta(Oferta t) {
        this.oferta = t;
    }

    @Override
    public void ejecutar(Oferta t){
    UtilSistema.ofertas.remove(oferta);
        antiguo = oferta;
        nuevo = t;
        setOferta(t);
        UtilSistema.ofertas.add(t);
    }

    @Override
    public void ejecutar(Candidato can) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void deshacer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rehacer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public void setCandidato(Candidato can) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Candidato getCandidato() {
  throw new UnsupportedOperationException("Not supported yet.");
    }
}
